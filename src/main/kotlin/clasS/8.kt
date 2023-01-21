package clasS

//kotlin class functions
class Car5(var brand: String, var model: String, var year: Int){
    //class function
    fun drive(){
        println("Wrooom")
    }
}

fun main(){
    val c1 = Car5("Ford","Mustang",1969)

    //print property values
    println(c1.brand + " " + c1.model + " " + c1.year)

    //call the function
    c1.drive()
}