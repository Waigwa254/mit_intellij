fun main() {
    println("Enter the numbers:")
    val firstNumber = readLine()?.toDoubleOrNull()
    val secondNumber = readLine()?.toDoubleOrNull()
//if statements
    if (firstNumber != null && secondNumber != null) {
        println("Enter +, -, * or /:")
        val o = readLine().toString()[0]
        var result: Double? = null

        if (o == '+') {
            result = firstNumber + secondNumber
        } else if (o == '-') {
            result = firstNumber - secondNumber
        } else if (o == '*') {
            result = firstNumber * secondNumber
        } else if (o == '/') {
            result = firstNumber / secondNumber
        } else {
            println("Please enter a valid operator.")
        }

        if (result != null) {
            println("$firstNumber $o $secondNumber = $result")
        }
    } else {
        print("Please enter valid inputs")
    }
}
