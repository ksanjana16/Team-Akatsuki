class double_hashing
{
    int n;
    int mid;
    int arr[];
    double_hashing(int n1)
    {
        n = n1;
        mid = (int)n / 2;
        arr = new int[n];
    }
    void insert(int val)
    {
        int i = 0;
        int sq = (int)Math.pow(n,2);
        int h1 = val % n;
        while(i != h1)
        {
            h1 = val % n;
            int h2 = mid - (h1 % mid);
            int index = (h1 + (i*h2)) % n;
            if(arr[index] == 0)
            {
                arr[index] = val;
                return;
            }
            i += 1;
        }
        linear_prob(val);
        return;
    }
        public void linear_prob(int val)
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