package clasS

class Lamp(){
    //property (data member)
    private var isOn: Boolean = false

    //member function
    fun turnOn(){
        isOn = true
    }
    //member function
    fun turnOff(){
        isOn = false
    }

    fun displayLighStatus(lamp: String){
        if (isOn == true)
            println("$lamp lamp is on")
        else
            println("$lamp lamp is off")
    }
}
fun main(){
    val l1 = Lamp() //create l1 object of Lamp class
    val l2 = Lamp() //create l2 object of Lamp class

    l1.turnOn()
    l2.turnOff()

    l1.displayLighStatus("l1")
    l2.displayLighStatus("l2")
}