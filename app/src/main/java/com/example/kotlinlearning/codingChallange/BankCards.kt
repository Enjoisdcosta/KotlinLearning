package com.example.kotlinlearning.codingChallange

fun main(){
    var card ="1111-0000-0000-0311"
    validCard(card)
}
fun validCard(value:String):String{
    var test = value.split("-")
    var lastDigit = test[3].toInt()
    var lastTwo = lastDigit % 100
    println(lastTwo)

        if((test[0] =="1121"||test[0] =="1111"||test[0] =="3796" )&& (lastTwo>=24)){
            println("Valid Card")
            println(value)
        }
        else {
            println("Not a valid card")
        }
    return  value
    }


