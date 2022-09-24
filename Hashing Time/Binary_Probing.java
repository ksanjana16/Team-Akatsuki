        public class Binary_Probing
{
     private int n,front,rear;
     int queue[];
     int queue1[];
     int arr[];
     public Binary_Probing(int n1)
     {
         n = n1;
         front = 0;
         rear = -1;
         arr = new int[n];
         queue = new int[n];
         queue1 = new int[n];
         resolver(0,n-1);
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
         while(front != n)
         {
             if(arr[front] == 0)
             {
                 arr[front] = val;
                 front++;
                 return;
             }
             else
             front++;
         }
         System.out.println("The array table is full.");
     }
     public void resolver(int low,int high)
     {
         if(low <= high && rear != n)
         {
             int mid = (low+high)/2;
             queue[rear += 1] = mid;
             resolver(low,mid-1);
             resolver(mid+1,high);
         }
         /*
         int val = 0;
         int stack[] = new int[n];
         int top = -1;
         top++;
         int low_high[][] = new int[n][2];
         int mid = (low+high)/2;
         low_high[mid][0] = low;
         low_high[mid][1] = high;
         stack[top] = mid;
         while(top != -1)
         {
             val = stack[top--];
             queue[rear += 1] = val;
             low = val + 1;
             high = low_high[val][1];
             if(low <= high)
             {                
                 mid = (low+high)/2;
                 low_high[mid][0] = low;
                 low_high[mid][1] = high;
                 top++;
                 stack[top] = mid;
             }
             low = low_high[val][0];
             high = val - 1;
             if(low <= high)
             {
                 mid = (low+high)/2;
                 low_high[mid][0] = low;
                 low_high[mid][1] = high;
                 top++;
                 stack[top] = mid;
             }
             
         }*/
         
         return;
     }
     public void display()
     {
        for(int i = 0;i<n;i++)
        System.out.print(arr[i] + " ");
        System.out.println();
     }
}