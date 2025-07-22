import java.util.Scanner;

public class OTPgeneration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String os="";
        String es="";
        for (int i=0;i<str1.length();i++)
        {
            
            char ch=str1.charAt(i);
            if (ch>='0' && ch<='9')
            {

                int dig=ch-'0';
                if  ((int)ch%2!=0)
                {
                    
                    os+=dig*dig;
                }
                else
                {
                    es+=dig;
                }
            }
        }
        System.out.println(os);
    }
}
