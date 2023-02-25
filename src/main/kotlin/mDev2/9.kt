package mDev2

import java.util.Scanner

//exception handling-> xatoliklarni oldini olish
fun main(){
    val scanner = Scanner(System.`in`) //malumotlarni oqib olish

//    val myInt = scanner.nextInt()//yangi int oqib olish uchun
//
//    println(myInt)
 // agar consolda inputni orniga string yozsa xatoolik beradi bu narsa exception deyiladi
    //------------
    // handle dan foydalanish
    try { //try degani urinib kor
        // tryni ichida xatolik bolsa catch otadi
        val myInt = scanner.nextInt()
        println(myInt)
    }catch (e: Exception){ //e:Exception da qanaqa exception sodir bolgan bolsa usha keladi
        println("xatolik yuz berdi: ")
    }finally { //yakunlaydi
        println("yakunlash")
    }
    //try catch exceptionlarni ishlatish joyi bor
    //xar doim xam ishlatilavermaydi.masalan file yoki internet bilan ishlagandi
    //biz try catch ishlatishimiz shart boladi
}