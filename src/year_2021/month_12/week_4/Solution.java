package year_2021.month_12.week_4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Solution {

    LinkedList<Integer> poll;
    public int solution(int[] people, int limit) {
        int answer = 0;

        poll = new LinkedList(Arrays.stream(people).sorted().boxed().collect(Collectors.toList()));

        while (poll.size() > 0) {
            int max = poll.pollLast();
            check(0, max, limit);
            answer ++;
        }

        return answer;
    }

    int check(int curr, int max, int limit) {
        Integer last = poll.peekFirst();
        if (last == null) last = 0;
        if (limit < max + last) {
            return curr;
        } else {
            Integer next = poll.pollFirst();
            if (next == null) return curr;
           return check(curr + last, max + next, limit);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{70, 50, 80, 50}, 100));
        System.out.println(new Solution().solution(new int[]{70, 80, 50}, 100));
    }
}
