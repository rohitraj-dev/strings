import java.util.*;
class printSubstrings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("enter a string : ");
        String s = sc.next();
        int length = s.length();

        for(int i=0; i<length; i++)
        {
            for(int j=i; j<length; j++)
            {
                System.out.print((s.substring(i, j+1))+" ");
            }
            System.out.println();
        }
    }
}