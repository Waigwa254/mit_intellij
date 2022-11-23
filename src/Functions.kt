fun hesabu(){
    var num1=45
    var num2=78
    println("the sum of $num1 and  $num2 is " +(num1+num2))

}
fun main(args: Array<String>) {
    myFunctions("Augustine","Waigwa",2022)
    hesabu()
    hesabu()

}
//functions with parameters --arguments
fun myFunctions(fName:String,lName:String,yReg:Int){
    println(fName + " " +lName + " " + yReg)
}
//functions lambda