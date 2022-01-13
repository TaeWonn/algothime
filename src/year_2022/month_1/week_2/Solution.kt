package year_2022.month_1.week_2

class Solution {

    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 0
        var idx = 0
        val map = HashMap<String, MutableList<String>>()
        clothes.map { it[1] to it[0] }.forEach { (fir, sec) ->
            takeUnless { map[fir]?.add(sec) != null }?.run { map[fir] = mutableListOf(sec) }
        }

        //경우의 수
        val list = map.values.toList()
        list.forEachIndexed { index, mutableList ->

        }

        return answer
    }

    fun dfs(idx: Int, list: List<MutableList<String>>): Int {
        return 0
    }
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