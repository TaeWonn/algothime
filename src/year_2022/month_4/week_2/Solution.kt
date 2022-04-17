package year_2022.month_4.week_2

class Solution {
    fun maxProfit(prices: IntArray): Int {
        // 이익
        var profit = 0
        // 구매가
        var buy = Int.MAX_VALUE
        for (i in prices) {
            when {
                // 구매 가격보다 현재가가 더 싸다, 현재가를 대입
                buy > i -> buy = i
                // 그렇지 않고, 이익이 (현재가 - 구매가) 보다 크다면, 현재 이익에 대입
                else -> if (profit < i - buy) {
                    profit = i - buy
                }
            }
        }

        return profit
    }
}

fun main() {
    val s= Solution()
    val arr = intArrayOf(7,1,5,3,6,4)
    val arr2 = intArrayOf(7,6,4,3,1)

    println(s.maxProfit(arr))
    println(s.maxProfit(arr2))
}