package mDev

/*
loops + test takrorlanish
--for, while--
 */
fun main(){
    var number = 1
    while (number < 21){
        println(number)
        //println(number++)
        number++
    }
    //---------
    do {
        println(number++)
    }while (number<21)
    //------
    for (i in 1 .. 21){
        //downTo
        //until
        //step
        println(i)
    }
    //----------
    var number2 = 0
    while (true){
        number2++
        if(number2 == 10){
            continue
        }

        println(number2)

        if (number2 == 21){
            break
        }
    }
}