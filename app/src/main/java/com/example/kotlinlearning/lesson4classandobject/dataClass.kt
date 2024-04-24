package com.example.kotlinlearning.lesson4classandobject

data class Decoration(val rock:String){

}
data class Decoration2(val rocks: String, val wood: String, val diver: String){
}
// accessing the class by getting the class. For rocks setting the string to granite and then printing
fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)
    // the next one just has more parameters and can be assigned the same way with more parameters
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)
    println("rocks: ${d5.rocks}, wood:${d5.wood}, driver:${d5.diver}")


}
fun main(){
    makeDecorations()
}





