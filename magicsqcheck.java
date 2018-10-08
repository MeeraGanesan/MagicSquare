import java.util.*;
class magicsqcheck
{
    public static void main()
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the number of sides");
        int n=SC.nextInt();
        int k[][]=new int[n][n];
        System.out.println("Enter the values");
        boolean square=false;
        int sum=0;
        int sum2=0;
        int sum3=0;
        int sum4=0;
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                k[i][j]=SC.nextInt();
            }
        }
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
            sum=sum+k[i][i];
            sum2 = sum2 + k[i][n-1-j];
        }
        }
        
        if (sum==sum2)
        {
           
       
            for (int i=0;i<n;i++)
            {
                sum3=0;
                sum4=0;
                for (int j=0;j<n;j++)
                {
                sum3=sum3+k[i][j];
                sum4=sum4+k[j][i];
                }
                if (sum3!=sum4 && sum3!=sum)
               {
                  System.out.println("Not a magic square");
                  square=true;
                  break;
               }
           }
        }

    if (square==false)
    {
        System.out.println("Magic Square");
    }
}
}


            