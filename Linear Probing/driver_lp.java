import java.util.*;
import java.io.*;
import java.io.IOException;
public class driver_lp
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,val,index;
        long start,end;
        double sec;
        String time;
        try{
            FileOutputStream w = new FileOutputStream("Prober_lp.txt");
            String s = "Linear Probing\n";
            byte b[] = s.getBytes();
            w.write(b);
        for(n = 1000; n<=100000;n+=1000)
        {
        int inputarr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            inputarr[i] = (int)(Math.random()*(1000-0+1)+0);
        }
        start = System.currentTimeMillis();
        Linear_Probing bp = new Linear_Probing(n);
        for(int i = 0;i<n;i++)
        {
            val = inputarr[i];
            index = val % n;
            bp.insert(val,index);
        }
        end = System.currentTimeMillis();
        sec = (end - start) / 1000F;
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