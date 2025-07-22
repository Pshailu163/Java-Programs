import java.util.*;
public class KthLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int n=s.length;
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(s[i]);
        }
        


        
        Arrays.sort(arr);

        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int k=sc.nextInt();
        System.out.println(arr[n-k]);


    }
}
