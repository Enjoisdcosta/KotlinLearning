package com.example.kotlinlearning.codingChallange

import org.junit.Test
import org.junit.Assert.*

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun moveZeros(list: List<Int>): List<Int> {
    // For a given list, return a new list with all the zero values moved to the end of the list.
    var test= list.sortedDescending()
    var startList = mutableListOf<Int>()
    var endZeroList = mutableListOf<Int>()
    for (i in list){
        if(i==0){
            endZeroList.add(i)
        }
        else{
            startList.add(i)
        }
    }
    return startList + endZeroList
}
class MainTest {
    @Test
    fun `long list has zeros moved to the end`() {
        val testValue = moveZeros(listOf(1, 2, 5, 0, 5, 7, 3, 0, 1, 0, 14, 35, 0, 65))
        assertEquals(
            listOf(1, 2, 5, 5, 7, 3, 1, 14, 35, 65, 0, 0, 0, 0),
            moveZeros(testValue)
        )
    }
}
