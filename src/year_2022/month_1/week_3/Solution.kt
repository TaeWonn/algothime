package year_2022.month_1.week_3

import java.util.*
import kotlin.collections.HashMap

class Solution {
    fun solution(record: Array<String>): Array<String> {
        val map = HashMap<String, User>()
        val queue = LinkedList<Action>()

        record.forEach {
            val split = it.split(" ")

            if (split[0] == "Enter") {
                var user = User(split[1], split[2])
                val get = map[user.id]
                if (get != null) {
                    user = get
                    get.nickname = split[2]
                } else {
                    map[user.id] = user
                }
                queue.add(Action(split[0], user))
            } else if (split[0] == "Leave") {
                val user = map[split[1]]!!
                queue.add(Action(split[0], user))
            } else {
                val user = map[split[1]]!!
                user.nickname = split[2]!!
            }
        }

        return queue.map {
            "${it.user.nickname}${convert(it.status)}"
        }.toTypedArray()
    }

    private fun convert(status: String) = when(status) {
        "Enter" -> "님이 들어왔습니다."
        "Leave" -> "님이 나갔습니다."
        "Change" -> "님이 들어왔습니다."
        else -> ""
    }
}
class User(val id: String, var nickname: String)
class Action(val status: String, val user: User)

fun main() {
    val arr = arrayOf(
        "Enter uid1234 Muzi",
        "Enter uid4567 Prodo",
        "Leave uid1234",
        "Enter uid1234 Prodo",
        "Change uid4567 Ryan")
    Solution().solution(arr).forEach { println(it) }
}