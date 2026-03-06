public class EasyString 
{
    public static String compressString(String S) 
    {
        if (S == null || S.length() == 0) 
        {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        int count = 1;
        char currentChar = Character.toLowerCase(S.charAt(0));
        
        for (int i = 1; i < S.length(); i++) 
        {
            char ch = Character.toLowerCase(S.charAt(i));
            
            if (ch == currentChar) 
            {
                count++;
            } 
            else 
            {
                // Append count and character
                result.append(count).append(currentChar);
                // Reset for next character
                currentChar = ch;
                count = 1;
            }
        }
        
        // Don't forget the last character group
        result.append(count).append(currentChar);
        
        return result.toString();
    }
    
    public static void main(String[] args) 
    {
        System.out.println(compressString("aaABBb"));     // Output: 3a3b
        System.out.println(compressString("aaBBccDD"));   // Output: 2a2b2c2d
        System.out.println(compressString("xyz"));        // Output: 1x1y1z
        System.out.println(compressString("aaAAaa"));     // Output: 6a
    }
}