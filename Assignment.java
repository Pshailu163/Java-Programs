// import java.util.*;
// public class Assig {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];

//         for (int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         int c=0,num;
//         for (int i=0;i<n;i++)
//         {
//             num=arr[i];
//             if (num<=1)
//             {
//                 continue;
//             }
//             boolean isprime=true;
//             for (int j=2;j>=num/2;j++)
//             {
//                 if (num%j==0)
//                 {
//                     isprime=false;
//                     break;
//                 }
//             }
//             if (isprime)
//             {
//                 c++;
//             }
//         }

//         System.out.println(c);

//     }
// }




// import java.util.*;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str1=sc.nextLine();
//         String str2="";
//         for (int i=str1.length()-1;i>=0;i--)
//         {
//             char ch=str1.charAt(i);
//             str2+=ch;
//         }

//         String[] str3=str2.split(" ");
//         for (int i=0;i<str1.length();i++)
//         {
//             System.out.println(str3[i]);
//         }
//     }
// }









import java.util.*;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str2 = str.split(" ");

        for (int i =str2.length-1;i>=0;i--) {


            for(int j=str2[i].length()-1;j>=0;j--)
            {
                System.out.print(str2[i].charAt(j));
            }
            System.out.println();

        }
    }
}
