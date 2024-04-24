package com.example.kotlinlearning.lesson3functions

fun main() {
    //ask about high order function
    val test = highOrder(2,3, ::numb)
    println(test)
}
    fun numb(a:Int,b:Int):Int{
        return a+b

    }
    fun highOrder(i:Int, j:Int, func:(Int,Int)->Int){
        println(func(i,j))

    }


