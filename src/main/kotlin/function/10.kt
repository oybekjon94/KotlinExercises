package function

fun student(name:String, grade: String, roll_no:Int){
    println("Name of the student is: $name")
    println("Grade oof the student is: $grade")
    println("Roll no of the student is: $roll_no")
}
fun main(){
    val name = "Oybek"
    val rollno = 25
    val grade = "A"
    student(name,grade,rollno)
    println("-----------------------------")
    student("Otkir","B",30)
}