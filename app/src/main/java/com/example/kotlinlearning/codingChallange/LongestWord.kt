package com.example.kotlinlearning.codingChallange

import androidx.lifecycle.findViewTreeViewModelStoreOwner
import org.junit.Test
import org.junit.Assert

/**
 * Given a string implement a function which returns longest word in that string.
 * If there are two or more words that have the same length, return the first longest word from the string.
 * Ignore punctuation. Input string can't be empty or blank string.
 */
fun findLongestWord(value: String): String {
    var test = value.split(" ")
    var longest = ""
    for(i in test)
        if(longest.length< i.length){
            longest = i
        }
    return longest
}

fun main() {
    println(findLongestWord("\"Find the longest word in this string while ignoring punctuation. \" +\n" +
            "                \"There are multiple methods for achieving this.\""))
    fun `longest word is "punctuation"`() {
        val testSentence = "Find the longest word in this string while ignoring punctuation. " +
                "There are multiple methods for achieving this."
        Assert.assertEquals("punctuation", findLongestWord(testSentence))
    }
}