package year_2022.month_3.week_3

class Solution {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        var result = 0
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] == 1) {
                    result += check(grid, i, j)
                }
            }
        }

        return result
    }

    private fun check(grid: Array<IntArray>, i: Int, j: Int): Int {
        grid[i][j] = 0

        var r = 4

        //상
        if (i < grid.size -1 && grid[i +1][j] == 1) r += check(grid, i +1, j) - 1
        //하
        if (i > 0 && grid[i -1][j] == 1) r += check(grid, i -1, j) - 1
        //좌
        if (j > 0 && grid[i][j -1] == 1) r += check(grid, i, j -1) - 1
        //우
        if (j < grid[i].size -1 && grid[i][j] == 1) r += check(grid, i, j +1) -1
        return r
    }
}

fun main() {
    val s = Solution()

    val arr = arrayOf(
        intArrayOf(0,1,0,0),
        intArrayOf(1,1,1,0),
        intArrayOf(0,1,0,0),
        intArrayOf(1,1,0,0)
    )
    val arr2 = arrayOf(intArrayOf(1))
    val arr3 = arrayOf(intArrayOf(1,1))
    println(s.islandPerimeter(arr))
    println(s.islandPerimeter(arr2))
    println(s.islandPerimeter(arr3))
}