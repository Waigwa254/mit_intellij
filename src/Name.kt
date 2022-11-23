class Name {
    var fname:String="John"
    var lname:String="Kamau"


    fun Majina():String{
        return fname + lname

    }


}

fun main(args: Array<String>) {
    val obj=Name()
    println("my  firstname is ${obj.fname} and the lastname is ${obj.lname}")
}