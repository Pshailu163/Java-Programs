import java.util.*;
public class Longestvowles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        //String[] str2=str1.split(" ");
        String current="";
        String longest="";

        for (int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                current+=ch;
                if (current.length()>longest.length())
                {
                    longest=current;
                }
            }
            else
            {
                current="";
            }

            
        }
        System.out.println(longest.length());
        
        

    }
}
