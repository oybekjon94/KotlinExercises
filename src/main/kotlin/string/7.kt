package string

//kotlin empty/blank string
fun main(){
    val s = "\t"
    // val s = ""  -> output: is empty
    if(s.isEmpty()){
        println("the string is empty")
    }else{
        println("the string is not empty")
    }
    if (s.isBlank()){
        println("the string is blank")
    }else{
        println("the string is not blank")
    }
}