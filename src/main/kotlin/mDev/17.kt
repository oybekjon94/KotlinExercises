package mDev

//object
fun main(){
    val myCar = Car("white","ferrari")

    myCar.drive()
    myCar.stop()

    println("I have a ${myCar.color} ${myCar.model}")
}
class Car(var color: String, var model: String) {
//    //constructorni vazifasi yangi parameter berish
//    constructor(color:String,model:String){
//        this.color = color
//        this.model = model
//    }

    fun drive(){
        println("I am driving")
    }
    fun stop(){
        println("I am stopping")
    }
}