package com.example.kotlinlearning.lesson3functions

fun main(){
    var celcius = 22.0
    var c2f ={i:Double -> ((i*(1.8)) + 32.0)} // c2f = celcius to farheint
    println(c2f(celcius.toDouble())) //.toDouble() smart cast in case anything beside a double was given in celcius

}