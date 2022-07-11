package year_2022.month_7.week_1;

import java.util.HashMap;
import java.util.Map;

public class A {
    public static void main(String[] args) {
        int[][] v = {
                {1,4},
                {3,4},
                {3,10}
        };

        int[] answer = {};
        Map<Integer, Integer> xmap = new HashMap<>();
        Map<Integer, Integer> ymap = new HashMap<>();

        for (int[] arr: v) {
            xmap.put(arr[0], xmap.getOrDefault(arr[0], 0) + 1);
            ymap.put(arr[0], ymap.getOrDefault(arr[0], 0) + 1);
        }

        answer = new int[] { getValue(xmap), getValue(ymap) };
        answer[0] = getValue(xmap);
        answer[1] = getValue(ymap);

        System.out.println(answer);
    }

    static int getValue(Map<Integer, Integer> map) {
        int[] result = {0};
        map.entrySet().forEach(it -> {
            if (it.getValue() != 2) {
                result[0] = it.getKey();
            }
        });

        return result[0];
    }

}
