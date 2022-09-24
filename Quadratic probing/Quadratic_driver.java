import java.util.*;
import java.io.*;
import java.io.IOException;
public class Quadratic_driver
{
    public static void main(String arrgs[])
    {
        Scanner sc = new Scanner(System.in);
        int n,val,index;
        long start,end;
        double sec;
        String time;
        try{
            FileOutputStream w = new FileOutputStream("Quadratic_Prober.txt");
            
        
        String s = "\nQuadratic_Probing\n";
        byte []b = s.getBytes();
        w.write(b);
    for(n = 1000; n<=100000;n+=1000)
    {
        int inputarr[] = new int[n];
        Quadratic_Probing qp = new Quadratic_Probing(n);        
        for(int i = 0;i<n;i++)
        {
            inputarr[i] = (int)(Math.random()*(1000-0+1)+0);
        }
        start = System.currentTimeMillis();
        for(int i = 0;i<n;i++)
        {
            val = inputarr[i];
            index = val % n;
            qp.insert(val,index);
        }
        end = System.currentTimeMillis();
        sec = (end-start) / 1000F;
        time = Double.toString(sec);
        time = time + "\t";
        b = time.getBytes();
        w.write(b);
    }
    
       
    s = "\nDone";
    b = s.getBytes();
    w.write(b);
    w.close();
            }
            catch(IOException e)
            {
                System.out.println("An error occured.");
            }
        
        
    }
}