package year_2022.month_5.week_1

class Solution {
    fun reverseWords(s: String): String {
        return s.split(" ")
            .joinToString(" ") { it.reversed() }
    }
}