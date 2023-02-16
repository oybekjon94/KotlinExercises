package map

//hashMap
fun main(){
    val items = HashMap<String, Int>()

    items["A"] = 90
    items["B"] = 80
    items["C"] = 70

    for ((k, v) in items){
        println("$k = $v")
    }
}