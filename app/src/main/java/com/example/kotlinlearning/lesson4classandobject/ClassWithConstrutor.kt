package com.example.kotlinlearning.lesson4classandobject
import kotlin.math.pow

class PersonConstructor(Name:String= "Bob",Height:Int=70,Weight:Int = 160 ){
    var Name:String = Name
    var Height:Int = Height
    var Weight:Int = Weight
    var test = Weight/Height
    //var bmi = (test.pow(2)*703)

    fun printPerson(){
        println("Name:$Name "+"Height:$Height "+ "Weight:$Weight ")
    }
    init {
        println("test")
    }
    var volume: Int
        get() = Weight * Height / 1000
        set(value) {
            Height = (value * 1000) / (Weight)
        }

}

fun main(){
    var myPerson = PersonConstructor()
    myPerson.printPerson()

    myPerson.Name="Sam"
    myPerson.Weight= 120
    myPerson.printPerson()
    var myPerson1 = PersonConstructor(Height = 70, Name="Tim", Weight = 200)
    myPerson1.printPerson()
   // println( myPerson.bmi)


}