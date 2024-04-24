package com.example.kotlinlearning.lesson3functions

fun main(){
    val states = arrayOf("California","Georgia","Florida",)
    var filteredStates  = states.filter() { it[0]=='C'|| it[0]=='c'}// ingnoreCare = true
    println(filteredStates)

    val newList = states.toList()
    println("new list: $newList")
}