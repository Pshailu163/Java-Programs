import java.util.*;
public class TwoDim {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        // int p=sc.nextInt();
        // int q=sc.nextInt();
        int[][] arr=new int[n][m];
        //int[][] arr1=new int[p][q];
        System.out.println("First matrix ");
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        // System.out.println("Second matrix ");

        // for (int i=0;i<p;i++)
        // {
        //     for (int j=0;j<q;j++)
        //     {
        //         arr1[i][j]=sc.nextInt();
        //     }
        // }
        


        // System.out.println("enter key value ");
        // int key=sc.nextInt();
        int sum=0;
        for (int i=0;i<n;i++)
        {
            //int sum=0;
            for (int j=0;j<m;j++)
            {
                if (arr[i][j]==arr[j][i])
                {
                    sum+=arr[i][j];
                    
                }
            }
            
            
        }

        System.out.println(sum);
        // if (ri!=-1)
        // {
        //     System.out.println(ri+" "+ ci);
        // }
        // else
        // {
        //     System.out.println("Not found");
        // }
        

        // for (int i=0;i<p;i++)
        // {
        //     for (int j=0;j<q;j++)
        //     {
        //         System.out.print(arr1[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        // System.out.println("Addition of 2 matrixs");
        // for (int i=0;i<p;i++)
        // {
        //     for (int j=0;j<q;j++)
        //     {
        //         System.out.print(arr[i][j] + arr1[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // int[][] k;
        // for (int i=0;i<n;i++)
        // {
        //     for (int j=0;j<q;j++)
        //     {
        //         for (int )
        //     }
        // }
        

    }
    
}
