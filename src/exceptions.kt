import java.lang.ArithmeticException

fun main(args: Array<String>) {
    try {
        var num=10/0
        println(num)

    }catch (e:java.lang.ArithmeticException){
        println("ArithmeticeException")
    }catch (e:Exception){
        println(e)
    }

}