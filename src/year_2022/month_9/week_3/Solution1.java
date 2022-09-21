package year_2022.month_9.week_3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution1 {
    public int[] solution(int[][] v) {
        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();

        for (int[] arr : v) {
            put(xMap, arr[0]);
            put(yMap, arr[1]);
        }

        return new int[] { get(xMap), get(yMap) };
    }

    private void put(Map<Integer, Integer> map, int key) {
        int mapValue = map.getOrDefault(key, 0);
        map.put(key, mapValue + 1);
    }

    private int get(Map<Integer, Integer> map) {
        return map.entrySet()
                .stream()
                .filter(entry -> entry.getKey() == 1)
                .findFirst().get()
                .getKey();
    }
}
