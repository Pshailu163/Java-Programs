import java.util.*;
public class phonenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        if (str1.length()==10)
        {
            if (!str1.startsWith("0"))
            {
                for (int i=0;i<str1.length();i++)
                {
                    char ch=str1.charAt(i);
                    if (ch>='1' && ch<='9')
                    {
                        System.out.println("Valid");
                        break;
                    }
                }
            }
            else
            {
                System.out.println("Invalid");
                
            }
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
