package mDev

//conditional
//shartli ifodalar: if, else if, else, when
fun main(){
    print("what is your name?:")

    val name = readLine()

    if(name == "oybek"){
        println("hello $name")
    }else if (name == "kholikov"){
        println("hi $name")
    } else if (name == "doston"){
        println("hi $name")
    } else {
        println("Access denied")
    }
    //--------------
    when(name){
        "oybek" -> println("hi $name")
        "bobur" -> {
            println("hi $name")
        }
        "sardor" -> {}
        else -> println("access denied")
    }
    //---------------
    //whendan keyin ozgaruvchi yozmaslik mumkin
    when{
        name == "oyka" -> println("hi $name")
        name == "sherka" -> println("hi $name")
    }
}