import java.util.*;
class intToString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number : ");
        int n = sc.nextInt();

        String str = "";  // empty string

        //String str = Integer.toString(n);  // inbuilt function for integer to string

        str = str + n;  // concatenation : int in string
        
        System.out.println(str);
        //System.out.println(typeof str);
    }
}