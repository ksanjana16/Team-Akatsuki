class Quadratic_Probing
{
    private int n;
    int arr[];
    Quadratic_Probing(int n)
    {
        this.n = n;
        arr = new int[n];
    }
    void insert(int val,int index)
    {
        if(arr[index] == 0)
        {
        arr[index] = val;
        }
        else
        {
        prober(val,index);
        }
        return;
    }
    void prober(int val,int index)
    {
        int i = 0;
        int j = 0;
        while(i != index)
        {
            j = (index+(i*i)) % n;
            //System.out.println(val+" "+j);
            if(arr[j] != 0)
            {
                i = i + 1;
            }
            else
            {
                arr[j] = val;
                return;
            }
        }
        linear_prob(val);
        return;
    }
    void linear_prob(int val)
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