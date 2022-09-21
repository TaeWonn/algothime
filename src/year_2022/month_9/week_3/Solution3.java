package year_2022.month_9.week_3;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            answer.add(i);
        }
        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
