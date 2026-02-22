public class toggleCharacters 
{
    public static String toggleCase(String input) 
    {
        // if (input == null || input.isEmpty()) 
        // {
        //     return input;
        // }
        
        StringBuilder newString = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch))
                newString.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch)) 
                newString.append(Character.toUpperCase(ch));
            else
                newString.append(ch);
        }
        return newString.toString();
    }
    
    public static void main(String[] args) 
    {
        String original = "Hello World! 123";
        String toggled = toggleCase(original);
        
        System.out.println("Original: " + original);
        System.out.println("Toggled:  " + toggled);
    }
}