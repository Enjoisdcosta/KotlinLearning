package com.example.kotlinlearning.lesson3functions




fun main(){
    test()
    println(addition(b=18))
    println(filterVowels("String"))

}
fun test(){
    println("test")
}
fun addition(a:Int=0, b:Int):Int{
    return a + b
}
fun filterVowels (str: String): String {
    val vowels= setOf('a', 'e', 'i', 'o', 'u')
    return str.filter { it !in vowels}
}