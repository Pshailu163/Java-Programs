import java.util.*;
public class Duplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int n=s.length;
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(s[i],10);
        }
        Arrays.sort(arr);
        
        for (int i=0;i<n-1;i++)
        {
            if (arr[i]==arr[i+1])
            {
                System.out.println(arr[i]);
                while (i<n-1 && arr[i]==arr[i+1])
                {
                    i++;
                }
            }
            
        }


    }
}
