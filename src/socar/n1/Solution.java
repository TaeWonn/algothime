package socar.n1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public int solution(int[] goods, int[] boxes) {
        int answer = 0;
        int boxIdx = 0;

        List<Integer> goodsList = Arrays.stream(goods).boxed().collect(Collectors.toList());
        List<Integer> boxList = Arrays.stream(boxes).boxed().collect(Collectors.toList());

        Collections.sort(goodsList);
        Collections.sort(boxList);

        f: for (int good : goodsList) {
            if (boxIdx >boxList.size() - 1) break;

            if (good <= boxList.get(boxIdx)) {
                answer ++;
            } else {
                w: while (true) {
                    boxIdx++;
                    if (boxIdx > boxList.size() - 1) break f;
                    if (good <= boxList.get(boxIdx)) {
                        answer++;
                        break w;
                    }
                }
            }

            boxIdx++;
        }

        return answer;
    }

    public static void main(String[] args) {
        var s = new Solution();
        var r = s.solution(new int[] {5,3,7}, new int[] {3,7,6});
        var r2 = s.solution(new int[] {1,2}, new int[] {2,3,1});
        var r3 = s.solution(new int[] {3,8,6}, new int[] {5,6,4});
        System.out.println(r);
        System.out.println(r2);
        System.out.println(r3);
    }
}
