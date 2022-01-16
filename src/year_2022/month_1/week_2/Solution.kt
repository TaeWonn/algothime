package year_2022.month_1.week_2

class Solution {
    lateinit var list: List<Int>
    fun solution(clothes: Array<Array<String>>): Int {
        var map: MutableMap<String, Int> = mutableMapOf()
        clothes.forEach {
            map[it[1]] = when {
                map.containsKey(it[1]) -> map[it[1]]!!.plus(1)
                else -> 1
            }
        }

        list = map.values.toList()

        var answer = 0
        for (i in 1..map.size) {
            answer += calc(i, map.size, 0)
        }

        return answer
    }

    fun calc(idx: Int, depth: Int, count: Int): Int {
        if (idx == 0) return 1
        if (count == depth) return 0
        if (idx > 0 && count >= depth) return 0

        var sum = 0
        for (i in 0 until list[count])
            sum += calc(idx -1, depth, count + 1)

        if (idx <= depth - count + 1)
            sum += calc(idx, depth, count + 1)

        return sum
    }

//    fun solution(clothes: Array<Array<String>>): Int {
//        return clothes.groupBy { it[1] }.values.fold(1) {
//                total, next -> total + (next.size + 1)
//        } - 1
//    }
}

fun main() {
    val arr = arrayOf(
        arrayOf("yellowhat", "headgear"),
        arrayOf("bluesunglasses", "eyewear"),
        arrayOf("green_turban", "headgear"),
    )
    val arr2 = arrayOf(
        arrayOf("crowmask", "face"),
        arrayOf("bluesunglasses", "face"),
        arrayOf("smoky_makeup", "face"),
    )

    println(Solution().solution(arr))
    println(Solution().solution(arr2))
}