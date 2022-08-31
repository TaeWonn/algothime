package year_2022.month_8.week_4;

public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) answer += absolutes[i];
            else answer -= absolutes[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{4,7,12}, new boolean[]{true, false, true}));
        System.out.println(new Solution().solution(new int[]{1,2,3}, new boolean[]{false, false, true}));
    }

}
