import java.util.*;
class changestring
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a string : ");
        String s = sc.nextLine();

        char firstChar = s.charAt(0);

        if(Character.isUpperCase(firstChar))
        {
            s = s.toUpperCase();
            //System.out.println("changed string : " + upperStr);
        }
        else if(Character.isLowerCase(firstChar))
        {
            s = s.toLowerCase();
            //System.out.println("changed string : " + upperStr);
        }
        // else
        // {
        //     System.out.println("first character is not an alphabet");
        // }

        System.out.println(s);
    }
}