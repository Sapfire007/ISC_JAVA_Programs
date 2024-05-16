class Composite
{
    int arr[][];
    int m;
    int n;
    Composite(int mm, int nn)
    {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }
    
    int isComposite(int p)
    {
        int count = 0;
      for (int i = 1; i <= p; i++)
      {
        if (p%i==0)
        count++;
      }
       if (count>2)
       return 1;
       else
       return 0;
    }
    
    void fill()
    {
        int num = 4;
       for (int j = 0; j<n ; j++)
       {
           for (int i = 0; i<m ; )
           {
            if (isComposite(num) == 1 )   
            {
              arr[i][j] = num;
              i++;
            }
            num++;
           }
           
       }
    }
    
    void display()
    {
        System.out.println("Your desired array is : ");
        for (int i = 0; i<m ; i++)
       {
           for (int j = 0; j<n ; j++)
           {
               System.out.print(arr[i][j]+"\t");
           }
            System.out.println();
        }
    }
    
    public static void main()
    {
        Composite obj = new Composite(5,4);
        obj.fill();
        obj.display();
        
    }
}