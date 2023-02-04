package practice

data class User(val fname: String, val lname: String, val salary:Int)

fun main(){
        val users = listOf(
            User("John","Doe",1230),
            User("Lucy","Novak",670),
            User("Ben","Walter",2050),
            User("Robn","Brown",2300),
            User("Amy","Doe",1250),
            User("Joe","Draker",1190),
            User("Janet","Doe",980),
            User("Albert","Doe",700)
        )

        val r1 = users.maxBy({ u: User -> u.salary})
        println(r1)

        val r2 = users.maxBy() {u: User -> u.salary}
        println(r2)

        val r3 = users.maxBy{u: User -> u.salary}
        println(r3)
}
