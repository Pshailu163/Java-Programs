import java.util.*;
//import java.util.Arrays;
public class Equilibrium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum1=0;
        int sum2=0;
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            for (int j=n-i+1;j>0;j--)
            {
                sum1+=arr[i];
                sum2+=arr[j];
                if (sum1==sum2)
                {
                    System.out.println(i);
                }
                break;
            }
        }
    }
}