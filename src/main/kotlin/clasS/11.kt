package clasS

class Person {
    var name: String = ""
    var age:Int = 0

    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}

fun main(){
    val p1 = Person()
    p1.name = "Peter"
    p1.age = 28

    println(p1)
}