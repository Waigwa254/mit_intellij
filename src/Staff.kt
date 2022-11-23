//oop constuctor
class Staff(val name:String, val jobdescription:String, val doe:Int) {

}

fun main(args: Array<String>) {
    val obj=Staff("john","lec",2022)

    println("my staff name is ${obj.name} i work as a ${obj.jobdescription} employed in ${obj.doe}")
}