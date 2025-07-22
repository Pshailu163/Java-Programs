import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String[] str2=str1.split(" ");
        //String str2=sc.nextLine();
        // //System.out.println(str.toUpperCase());
        
        // int count=0;
        // int coc=0;
        // for (int i=0;i<str1.length();i++)
        // {
        //     char c=str1.charAt(i);
        //     if (c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        //     {
        //         count++;
        //     }
        //     else if (c>='A' && c<='Z' || c>='a' && c<='z')
        //     {
        //         coc++;
        //     }

        // }
        // System.out.println(count);
        // System.out.println(coc);

        // for (int i=str1.length()-1;i>=0;i--)
        // {
        //     char c=str1.charAt(i);
        //     str2+=c;
        // }
        // if (str1.equals(str2))
        // {
        //     System.out.println("Palindrome");
        // }
        // else
        // {
        //     System.out.println("Not palin");
        // }

        // if (str1.contains(str2))
        // {
        //     System.out.println("is there");
        // }
        // else
        // {
        //     System.out.println("not ");
        // }

        // int i=str1.indexOf(str2);
        // if (i==-1)
        // {
        //     System.out.println("not found");
        // }
        // else
        // {
        //     System.out.println("found "+i);
        //}
        
        for (int i=0;i<str2.length;i++)
        {
            for (int j=str2[i].length()-1;j>=0;j--)
            {   
                System.out.print(str2[i].charAt(j));

            }
            System.out.print(" ");
        }
        
    
    }
}
