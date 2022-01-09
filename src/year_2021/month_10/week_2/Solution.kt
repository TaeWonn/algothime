package year_2021.month_10.week_2

//fun solution(s: IntArray): Int {
//    var result = 0
//    for(i in 1..s.size/2) {
//        var cnt = 1
//        var str = ""
//        for (j in 0..i) {
//            if (s.substring(i-j, j+1) == s.substring((i-j+1)*2, i*2)) cnt ++
//            else {
//                str += if (cnt == 1) s.substring(i-j, j)
//                    else "$cnt${s.substring(i-j, j)}"
//            }
//            result += str.length
//        }
//    }
//    return result
//}
//
//
//fun main() {
//    solution("aabbaccc")
//}