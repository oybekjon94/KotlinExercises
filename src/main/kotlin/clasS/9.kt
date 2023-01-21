package clasS

class Car6(var brand:String, var model:String, var year: Int){
    //class function
    fun drive(){
        println("Wroom")
    }
    //class function with parameters
    fun speed(maxSpeed: Int){
        println("Max speed is: " + maxSpeed)
    }
}
fun main(){
    val c1 = Car6("Ford","Mustang",1969)

    //print property values
    println(c1.brand + " " + c1.model + " " + c1.year)

    //call the functions
    c1.drive()
    c1.speed(200)
}