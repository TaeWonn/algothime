package month_12.week_1

class Solution {
}

fun main() {
    println(solution(intArrayOf(44, 1, 0, 0, 31, 25), intArrayOf(31, 10, 45, 1, 6, 19)).toList())
}
fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
    val unknown = lottos.count { it == 0 }
    var result = lottos.count { win_nums.contains(it) }
    return listOf(calc(result), calc(result + unknown)).sorted().toIntArray()
}

fun calc(cnt: Int) = when(cnt) {
    6 -> 1
    5 -> 2
    4 -> 3
    3 -> 4
    2 -> 5
    1 -> 6
    else -> 6
}