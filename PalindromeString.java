import java.util.Scanner;

class PalindromeBuiltin {
    // This program checks if a given string is a palindrome using StringBuffer's reverse method.
    // A palindrome is a string that reads the same backward as forward.
    // The program ignores case when checking for palindromes.
    // It uses the StringBuffer class to reverse the string and then compares it with the original string.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user 
        System.out.print("Enter a string : ");
        String originalString = sc.nextLine();

        // Use StringBuffer to reverse the string
        StringBuffer sb = new StringBuffer(originalString);
        // Reverse the string using StringBuffer's reverse method
        // StringBuffer is mutable, so we can modify it directly
        String reverseString = sb.reverse().toString();

        // Using equalsIgnoreCase to check if both strings are equal regardless of case
        // If they are equal, the string is a palindrome
        if(originalString.equalsIgnoreCase(reverseString)){
            System.out.println(originalString + " is a palindrome string.");
        }else{
            System.out.println(originalString + " is not a palindrome string.");
        }

        sc.close(); 
    }
}
