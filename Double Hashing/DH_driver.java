import java.util.*;
import java.io.*;
import java.io.IOException;
public class DH_driver
{
    public static void main(String arrgs[])
    {
        Scanner sc = new Scanner(System.in);
        int n,val,index;
        long start,end;
        double sec;
        String time;
        try{
            FileOutputStream w = new FileOutputStream("DH_Prober.txt");
            
        String s = "\nDouble_Hashing\n";
        byte b[]= s.getBytes();
        w.write(b);
    for(n = 1000; n<=100000;n+=1000)
    {
        int inputarr[] = new int[n];
        double_hashing dh = new double_hashing(n);        
        for(int i = 0;i<n;i++)
        {
            inputarr[i] = (int)(Math.random()*(1000-0+1)+0);
        }
        start = System.currentTimeMillis();
        for(int i = 0;i<n;i++)
        {
            val = inputarr[i];
            dh.insert(val);
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