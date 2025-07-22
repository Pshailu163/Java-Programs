import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str3="";
        String[] str2=str1.split(" ");
        for (int i=0;i<str2.length;i++)
        {
            str3="";
            for (int j=str2[i].length()-1;j>=0;j--)
            {
                str3+=str2[i].charAt(j);
            }
            System.out.print(str3+" ");

            
            
        }
        
    }
}
