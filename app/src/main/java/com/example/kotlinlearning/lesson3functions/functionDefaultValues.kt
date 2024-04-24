package com.example.kotlinlearning.lesson3functions

fun main(){
    default() //default value was given in the function parameter
    default(20) // value was changed in here
    default(i=19)// parameter was named here
    println(compact(1,8))

}
fun default(i:Int =1){
    println(i)
}
fun compact(a:Int,b:Int)= a+b