class Hisabati {
    //data members
    var num1:Int=7
    var num:Int=9
    //member functions

    fun calculate():Int{
        return num*num1

    }
}

fun main(args: Array<String>) {
    val obj=Hisabati()
    println("The product of 7 & 9 is ${obj.calculate()}")
    println("the sum of 7 and 9 is ${obj.calculate()}")
}