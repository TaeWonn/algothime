package year_2022.month_5.week_3


import kotlin.properties.Delegates

class Solution {
    var sum by Delegates.notNull<Int>()
    fun hasPathSum(root: TreeNode, targetSum: Int): Boolean {
        sum = targetSum
        val result = child(root, 0)

        if (result == sum) return true
        return false
    }

    private fun child (node: TreeNode, resultSum: Int): Int {
        val current = node.`val`?: 0 + resultSum

        if (node.left != null) {
            val r = child(node.left!!, current)
            if (r == sum) return  r
        }

        if (node.right != null) {
            val r = child(node.right!!, current)
            if (r == sum) return  r
        }

        return current
    }
}

class TreeNode(var `val`: Int?) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}