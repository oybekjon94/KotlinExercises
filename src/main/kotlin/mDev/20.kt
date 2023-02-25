package mDev

//Array and List -> massiv va ruyhat
//arrayni birinchi size berilishi kerak
//xotiradan joy oladi
//kamchilik tomoni sizedan kop joy oib bolmaydi.va sizega qarab joy egallab turadi

//list:
//listda size berilmaydi,agar berilsa usha qiymatdan boshlanishini
// bildiradi
//listga xoxlagancha qiymat qushish mumkin
//listda qiymatlarni ozgartirish va qushish mumkin emas
//agar ozgartirmoqchi bolsa mutableList qilib ozgartirish va qushish mumkin


fun main(){
    val array = Array<Int>(10){0}
    array[0] = 123
    array[1] = 12
    //----------------
    val list = List(10){0}
    //list.add(1) bolmaydi

    val list2 = MutableList(5) {0} //0 qilib initilayz qilib boshlanishiga
    //5 ta 0 beramiz
    //agar boshlangich size ga qiymat bermasa 0 qilsak bizga
    //qushgan qiymatlar faqat chiqadi
    list2.add(1)
    list2.add(2)
    list2.add(3)
    list2.add(4)
    list2.remove(2)
    //agar removeAt qilsak index boyicha turgan
    //qiymatni olib tasheydi
    list2.removeAt(0)
    //agar addAll qilsa oldin berilgan qiymatlarni
    //xammmasini yana ikkinchi marta beradi
    list2.addAll(list2)

    println(list2)
}
