package map

//kotlin map maxOf & minOf
data class User(val fname:String, val lname:String, val salary: Int)

fun main(){
    val users = mapOf(
        1 to User("John", "Doe", 1230),
        2 to User("Lucy","Novak", 670),
        3 to User("Ben","Walter", 2050),
        4 to User("Robin","Brown",2300)
    )

    val maxSalary = users.maxOf { it.value.salary }
    println(maxSalary)

    val minSalary = users.minOf { it.value.salary }
    println(minSalary)
}