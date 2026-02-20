// import java.util.*;
// class palindrome
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("enter a string : ");
//         String s = sc.nextLine();

//         char ch;
//         String st = "";

//         for(int i=s.length()-1; i>=0; i--)
//         {
//             ch = s.charAt(i);
//             st = st + ch;
//         }
//         if(st == s)
//             System.out.println("palindrome string");
//         else
//             System.out.println("not a palindrome string");

//     }
// }

import java.util.*;
class palindrome
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a string : ");
        String s = sc.nextLine();

        int i = 0;
        int j = s.length() - 1;

        while(i <= j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                System.out.println("not palindrome");
                break;
            }
            else
            {
                i++;
                j--;
            }
        }
    }
}