import java.util.*;
class vowelscount
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String s = "xbfuhewiooianzmnmvziowiofnaeiou";
        int count = 0;
        char ch;

        for(int i=0; i<s.length(); i++)
        {
            ch =s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }
        System.out.println("number of vowels : "+count);
    }
}