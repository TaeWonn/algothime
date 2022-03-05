package year_2022.month_2.week_4

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var list = t.toCharArray().asList().toMutableList()
        var idx = 0
        if (s.isEmpty()) return true
        if (list.size == 0) return false
        while (s.length != list.size) {
            if (s.length == idx) {
                list = s.toCharArray().asList().toMutableList()
                break
            }
            if (s[idx] == list[idx]) idx ++
            else list.removeAt(idx)
        }

        val result = String(list.toCharArray())
        return s == result
    }
}

fun main() {
    val s = Solution().isSubsequence("b", "abc")
    println(s)
}