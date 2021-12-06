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

fun calc(cnt: Int) = if (7 - cnt == 7) 6 else 7 - cnt