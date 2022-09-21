package year_2022.month_9.week_3

class Solution6 {
    fun solution(histogram: Array<IntArray>): Int {
        var answer: Int = 1

        for (i in 0 until histogram[0].size) {
            answer *= calc(histogram, i)
        }

        return answer
    }

    private fun calc(histogram: Array<IntArray>, index: Int): Int {
        var count = 1
        for (i in histogram.size -1 downTo  0) {
            when (histogram[i][index]) {
                0 -> return count
                1 -> count = 1
                2 -> count++
            }
        }
        return count
    }

}

fun main() {
    var arr= arrayOf(
        intArrayOf(0,0,0,0,0,0,1),
        intArrayOf(0,0,0,1,0,0,1),
        intArrayOf(0,1,0,1,0,0,1),
        intArrayOf(1,1,2,2,1,0,1),
        intArrayOf(2,2,2,2,1,2,2),
        intArrayOf(2,2,1,1,1,2,2),
        intArrayOf(2,2,1,1,1,2,2),
    )
    println(Solution6().solution(arr))
}