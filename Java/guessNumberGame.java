import java.util.Random;
import java.util.Scanner;

public class guessNumberGame {

    /*
     * This is a simple game that can help you get your feet wet with Java.
     * The game is relatively simple — the computer generates a random number, and the user must guess the number.
     * The computer will then let the user know that their guess is too high, too low, or correct.
     * This can be free-form, allowing an unlimited number of guesses, or give the user a set number of guesses before the game ends.
    */

    //Declaring the Variables
    private static int randomNum;
    private static int firstNum;
    private static int secondNum;
    private static int choosenNum;
    
    //main Method
    public static void main(String[] args) {
        //Creating a Scanner
        Scanner s = new Scanner(System.in);

        //Create a "Random" Varible
        Random rnd = new Random();

        //Check for user Inputs
        System.out.println("Choose the first number:");
        firstNum = s.nextInt();
        System.out.println("Choose the second number:");
        secondNum = s.nextInt();

        //Choose a random Number in betweenn the "firstNum" and "secondNum"
        randomNum = rnd.nextInt(firstNum, secondNum);

        //Let the user guess what the random number could be
        System.out.println("Random number choosen!");
        System.out.println("Guess the random choosen Number");
        choosenNum = s.nextInt();

        //A loop that is executed while the choosen Number isn't the same as the random Number
        while(choosenNum != randomNum) {
            while(choosenNum < randomNum) {
                System.out.println("your Number is smaller than the random Number");
                System.out.println("Choose a new Number");
                choosenNum = s.nextInt();
            }
            while(choosenNum > randomNum) {
                System.out.println("your Number is greater than the random Number");
                System.out.println("Choose a new Number");
                choosenNum = s.nextInt();
            }
        }
        System.out.println("You chose the right Number! The number was: " + randomNum);
        s.close();
    }
}
