package month_10.week_4

fun solution(numbers: IntArray): String {
    return numbers
        .map { it.toString() }
        .sortedWith (Comparator { e1, e2 -> "$e2$e1".compareTo("$e1$e2") })
        .joinToString("")
        .let {
            if (it[0] == '0') "0"
            else it
        }
}

fun main() {
    println(solution(intArrayOf(6, 10, 2)))
    println(solution(intArrayOf(3, 30, 34, 5, 9)))
}