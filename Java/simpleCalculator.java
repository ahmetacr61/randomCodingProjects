import java.util.Scanner;

public class simpleCalculator {

    /*
     * Task 1:
     * Sum A + B
     * A sum-based project is a great way to get started with Java programming.
     * The project is quite simple — the user will input two numbers (which are treated as the variables A and B),
     * and the program will add them together and present the sum of A + B. This can help you learn to work with methods and integers.
    */

    //Declaring the Variables
    private static double num1;
    private static double num2;
    private static double sol;
    private static String operator;

    //main Method
    public static void main(String[] args) throws InterruptedException {
        //"while(true)"" is always true which means that the Code will repeat itself unity it's stopped!
        while(true) {
            num1 = 0;
            num2 = 0;
            sol = 0;
            operator = null;
            //Creating a Scanner to checking user input
            Scanner scan = new Scanner(System.in);

            System.out.println("Please Enter your first number:");
            num1 = scan.nextDouble();
            System.out.println("Please choose one of the following operators: \n+ \n- \n* \n/");
            operator = scan.next();
            System.out.println("Please Enter your second number:");
            num2 = scan.nextDouble();

            //It checks which operator is used so that the right "form" of calculating is used 
            switch(operator) {
                case "+":
                sol = num1 + num2;
                System.out.println("Your solution is " + sol);
                break;
                
                case "-":
                sol = num1 - num2;
                System.out.println("Your solution is " + sol);
                break;

                case "*":
                sol = num1 * num2;
                System.out.println("Your solution is " + sol);
                break;

                case "/":
                sol = num1 / num2;
                System.out.println("Your solution is " + sol);
                break;

                //Triggers when an Operator is used, which isn't supported
                default:
                System.out.println("Choose one of the 4 listet opertor!");
                break;
            }
            //System Waits 4 seconds before "restarting" the Code
            Thread.sleep(4000);
            //Creates 50 new, empty lines (looks better, but isn't a "need" for the code to run)
            for(int i = 0; i < 50; i++) {
                System.out.println("\n");
            }
        }
    }
}
