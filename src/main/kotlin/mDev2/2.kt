package mDev2

//map:
//map -> xarita yani key value keywordlari orqali bir biriga boglab ketadi
fun main(){
    val userAges = HashMap<String,Int>()
    //userAges.put("oybek",28) pastdagi bilan bir xil
    userAges["oybek"] = 28
    userAges["sardor"] = 25
    //you can reassign
    userAges["oybek"] = 30

    println(userAges["oybek"])
    println(userAges.contains("oybek"))
    println(userAges.containsValue(28))
    //bunda natija false chunki keyin reassign qilindi
    println(userAges.getOrDefault("alisher",20))
    //bu yerda agar alisher degan qiymat bolmasa bizga default qiymat 20 ni chiqaradi
    userAges.entries.forEach{
        println(it)
    }
    //bu yerda bizga barcha qiymatni chiqarib beradi




}