public class sumOfSubstrings 
{
    // Method 1: Brute Force Approach
    public static long SumOfSubstrings(String num) 
    {
        long totalSum = 0;
        int length = num.length();
        
        // Generate all substrings
        for (int i = 0; i<length; i++) 
        {
            for (int j = i + 1; j<=length; j++) 
            {
                String substring = num.substring(i, j);
                totalSum += Long.parseLong(substring); // sum of substrings
            }
        }
        return totalSum;
    }
    // Method 2: Optimized Approach (O(n) time complexity)
    // public static long SumOfSubstringsOptimized(String num) 
    // {
    //     long totalSum = 0;
    //     long multiplier = 1;
    //     int length = num.length();
        
    //     // Traverse from right to left
    //     for (int i=length-1; i>=0; i--) 
    //     {
    //         int digit = num.charAt(i) - '0';
            
    //         // Each digit at position i contributes to (i+1) substrings
    //         // and appears at different place values
    //         totalSum += digit * multiplier * (i + 1);
            
    //         // Update multiplier for next iteration
    //         multiplier = multiplier * 10 + 1;
    //     }
        
    //     return totalSum;
    // }
    
    public static void main(String[] args) 
    {

        // Program to calculate sum of all substrings of a number
        // eg: 12 => 1 + 2 + 12 = 15
        
        String num1 = "1234";
        String num2 = "421";
        
        System.out.println("Number: " + num1);
        System.out.println("Sum (Brute Force): " + SumOfSubstrings(num1));
        //System.out.println("Sum (Optimized): " + SumOfSubstringsOptimized(num1));
        
        System.out.println("\nNumber: " + num2);
        System.out.println("Sum (Brute Force): " + SumOfSubstrings(num2));
        //System.out.println("Sum (Optimized): " + SumOfSubstringsOptimized(num2));
    }
}