package year_2022.month_4.week_3

class Solution {
    var list = mutableListOf<Pair<Int, Int>>()
    fun removeCoveredIntervals(intervals: Array<IntArray>): Int {
        intervals.forEach {
            calc(it)
        }

        val size = list.size
        list = mutableListOf<Pair<Int, Int>>()
        return size
    }
    private fun calc(it: IntArray) {
        var search = true
        for (i in 0 until list.size) {
            val (min, max) = list[i]

            if (it[0] >= min && it[1] <= max) {
                search = false
            } else if (it[0] <= min && it[1] >= max) {
                list.removeAt(list.size - 1)
            }
        }

        if (search) list.add(it[0] to it[1])
    }

}

fun main() {
    val arr = arrayOf(
        intArrayOf(1,4),
        intArrayOf(3,6),
        intArrayOf(2,8),
    )
    val arr2 = arrayOf(
        intArrayOf(1,4),
        intArrayOf(2,3),
    )
    val arr3 = arrayOf(
        intArrayOf(3,10),
        intArrayOf(4,10),
        intArrayOf(5,11),
    )
    val arr4 = arrayOf(
        intArrayOf(1,2),
        intArrayOf(1,4),
        intArrayOf(3,4),
    )
    val s = Solution()

    println(s.removeCoveredIntervals(arr))
    println(s.removeCoveredIntervals(arr2))
    println(s.removeCoveredIntervals(arr3))
    println(s.removeCoveredIntervals(arr4))
}