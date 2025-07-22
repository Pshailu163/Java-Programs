import java.util.*;

public class Tutorial1 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();


        for (int i = 1; i <= n; i++)
        {
            for (int k = 1; k <= n - i; k++)
            {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }

            for (int j = i - 1; j >= 1; j--)
            {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        

        
        for (int i=2;i<=n;i++)
        {
            int m=1;
            for (int j=1;j<i;j++)
            {
                System.out.print("  ");
            }
            for (int k=n;k>=i;k--)
            {
                System.out.print(m++ +" " );
            }
            for (int k=n-i;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            
            System.out.println();
        }




    }
}
