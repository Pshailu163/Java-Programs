import java.util.*;
public class SubArrayCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int n=s.length;
        int[] arr1=new int[n];

        for (int i=0;i<s.length;i++)
        {
            arr1[i]=Integer.parseInt(s[i],10);
        }

        int c=0;
        for (int i=0;i<n-2;i++)
        {
            if (arr1[i]+arr1[i+2]==arr1[i+1])
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
