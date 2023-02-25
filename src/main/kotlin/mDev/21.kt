package mDev

//bir sigir xar 4 yulda bir bolali bolsa
//30 yilda bir sigirdan tugilganlar sonini topish

fun main(){
    for (i in 1..30){
        println("$i: ${getCows(i)}")
    }
}
fun getCows(years:Int):Int{
    //mutableListOf bu function qilib olindi va initishilayz qilish shartmas
    val ages = MutableList(1){0}

    for (year in 0 until years){
        //
        for (i in ages.indices){ //get() = 0..size - 1
            if (ages[i] >= 3){
                ages.add(0)
            }
            ages[i]++
        }
    }
    return ages.size
}
