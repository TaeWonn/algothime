package year_2022.month_7.week_1_1

class Solution {
    fun solution(s: String): IntArray {
        val arr = parse(s)
        return answer(arr)
    }

    private fun parse(s: String): List<IntArray> {
        val result = mutableListOf<IntArray>()
        val str = s.substring(1, s.length - 1)
            .split("},")

        str.forEach { string ->
            val intArray = mutableListOf<Int>()
            string.split(",").forEachIndexed { index, s ->
                val paresInt = s.replace("{", "")
                    .replace("}", "")
                    .toInt()
                intArray.add(paresInt)
            }
            result.add(intArray.toIntArray())
        }

        return result
    }

    private fun answer(arr: List<IntArray>): IntArray {
        val map = HashMap<Int, Int>()
        arr.forEach { ints ->
            ints.forEach {
                map[it] = map.getOrDefault(it, 0) + 1
            }
        }

        return map.entries
            .sortedByDescending { it.value }
            .map { it.key }
            .toIntArray()
    }
}

fun main() {
    val s = Solution()
    s.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}").forEach { println(it) }

}