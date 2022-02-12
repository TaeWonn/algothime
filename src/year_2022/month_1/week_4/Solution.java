package year_2022.month_1.week_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] prices) {
        List<Integer> answer = new ArrayList<>();
        a:for (int i = 0; i < prices.length; i ++) {
            int current = prices[i];
            int count = 0;

            if (i == prices.length-1) {
                answer.add(0);
                break a;
            }

            b:for (int j= i; j < prices.length; j ++) {
                if(current > prices[j]) {
                    answer.add(count);
                    break b;
                }

                if (j == prices.length -1) {
                    answer.add(count);
                }
                count ++;
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3};
        String r = Arrays.toString(new Solution().solution(arr));
        System.out.println(r);
    }
}
