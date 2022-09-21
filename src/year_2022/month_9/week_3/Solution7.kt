package year_2022.month_9.week_3

import java.util.LinkedList
import kotlin.math.abs

class Solution7 {
    fun solution(queue: IntArray): IntArray {
        var answer: IntArray = intArrayOf(0 ,0 ,0)
        var countArray = intArrayOf(0, 0, 0)

        queue.forEach { plus(countArray, it) }

        val queueList = LinkedList(queue.toList())

        calc(countArray, queueList, answer)
        return answer
    }

    private fun calc(countArray: IntArray, queueList: LinkedList<Int>, answer: IntArray) {
        if (countArray[0] == countArray[1] && countArray[1] == countArray[2]) return

        val removeValue = queueList.pop()
        minus(countArray, removeValue)

        var addValue = calcAddValue(countArray, queueList.first)
        plus(answer, addValue)
        queueList.add(addValue)
        calc(countArray, queueList, answer)
    }

    private fun calcAddValue(countArray: IntArray, nextValue: Int): Int {
        // 빠질 값
        // 더해질 값 계산
        minus(countArray, nextValue)
        val avg = countArray.sum() / countArray.size
        val arr = countArray.map { abs(it - avg) }

        val indexOf = arr.indexOf(arr.minOrNull()!!)

        plus(countArray, nextValue)
        return indexOf + 1
    }

    private fun plus(arr: IntArray, value: Int) {
        arr[value - 1] ++
    }

    private fun minus(arr: IntArray, value: Int) {
        arr[value - 1] --
    }
}

fun main() {
    //println(Solution7().solution(intArrayOf(2,1,3,1,2,1)).toList())
    println(Solution7().solution(intArrayOf(3,3,3,3,3,3)).toList())
}