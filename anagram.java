import java.util.*;
class anagram
{
    public static boolean areAnagrams(String str1, String str2)
    {
        if(str1.length() != str2.length())
            return false;
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0; i<arr1.length; i++)
        {
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter word 1 : ");
        String str1 = sc.next();

        System.out.print("enter word 2 : ");
        String str2 = sc.next();

        System.out.println(areAnagrams(str1, str2));
        
    }
}