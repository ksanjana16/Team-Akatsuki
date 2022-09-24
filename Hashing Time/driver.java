import java.util.*;
public class driver
{
    public static void main(String arrgs[])
    {
        
        Scanner sc = new Scanner(System.in);
        int n;
        int val,index;
        long start,end;
        double sec;
        System.out.println("Enter the value of n : ");
        n = sc.nextInt();
        int inputarr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            inputarr[i] = (int)(Math.random()*(1000-0+1)+0);
        }
        System.out.println("Binary Probing");
        start = System.currentTimeMillis();
        Binary_Probing bp = new Binary_Probing(n);
        for(int i = 0;i<n;i++)
        {
            val = inputarr[i];
            index = val % n;
            bp.insert(val,index);
        }
        end = System.currentTimeMillis();
        //bp.display();
        sec = (end - start) / 1000F;
        System.out.println(sec + " seconds");
                System.out.println("Linear Probing");
        Linear_Probing lp = new Linear_Probing(n);
        start = System.currentTimeMillis();
        for(int i = 0;i<n;i++)
        {
            val = inputarr[i];
            index = val % n;
            lp.insert(val,index);
        }
        end = System.currentTimeMillis();
        //lp.display();
        sec = (end-start) / 1000F;
        System.out.println(sec + " seconds");
        Quadratic_Probing qp = new Quadratic_Probing(n);
        System.out.println("Quadratic Probing");
        start = System.currentTimeMillis();
        for(int i = 0;i<n;i++)
        {
            val = inputarr[i];
            index = val % n;
            qp.insert(val,index);
        }
        
        end = System.currentTimeMillis();
        //qp.display();
        sec = (end - start) / 1000F; System.out.println(sec + " seconds");
        
        double_hashing dh = new double_hashing(n);
        System.out.println("Double Hashing");
        start = System.currentTimeMillis();
        for(int i = 0;i<n;i++)
        {
            val = inputarr[i];
            dh.insert(val);
        }
        end = System.currentTimeMillis();
        //dh.display();
        sec = (end - start) / 1000F; 
        System.out.println(sec + " seconds");
      
        
    }
}