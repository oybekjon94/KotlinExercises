package mDev

//comparison operators < > <= >= == !=
//logical operators !  && ||
fun main(){
    println(!true)
    println(true&&true) //only true
    println(false||false) // faqat shu vaizyatda false

    println(true || true && false || !true)
    // bu vaziyatda birinchi negation bajariladi keyin and operatori bajariladi
    // xamda oxirida or operatori bajariladi
    println((true || true) && false || !true)
    //bu vaziyatda qavs birinchi bajariladi




}