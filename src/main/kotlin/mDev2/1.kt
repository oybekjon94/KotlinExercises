package mDev2

//sets and maps
//list bilan setni farqi listda bitta element istalgancha takrorlanadi
//setda esa bitta element faqat bir marta
fun main(){
    val mySet = HashSet<String>()
    mySet.add("hello")
    mySet.add("hello")
    mySet.add("hello")

    println(mySet)
    //output: hello
    println(mySet.contains("hello"))
    //toplamni ichida bormi yuqmi tekshiradi
    println(mySet.containsAll(listOf("hello")))
    //containsAll da ichiga collection listOf degan
    //xamda bir nechta qiymatlarni bir vaqtni ozida tek. boladi
}