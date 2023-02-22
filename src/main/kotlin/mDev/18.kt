package mDev

//data class -> malumotlarni saqlab turadi.albatta consturtor bolishi kere
//va ichida albatta bitta ozgaruvchi bolishi kere
//private -> boshqaa yerda korinmaydi
fun main(){
    val myCar = Car2("white")

    myCar.drive()
    myCar.stop()

    println("I have a ${myCar.color}")
}
data class Car2(
    //private var color:String // qilsa tepada error beradi
    var color: String
){
    fun drive(){
        println("I am driving")
    }
    fun stop(){
        println("I am stopping")
    }
}