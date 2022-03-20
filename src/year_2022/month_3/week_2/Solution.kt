package year_2022.month_3.week_2

class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        var result = 0

        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] == '1') {
                    mark(grid, i, j)
                    result ++
                }
            }
        }

        return result
    }

    private fun mark(grid: Array<CharArray>, row: Int, col: Int) {
        grid[row][col] = '-'
        if (row < grid.size - 1 && grid[row+1][col] == '1') mark(grid, row + 1, col)    // 상
        if (row > 0 && grid[row -1][col] == '1') mark(grid, row - 1, col)               // 하
        if (col > 0 && grid[row][col - 1] == '1') mark(grid, row, col -1)                // 좌
        if (col < grid[row].size -1 && grid[row][col + 1] == '1') mark(grid, row, col +1) // 우
    }
}

fun main() {
    val grid1 = arrayOf(
        charArrayOf('1','1','1','1','0'),
        charArrayOf('1','1','0','1','0'),
        charArrayOf('1','1','0','0','0'),
        charArrayOf('0','0','0','0','0')
    )

    val grid2 = arrayOf(
        charArrayOf('1','1','0','0','0'),
        charArrayOf('1','1','0','0','0'),
        charArrayOf('0','0','1','0','0'),
        charArrayOf('0','0','0','1','1')
    )

    val s = Solution()
    println(s.numIslands(grid1))
    println(s.numIslands(grid2))
}