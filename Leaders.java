import java.util.*;
public class Leaders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for (int i=0;i<n;i++)
        {
            
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            int led=arr[i];
            for (int j=n-1;j>=i;j--)
            {
                if (arr[j]>led){
                    System.out.println(arr[j]);

                    break;
                    
                    
                }
                
                
                
            }
            
        }
        
    }
}
