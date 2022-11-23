
//oop inheritance
open class Mzazi {
    var colour="followed mums colour"
    var height="followed dads height "
}
class Njeri:Mzazi(){
    fun female(){
        println("Njeri $colour ")
    }

}
class John:Mzazi(){
    fun male(){
        println("John $height")
    }


}

fun main(args: Array<String>) {
    val obj=Njeri()
    obj.female()
    val obj1=John()
    obj1.male()
    }

