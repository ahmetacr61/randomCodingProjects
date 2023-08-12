//Initializing Variables
double num1;
double num2;
double sol = 0;
String Operator;

//Query user for Input
Console.WriteLine("Enter the first Number:");
num1 = double.Parse(Console.ReadLine());
Console.WriteLine("Enter the operator you want to use");
Operator = Console.ReadLine();
Console.WriteLine("Enter the second Number:");
num2 = double.Parse(Console.ReadLine());

//Choosing the operator to use and calculating
switch (Operator)
{
    case "+":
        sol = num1 + num2;
    break;
    case "-":
        sol = num1 - num2;
    break;
    case "*":
        sol = num1 * num2;
    break;
    case "/":
        if (num2 != 0)
        {
            sol = num1 / num2;
        }
        else
        {
            Console.WriteLine("you can't divide with 0!");
        }
    break;
    
    default:
        Console.WriteLine("Something wrent wrong, please restart the code and try again!");
    break;
}

Console.WriteLine("Your solution is " + sol);
