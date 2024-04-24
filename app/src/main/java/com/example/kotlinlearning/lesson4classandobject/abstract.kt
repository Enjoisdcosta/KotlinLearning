package com.example.kotlinlearning.lesson4classandobject

//Using abstract
abstract class abstractPerson(){
    abstract val name: String
}
//child class inherits from Parent class then overides by setting a new name
open class tomPerson: abstractPerson() {
    override val name = "Tom"
   open fun printSomething(){
        println("This is to be overriden")
    }
}
class overideFun: tomPerson(){
    override fun printSomething() {
        println("The previous function was overriden")
    }
}

//
fun main(){
    val newTomPerson = tomPerson()
    println(newTomPerson.name)
    val overideGet = overideFun()
    println(overideGet.printSomething())

}