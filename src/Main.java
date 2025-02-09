// Kaden Jain
// Computer Programming 1 - Spring 2025
/* A program that takes an integer (java int) and
uses the modulo function to indicate if the number
is odd or even. Since we can't do input in java yet,
just hard code the value for the input as a variable instantiation... */

public class Main {
    public static void main(String[] args) {

        // declare variables
        int theNumber = 4;

        if (theNumber %2 == 0) {
            System.out.println("The number is even!");
        }
        else {
            System.out.println("The number is odd!");
        }

    }
}