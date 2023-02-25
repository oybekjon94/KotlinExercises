package mDev2

//stringlarni bir biriga yigadigan func yozamiz
fun main() {
    val myStrings = listOf("hello", "world", "!!!")
    println(myStrings.join { current ->
        return@join current.lowercase()
    })
}

//tranform -> funckiya qabul qiladi.kelgan stringni ichiga bersa boladi.String olsa string qaytaradi
fun List<String>.join(
    prepend: String = "",
    append: String = "",
    separator: String = "",
    transform: ((current: String) -> String)? = null
): String {
    //StringBuilder-> bunda takroriy xotiradan joy olmaydi
    //qisqa qilib yozsa boladi
    val sb = java.lang.StringBuilder(prepend)
    forEachIndexed() { index, current ->
        sb.append(transform?.invoke(current) ?: current)
        if (index != size - 1) {
            sb.append(separator)
        }

    }
    sb.append(append)
    return sb.toString()
    //ctrl + alt + shift + l -> func ni chiroyli xolatga olib keladi
}
