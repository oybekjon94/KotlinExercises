package mDev

import java.util.Scanner

//calculator ilovasi
/*
enter first number: 12
enter second number: 2
enter operation (+ - * \ < > <= >=): *
answer: 24
 */
fun main(){
    val scanner = Scanner(System.`in`)
//    val number = scanner.nextInt()
//    val string = scanner.next()
    print("enter first number: ")
    val first = scanner.nextInt()

    print("enter second number: ") //alt + j -> bittada ikkita joyga ozgartirish
    val second = scanner.nextInt()

    print("enter opeation (+ - * / < > <= >=):")
    val operation = scanner.next()

    print("answer: ")
    when(operation){
        "+" -> print(first + second)
        "-" -> print(first - second)
        "*" -> print(first * second)
        "/" -> print(first / second)
        "<" -> print(first < second)
        ">" -> print(first > second)
        "<=" -> print(first <= second)
        ">=" -> print(first >= second)
    }
}