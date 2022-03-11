package year_2022.month_3.week_1

class Solution {
    private lateinit var board: Array<CharArray>

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        this.board = board

        return when {
            !validLineX() -> false
            !validLineY() -> false
            !validBox() -> false
            else -> true
        }
    }

    private fun validLineX(): Boolean {
        board.forEach { line -> 
            val hash = HashSet<Char>()
            var numberCount = 0

            line.forEach { 
                if (it == '.') return@forEach

                hash.add(it)
                numberCount++
            }
            if (hash.size != numberCount) return false
        }

        return true
    }

    private fun validLineY(): Boolean {
        for (y in 0..8) {
            val hash = HashSet<Char>()
            var numberCount = 0

            x@ for (x in 0 .. 8) {
                if (board[x][y] == '.') continue@x
                hash.add(board[x][y])
                numberCount++
            }
            if (hash.size != numberCount) return false
        }
        return true
    }

    private fun validBox(): Boolean {
        for (y in 3..9 step 3) {
            for (x in 3..9 step 3) {
                if (!validSmallBox(x -3, x, y -3, y)) return false
            }
        }
        return true
    }

    private fun validSmallBox(startX: Int, endX: Int, startY: Int, endY: Int): Boolean {
        val hash = HashSet<Char>()
        var numberCount = 0

        for (i in startY until endY) {
            j@ for (j in startX until endX) {
                if (board[i][j] == '.') continue@j
                hash.add(board[i][j])
                numberCount++

                if (hash.size != numberCount) return false
            }
        }
        return true
    }
}

fun main() {
    var a = arrayOf(
        charArrayOf('5','3','.','.','7','.','.','.','.')
        ,charArrayOf('6','.','.','1','9','5','.','.','.')
        ,charArrayOf('.','9','8','.','.','.','.','6','.')
        ,charArrayOf('8','.','.','.','6','.','.','.','3')
        ,charArrayOf('4','.','.','8','.','3','.','.','1')
        ,charArrayOf('7','.','.','.','2','.','.','.','6')
        ,charArrayOf('.','6','.','.','.','.','2','8','.')
        ,charArrayOf('.','.','.','4','1','9','.','.','5')
        ,charArrayOf('.','.','.','.','8','.','.','7','9'))

    val r = Solution().isValidSudoku(a)
    println(r)

    val b = arrayOf(
        charArrayOf('8','3','.','.','7','.','.','.','.')
        ,charArrayOf('6','.','.','1','9','5','.','.','.')
        ,charArrayOf('.','9','8','.','.','.','.','6','.')
        ,charArrayOf('8','.','.','.','6','.','.','.','3')
        ,charArrayOf('4','.','.','8','.','3','.','.','1')
        ,charArrayOf('7','.','.','.','2','.','.','.','6')
        ,charArrayOf('.','6','.','.','.','.','2','8','.')
        ,charArrayOf('.','.','.','4','1','9','.','.','5')
        ,charArrayOf('.','.','.','.','8','.','.','7','9'))

    val r2 = Solution().isValidSudoku(b)
    println(r2)

    val c = arrayOf(
        charArrayOf('.','.','4','.','.','.','6','3','.'),
        charArrayOf('.','.','.','.','.','.','.','.','.'),
        charArrayOf('5','.','.','.','.','.','.','9','.'),
        charArrayOf('.','.','.','5','6','.','.','.','.'),
        charArrayOf('4','.','3','.','.','.','.','.','1'),
        charArrayOf('.','.','.','7','.','.','.','.','.'),
        charArrayOf('.','.','.','5','.','.','.','.','.'),
        charArrayOf('.','.','.','.','.','.','.','.','.'),
        charArrayOf('.','.','.','.','.','.','.','.','.')
    )
    val r3 = Solution().isValidSudoku(c)
    println(r3)
}