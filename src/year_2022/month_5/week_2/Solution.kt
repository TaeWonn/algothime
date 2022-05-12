package year_2022.month_5.week_2


class Solution {
    fun largestGoodInteger(num: String): String {
        var result: Int? = null

        for (i in 2 until num.length) {

            if (num[i-2] == num[i-1] && num[i-1] == num[i]) {
                result = if (result == null)
                    Character.getNumericValue(num[i])
                else
                    (Character.getNumericValue(num[i])).coerceAtLeast(result)
            }
        }

        return if (result == null) ""
        else "$result$result$result"
    }
}

fun main() {
    val s = Solution()
    val num1 = "6777133339"
    val num2 = "2300019"
    val num3 = "42352338"
    val num4 = "3200014888"

    println(s.largestGoodInteger(num1))
    println(s.largestGoodInteger(num2))
    println(s.largestGoodInteger(num3))
    println(s.largestGoodInteger(num4))
}