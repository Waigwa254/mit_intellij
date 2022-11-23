//when statement
fun main() {
    println("Enter the numbers:")
    val firstNumber = readLine()?.toDoubleOrNull()
    val secondNumber = readLine()?.toDoubleOrNull()

    if (firstNumber != null && secondNumber != null) {
        println("Enter +, -, * or /:")
        val o = readLine().toString()[0]
        var result: Double? = null

        when (o) {
            '+' -> {
                result = firstNumber + secondNumber
            }
            '-' -> {
                result = firstNumber - secondNumber
            }
            '*' -> {
                result = firstNumber * secondNumber
            }
            '/' -> {
                result = firstNumber / secondNumber
            }
            else -> {
                println("Please enter a valid operator.")
            }
        }

        if (result != null) {
            println("$firstNumber $o $secondNumber = $result")
        }
    } else {
        print("Please enter valid inputs")
    }
}