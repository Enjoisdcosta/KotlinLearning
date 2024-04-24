package com.example.kotlinlearning.lesson2basics

fun main(){
    val test: Int = 12
    val test1: Double = 14.0
    val result = test.toDouble() + test1
    println(result)
    println("Adding $test + $test1 gives you $result")
    val newThing by lazy { "This is lazy" }

// as Double is not working ask in class
//    var cash: Int = 12
//    var load: Double = 14.0
//    var calculatePrice:Double = (cash as Double) + load
//    println(calculatePrice)

}