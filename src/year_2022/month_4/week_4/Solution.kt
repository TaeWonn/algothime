package year_2022.month_4.week_4


class Solution {
    val arr = arrayOf(
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    )
    var combinations = mutableListOf<String>()
    var sb = StringBuilder()

    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) return combinations

        funCombinations(digits, 0, arr)
        return combinations
    }

    private fun funCombinations(digits: String, i: Int, arr: Array<String>) {
        // 현재 반복 인덱스가 digits의 길이와 같다면 (끝까지 탐색했다는 의미)
        // combinations 의 저장 후 리턴
        if (i == digits.length) {
            combinations.add(sb.toString())
            return
        }

        val letters = arr[digits[i] - '0']

        // 번호의 문자열을 가져와서 반복
        for (char in letters.toCharArray()) {
            // 현재 문자열을 sb에 저장
            sb.append(char)
            // 다음 digit 에 문자열 하나 또는 그 이상을 가져옴.
            funCombinations(digits, i + 1, arr)
            // 다음 재귀를 위해 마지막 문자열을 제거 해줌. ae -> a
            sb.deleteCharAt(sb.length - 1)
        }
    }
}

fun main() {
    val s = Solution()
    println(s.letterCombinations("23"))
}