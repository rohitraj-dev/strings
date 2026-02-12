import java.util.*;
class noOfDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter a number : ");
        int n = sc.nextInt();

        String str = Integer.toString(n);
        int length = str.length();
        int count = 0;

        for(int i=0; i<length; i++)
        {
            System.out.print(str.charAt(i)+" ");
            System.out.print(" : ASCII Value = "+(int)(str.charAt(i))+", ");
            count = count + 1;
        }
        System.out.println("\nnumber of digits = "+count);
        
    }
}