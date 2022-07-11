package year_2022.month_5.week_5

class Solution {
    fun largestWordCount(messages: Array<String>, senders: Array<String>): String {
        val hashMap = HashMap<String, Int>()

        messages.forEachIndexed { i, s ->
            val count = hashMap.getOrDefault(senders[i], 0)
            hashMap[senders[i]] = s.split(" ").size + count
        }
        val comparator = compareByDescending<MutableMap.MutableEntry<String, Int>> { it.value }.thenByDescending { it.key }
        HashMap<Int, Int>().apply {
            this.entries
        }

        return hashMap.entries
            .sortedWith(comparator)
            .first()
            .key
    }
}

fun main() {
    val s = Solution()

    println(s.largestWordCount(arrayOf("Hello userTwooo","Hi userThree","Wonderful day Alice","Nice day userThree"), arrayOf("Alice","userTwo","userThree","Alice")))
}