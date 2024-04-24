package com.example.kotlinlearning.lesson4classandobject

class Person{
    var Name:String = "Bob"
    var Height:String = "5'10"
    var Weight:Int = 160
    fun printPerson(){
        println("Name:$Name "+"Height:$Height "+ "Weight:$Weight ")
    }
}
fun main(){
    val myPerson = Person() // got to assign a object ot the class in order to use.
    println(myPerson.Name)
    myPerson.printPerson() //access function from that

}
