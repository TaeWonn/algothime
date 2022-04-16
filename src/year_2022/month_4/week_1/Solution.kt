package year_2022.month_4.week_1

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n : Int): Unit {
        var p1 = m - 1 // num1 길이
        var p2 = n - 1 // num2 길이
        var totalSize = m + n - 1

        for(i in totalSize downTo 0) {
            // num2 0 미만이면, 모두 체크한걸로
            if(p2 < 0) return

            // p1이 0 이상이면서, 현재 인덱스의 값이 nums1이 더크면 num1 대입, 아니면 num2 대입
            if(p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1]
                p1--
            } else {
                nums1[i] = nums2[p2]
                p2--
            }
        }
    }
}

fun main() {
    val s = Solution()
    val arr1 = intArrayOf(1,2,3,0,0,0,0)
    val arr2 = intArrayOf(2,5,6)
    s.merge(arr1, 3, arr2, 3)
}