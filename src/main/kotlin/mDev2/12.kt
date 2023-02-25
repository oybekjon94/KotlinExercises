package mDev2

import Student
import com.google.gson.Gson

//deserialization -> textdan yana object korinishiga qaytib otish
// bu yerda yana qaytdan student class olib otishni koramiz

fun main(){
   val gson = Gson()
       val studentJson = "{\"id\":1,\"name\":\"oybek\",\"courses\":[\"math\",\"chemistry\"]}\n"
       val student = gson.fromJson(studentJson,Student::class.java)?: return

    println(student)

}