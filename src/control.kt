fun main(args: Array<String>) {
    var num=70
    if (num>=65){
        println("proceed to the next level")
    }else{
        println("try again in three months")
    }


    val age=50
    if (age>=20){
        println("licenced to drive,,passed")
    }else if(age>=50 && age<=20) {
        println("not licenced to drive,,you got a distinction")
    }else if(age>=51 && age<=49){
        println("earnerd a credit")

    }else{
        println("wait till you reach 20")
    }
}