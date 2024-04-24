package com.example.kotlinlearning.lesson2basics

fun main(){
    // Array, List have keywords like listOf() and Array has arrayOf()

    //List
    val States = listOf("California", "Georgia","Texas","Washington")
    println(States)

    val Cities = mutableListOf("SF","NY")
    println(Cities.remove("NY"))
    println(Cities.remove("NTT"))
    println(Cities)
    Cities.add("NT")
    println(Cities)

    //Arrays
    val animals = arrayOf("Dog","Cat","Sheep","Lion")
    println(java.util.Arrays.toString(animals))

    val array = Array(5){
        it *2
    }
    println(java.util.Arrays.toString(array))

    var names = listOf("Bob","Taylor","Sam")
    for(i in names){
        println(i)
    }

    for(i in 5 downTo 1) {
        println(i)
    }
    for (j in 'A'..'z'){
        print(j)
    }
}