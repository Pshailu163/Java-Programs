import java.util.*;
public class tutorial2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int l=0,cl=0,cu=0,u=0;
        int org=n;
        while (n!=0)
        {
            n--;
            if (n%m==0)
            {
                l=n;
                break;
            }
            cl++;
            
        }
        n=org;
        while (n!=0)
        {
            n++;
            if (n%m==0)
            {
                u=n;
                break;
            }
            cu++;
            
        }

        if (cl>cu)
        {
            System.out.println(u);
        }
        else if (cu>cl)
        {
            System.out.println(l);
        }
        else
        {
            System.out.println(l);
            System.out.println(u);
        }
        
        
        
    }
}
