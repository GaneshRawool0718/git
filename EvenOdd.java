import java.util.Scanner;

public class EvenOdd {
    public static boolean isEven(int number) {
        // This method checks if a given number is even or not.
        if(number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }else if(number % 2 == 0) {
            return true; 
        } else {
            return false; 
        }
    }
}

class Client {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // Taking input from user
        System.out.print("Enter a positive integer number: ");
        int number = obj.nextInt();

        boolean result = EvenOdd.isEven(number);
        if (result) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
        obj.close();
    }

}