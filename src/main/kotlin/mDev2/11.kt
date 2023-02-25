package mDev2

import Student
import com.google.gson.Gson

// serialization -> ketma ketlashtirish
//bizda masalan malumot turi yoki class bor
//biz usha mal.ni internetga yubormoqchi bolsak yoki file yozib quymoqchi bolsak biz uni
//biz uni oddiy object korinishida emas text korinishida ozgartirib keyin ishlatishimiz kere boladi
//xamda file korinishida bolgan yoki internetdan kelayotgan mal.ni text korinishidan object korinishiga otkazib olishimiz kere
//shu ishlarni serialization qiladi
fun main(){
   val student = Student(
       id = 1,
       name = "oybek",
       courses = listOf("math","chemistry")
   )
    // bu qanaqa ishlaydi
//    val studentString = student.toString()
//    println(studentString)

    //serialization uchun Json formati kop ishlaydi
    //https://github.com/google/gson
    /*
    Gson is a Java library that can be used to convert Java Objects into their JSON representation. It can also
    be used to convert a JSON string to an equivalent Java object. Gson can work with arbitrary Java objects
     including pre-existing objects that you do not have source-code of.
     */
    val gson = Gson()

    val studentJson = gson.toJson(student)

    println(studentJson)
    //output : formatlangan textni chiqaradi
    //{"id":1,"name":"oybek","courses":["math","chemistry"]}
}