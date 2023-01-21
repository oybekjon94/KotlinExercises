package clasS

class Hamster(){
    fun speak() = "Sqeuak!"
    fun exersice() =
        this.speak()+
                speak()+
                "Running on wheel"
}
fun main(){
    val hamster = Hamster()
    println(hamster.exersice())
}