import java.util.Scanner;

public class reverseString {
    
    /*
     * Task 2:
     * Reversing a String
     * In Java, strings refer to sequences of characters that behave like an object within the Java environment.
     * It’s a very common and widely used Java data structure, storing data in an array of characters.
     * Creating a simple application that reverses a string can help you understand strings and how they’re used in a Java environment.
     * For example, creating a program that reverses a string the user enters (e.g., “HELLO” to “OLLEH”).
     * This project has many possible solutions, which is a key concept to understand as you start coding.
     * And, oftentimes the best solution can change depending on the attributes and objective of the project you’re working on.
    */

    //Declariing the Variables
    private static String inputString;

    //main Method
    public static void main(String[] args) {
        //Creating a Scanner that stores user input in Variables
        Scanner s = new Scanner(System.in);

        //Telling the User to enter a String and saving the Input in the "inputString"
        System.out.println("Enter the String that you want to reverse:");
        inputString = s.next();

        //"Reversing" the String and "outputting" it in the Console
        for(int i = inputString.length() - 1; i >= 0; i--) {
            System.out.print(inputString.charAt(i));
        }
        s.close();
    }   
}