package year_2022.month_3.week_4

class Solution {
    fun pivotArray(nums: IntArray, pivot: Int): IntArray {
        var before = mutableListOf<Int>()
        val pivots = mutableListOf<Int>()
        val after = mutableListOf<Int>()

        nums.forEach {
            if (it > pivot) after.add(it)
            if (it == pivot) pivots.add(it)
            if (it < pivot) before.add(it)
        }

        before.addAll(pivots)
        before.addAll(after)


        return before.toIntArray()
    }
}

fun main() {
    val s = Solution()
    var arr1 = intArrayOf(9,12,5,10,14,3,10)

    println( s.pivotArray(arr1, 10).joinToString { "$it " })
}
