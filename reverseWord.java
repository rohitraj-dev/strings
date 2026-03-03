import java.util.*;
class reverseWord
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a String : ");
        String str = sc.nextLine();

        StringBuilder newStr = new StringBuilder(str);

        //newStr.reverse();
        //System.out.println(newStr);

        int i=0;
        int j=str.length() - 1;

        while(i <= j)
        {
            char c = str.charAt(i);
            char ch = str.charAt(j);
            str.setCharAt(i, ch);
            str.setCharAt(j, c);
            i++;
            j--;
        }
        System.out.println(str);

    }
}