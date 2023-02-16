package map

// mutableMapOf
fun main(){
    val user = mutableMapOf("name" to "Kholikov Oybek","occupation" to "programmer")
    println(user)

    //user.put("location","USA")
    user["location"] = "USA"
    println(user)

    user.remove("occupation")
    println(user)

    user.clear()
    println(user)

    if (user.isEmpty()){
        println("empty")
    }else{
        println("not empty")
    }
}