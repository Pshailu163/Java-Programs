import java.util.*;
public class TwoArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        String[] s=sc.nextLine().split(" ");
        int n=s.length;
        int[] arr1=new int[n];

        for (int i=0;i<s.length;i++)
        {
            arr1[i]=Integer.parseInt(s[i],10);
        }
        String[] s1=sc.nextLine().split(" ");
        int m=s1.length;
        int[] arr2=new int[m];
        for (int i=0;i<m;i++)
        {
            arr2[i]=Integer.parseInt(s1[i],10);

        }
        int[] arr3=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
            if (arr1[i]<arr2[j])
            {
                arr3[k++]=arr1[i++];
            }
            else if (arr2[j]<arr1[i])
            {
                arr3[k++]=arr2[j++];
            }
            else
            {
                arr3[k++]=arr1[i++];
                arr3[k++]=arr2[j++];
            }
        }


        while (i<n)
        {
            arr3[k++]=arr1[i++];
        }
        while (j<m)
        {
            arr3[k++]=arr2[j++];
        }
        
        int size=n+m;
        double median;

        if (size%2==0)
        {
            median=(arr3[size/2-1]+arr3[size/2])/2.0;

        }
        else
        {
            median=arr3[size/2];
        }
        System.out.println(median);



    }
}
