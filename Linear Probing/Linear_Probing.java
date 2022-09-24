public class Linear_Probing
{
    private int n;
    int arr[];
    public Linear_Probing(int n1)
    {
        n = n1;
        arr = new int[n];
    }
    public void insert(int val,int index)
    {
        if(arr[index] == 0)
        arr[index] = val;
        else
        {
        prober(val);
        }
    }
    public void prober(int val)
    {
        for(int i = 0;i<n;i++)
        {
            if(arr[i] == 0)
            {
                arr[i] = val;
                return;
            }
        }
    }
    public void display()
    {
        for(int i = 0;i<n;i++)
        System.out.print(arr[i] + " ");
        System.out.println();
    }
}