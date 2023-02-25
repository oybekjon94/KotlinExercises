package mDev2

import java.util.Collections.list

fun main(){
    val list = ArrayList<Int>(10)

    try {
        val myInt = list[11]
        println(myInt)
    }catch (e:Exception){ //agar biz exceptionni orniga boshqa aynan
        //biz xoxlagan tipdagisini berishimiz mumkin
        println("xatolik yuz berdi")
    }finally {
        println("yakunlash")
    }
    //lekin bunaqa xolatda try catchdan foydalanmasa xam boladi
    //------------
    if(list.size >= 12){
        val myInt2 = list[11]
        println(myInt2)
    }
    //shunaqa qilsak ortiqcha performs larni oldini olgan bolamiz

}