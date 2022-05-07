package year_2022.month_3.week_4

class Solution {
    fun reverseWords(s: String): String {
        return s.split(" ")
            .joinToString(" ") { it.reversed() }
    }
}

fun main() {
    val s = Solution()
    println(s.reverseWords("Let's take LeetCode contest"))
}