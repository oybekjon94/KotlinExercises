package flow

//if condition
fun main(){
    print("enter your age: ")

    val s_age:String? = readLine()
    if (s_age!!.isEmpty())return
    val age:Int = s_age.toInt()

    if (age > 18){
        println("you can obtain a driving licence")
    }else{
        println("you cannot obtain a driving licence")
    }
}