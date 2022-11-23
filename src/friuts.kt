class friuts {
    var price=0
    var namefriut=""
    var color=""
}

fun main(args: Array<String>) {
    //creat an object
    val myobj=friuts()
    myobj.price=23
    myobj.namefriut="banana"
    myobj.color="yellow"
    println("my favourite fruit is ${myobj.namefriut} and it is ${myobj.color} in colour and it cost sh${myobj.price}")
}