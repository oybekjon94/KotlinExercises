package mDev

import java.util.Scanner

/*
1.
Enter height: 5
 *
 **
 ***
 ****
 *****
2. enter a number: 123456
sum of digits: 21
 */
fun main(){
    print("enter height: ")
    val height = Scanner(System.`in`).nextInt()

    for (i in 1..height){
        for (j in 1..i){
            print("*")
        }
        print("\n")
    }
    //---------------------
    print("enter a number: ")
    var number = Scanner(System.`in`).nextInt()

    var sum = 0
    while (number > 0){
        sum += number % 10
        number /= 10
    }
    println("Sum of digits: $sum")
}
