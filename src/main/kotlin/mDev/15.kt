package mDev

//nullable
//latenit -> keyinroq qiymat beraman degani
// global bu xamma joyda korinadi. va xamma funksiya uchun bir xil qiymatga ega

//lateinit name: String
var name:String? = null //nul bolishi mumkin
fun main(){
//     if (name == null){
//         name = "oybek"
//     }
    //println(name) //output: null
    name = "Oybek"
    //println(name?.lowercase())

    // safe call agar name null bolmasa uni qiymati
    //boladigan bolsa usha qiymatni lowercase almashtiradi
    //javada null safe call yuq

    println(name!!.lowercase())
    //biz name ni aniqligiga ishonch xosil qilsak !! ishlatamiz
    //agar uni qiymati bolsa nullPointerException beradi
}