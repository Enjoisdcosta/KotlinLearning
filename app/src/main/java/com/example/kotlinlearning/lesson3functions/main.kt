package com.example.kotlinlearning.lesson3functions

fun main(){
    println("This is in the main functions")

    var temp = 20
    var statement= ("The temp right now is $temp and it is ${if (temp >50) println("greater than 50") else "less than 50" }")
    println(statement)
}