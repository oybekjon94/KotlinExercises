package mDev2

//inline function
fun main(){
    println(
        5.add(15)
    )
}
//inline ishlash tezligini oshiradi
inline fun Int.add(value: Int):Int{
    return this + value
}
