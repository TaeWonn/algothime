package year_2022.month_5.week_4

class Solution {
    fun solution(new_id: String): String {
        var answer: String = new_id.lowercase()
            .replace(Regex("[^a-z0-9\\-_.]"), "")
            .replace(Regex("[.]{2,}"), ".")
            .replace(Regex("^[.]"), "")
            .replace(Regex("[.]$"), "")

        if (answer.isEmpty()) {
            answer = "a"
        }
        if (answer.length >= 16) {
            answer = answer.substring(0, 15)
                .replace(Regex("[.]$"), "")
        }
        if (answer.length < 3) {
            if (answer.length == 1) {
                answer = "$answer$answer$answer"
            }else {
                val last = answer.last()
                answer += last
            }
        }
        return answer
    }
}

fun main() {
    val s=  Solution()

    println( s.solution("abcdefghijklmn.p"))
//    println( s.solution("z-+.^."))
//    println( s.solution("...!@BaT#*..y.abcdefghijklm."))
//    println( s.solution("asd123asd123asd123asd123"))
}