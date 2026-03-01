import java.util.*;
class StringCompression 
{
    public int compress(char[] chars) 
    {
        int write = 0; // position to write in the array
        int read = 0;  // position to read from the array
        
        while (read < chars.length) 
        {
            char currentChar = chars[read];
            int count = 0;
            
            // Count consecutive occurrences of the current character
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }
            
            // Write the character
            chars[write++] = currentChar;
            
            // Write the count if greater than 1
            if (count > 1) 
            {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) 
                {
                    chars[write++] = c;
                }
            }
        }
        
        return write;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a string : ");
        String str = sc.next();

        //System.out.println(compress(str));
    }
}