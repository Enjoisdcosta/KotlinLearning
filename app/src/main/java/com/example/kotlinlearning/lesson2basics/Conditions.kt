package com.example.kotlinlearning.lesson2basics

fun main(){
    var test = 1
    var test1 = 2
//basic
    if(test>test1){
        println("$test is greater than $test")
    }
    else if (test ==1){
        println("test  = 1")
    }
    else
        println("$test1  is greater than $test")
//in
    if(test in 200..500){
        println(test)
    }
    else {
        println("$test is to small")
    }
//when
    var number1 = -1
    var number2 = 100
    when(number1){
        0-> println("0")
        in 1..100 -> println("Its between 1 and 100")
        else -> println("It is greater than 100 but does not count if negative" )
    }
    // Better when
    when{
        number1<0 -> println("Less than 0")
        number1 == 0 -> println("Is 0")
        number1 in 1..100 -> println("between 1 and 100")
        else -> println("greater than 100")

    }
}