fun main() {
    //Declaring Variables
    val num1:Double
    val num2:Double
    var sol:Double = 0.0
    val operator:String

    println("Enter your first Number:")
    num1 = readln().toDouble()
    println("Enter the operator you want to use:")
    operator = readln()
    println("Enter your second Number:")
    num2 = readln().toDouble()

    //Check which operator is used
    when(operator) {
        "+" -> {sol = num1 + num2}
        "-" -> {sol = num1 - num2}
        "*" -> {sol = num1 * num2}
        "/" -> {
            if(num2 == 0.0) {
                println("You can't divide with 0!")
            } else {
                sol = num1 / num2
            }
        }

        else -> {
            println("An error has occurred. PLease restart the code!")
        }
    }
    println("your solution is $sol")
}