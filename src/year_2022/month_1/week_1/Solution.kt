package year_2022.month_1.week_1

class Solution {

    val r = mutableListOf<Int>()
    fun solution(relation: Array<Array<String>>): Int {
        val rowSize = relation.size
        val colSize = relation.first().size

        for (i in 1..1.shl(colSize)) {
            if (!minimal(i)) continue
            if (!unique(i, relation, rowSize, colSize)) continue
            r.add(i)
        }

        return r.size
    }

    private fun minimal(idx: Int): Boolean = !r.any { idx.and(it) == it }

    private fun unique(idx: Int, relation: Array<Array<String>>, rowSize: Int, colSize: Int): Boolean {
        val s = convertToDix(idx, colSize)
        val set = HashSet<String>()
        for (i in 0 until rowSize) {
            val sb = StringBuilder()
            s.forEach { sb.append(relation[i][it]) }
            set.add(sb.toString())
        }
        return set.size == rowSize
    }

    private fun convertToDix(idx: Int, colSize: Int): List<Int> {
        val list = mutableListOf<Int>()
        for (i in 0 until colSize) {
            if (idx.shr(i).and(1) == 1) list.add(i)
        }
        return list
    }
}

fun main() {
    val arr = arrayOf(
        arrayOf("100","ryan","music","2"),
        arrayOf("200","apeach","math","2"),
        arrayOf("300","tube","computer","3"),
        arrayOf("400","con","computer","4"),
        arrayOf("500","muzi","music","3"),
        arrayOf("600","apeach","music","2")
    )
    println(Solution().solution(arr))
}