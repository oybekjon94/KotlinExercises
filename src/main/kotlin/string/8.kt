package string

//kotlin string white space stripping
fun main(){
    val s = " Eagle\t"

    println("s has ${s.length} characters")

    val s1 = s.trimEnd()
    println("s1 has ${s1.length} characters")

    val s2 = s.trimStart()
    println("s2 has ${s2.length} characters")

    val s3 = s.trim()
    println("s3 has ${s3.length} characters")
}