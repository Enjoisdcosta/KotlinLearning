package com.example.kotlinlearning.newLearning


// Enter or tab for shortcut
fun main(){
    val use1:USER? = USER("adam","sandler")

    use1?.let{
        println(it)
    }
}

data class USER(var firstName:String,var LastName:String)