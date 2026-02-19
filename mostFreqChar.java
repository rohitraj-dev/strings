import java.util.*;
class mostFreqChar
{
    public static char getMaxOccuringChar(String s)
    {
        int n = s.length();
        int freq[] = new int[26];

        for(int i=0; i<n; i++)
        {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            freq[idx]++;
        }
        int maxFreq = 0;
        char ans = s.charAt(0);
        for(int i=0; i<26; i++)
        {
            if(freq[i] > maxFreq)
            {
                maxFreq = freq[i];
                ans = (char)(i + 97);
            }
        }
        return ans;

        // int n = s.length();
        // int maxFreq = -1;
        // char ans = s.charAt(0);
        // char[] arr = s.toCharArray();
        // Arrays.sort(arr);
        // int i=0, j=0;
        // while(j<n)
        // {
        //     if(arr[i] == arr[j])
        //         j++;
        //     else
        //     {
        //         int freq = j - i;
        //         if(freq > maxFreq)
        //         {
        //             maxFreq = freq;
        //             ans = arr[i];
        //         }
        //         i=j;
        //     }
        // }
        // int freq = j-i;
        // if(freq > maxFreq)
        // {
        //     maxFreq = freq;
        //     ans = arr[i];
        // }
        // return ans;

        // int n = s.length();
        // int maxFreq = -1;
        // char ans = s.charAt(0);
        // for(int i=0; i<n; i++)
        // {
        //     int freq = 1;
        //     char ch = s.charAt(i);
        //     for(int j=i+1; j<n; j++)
        //     {
        //         if(s.charAt(j) == ch)
        //             freq++;
        //     }
        //     if(freq > maxFreq)
        //     {
        //         maxFreq = freq;
        //         ans = ch;
        //     }
        //     else if(freq == maxFreq && ch<ans)
        //     {
        //         ans = ch;
        //     }
        // }
        // return ans;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a string : ");
        String str = sc.next();

        System.out.println("Most Occuring Character : "+getMaxOccuringChar(str));
    }
}