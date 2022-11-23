fun main(args: Array<String>) {
    var name: String
    name = "John"
    println(name)

//[0] is the first element. [1] is the second element, [2] is the third element, etc.
    var txt = "Hello World"
    println(txt[0]) // first element (H)
    println(txt[2]) // third element (l)


//string functions
    var greetings = "Hello World"
    println(greetings.toUpperCase())
    println(greetings.toLowerCase())

    //string length
    var alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("The length of the txt string is: " + alpha.length)


    //compare strings
    var txt1 = "Hello World"
    var txt2 = "Hello World"
    println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)

    //finding a string in a string
    var txt3 = "Please locate where 'locate' occurs!"
    println(txt3.indexOf("locate"))  // Outputs 7
}


