package mDev

import java.awt.Stroke

/*
Inheritance -> meros olish
Interfaces
Abstrack classes
Type casting
 */
fun main(){
    val cat: Pet = Cat()
    val dog: Pet = Dog()

    cat.sound()
    dog.sound()
    //------------------------------------
    // casting -> nomini ozgartirish
    // as? safe cast -> bu extiyotkorlik bilan xatolikni oldini olish uchun ish
//   val myCat = cat as? Dog
//   myCat?.sound()
    val myCat = cat as Cat
    myCat.sound()

    //stringni int ga ozgartirish
    val string = "12"
    //val string = "12a" bu vaziyatda exception beradi exception bu xatolik com
    //bajara olmaydigan
    //val number = string.toIntOrNull() bu vaziyatda shunaqa qilinadi
    //println((number ?: 0) + 10) elvis oreratori

    val number = string.toInt()
    println(number + 10)
    //----------------------------------------------
    //filtirlash -> agar tugri bolsa true notugri bolsa false
    val string2 = "12a"
    val number2 = string2.filter {
        it.isDigit() // num bolsa true
    }.toInt()  //deb filtirlagandan keyin intga ozgartirish mumkin
    println(number2 + 10)
}
// inheritance
open class Pet{ //open -> classdan meros olsa boladigan qiladi
    open val name:String = ""
    open val color:String = ""

    open fun sound(){
        println("")
    }
}
class Cat : Pet(){ // : qilib meros olinadi
    override fun sound() {
        println("meow")
    }
}
class Dog : Pet(){
    override val name:String = "Simba"

    override fun sound() {
        super.sound() // super -> ota classni ichidagi sound class
        println("wow")
    }
}