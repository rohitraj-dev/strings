import java.util.*;
class NonRepeatingChar
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a string : ");
        String str = sc.next();

        int n = str.length();
        int maxFreq = -1;
        char ans = str.charAt(0);
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        int i=0, j=0;
        int flag = 0;
        while(j<n)
        {
            if(arr[i] == arr[j])
                j++;
            else
            {
                int freq = j - i;
                if(freq == 1)
                {
                    flag = 1;
                    break;
                }
                i=j;
            }
        }
        if(flag == 1)
            System.out.println(arr[i]);
        // int freq = j-i;
        // if(freq > maxFreq)
        // {
        //     maxFreq = freq;
        //     ans = arr[i];
        // }
    }
}