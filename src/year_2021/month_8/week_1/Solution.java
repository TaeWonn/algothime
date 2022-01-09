package year_2021.month_8.week_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(Solution.class.getResource("").getPath()+ "/input.txt"));
        Scanner sc = new Scanner(System.in);

        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            int num = sc.nextInt();
            int maxC = sc.nextInt();
            int result = 0;

            int[][] dp = new int[num][maxC];

//            List<Map.Entry<Integer, Integer>> list = IntStream.range(0, num)
//                .mapToObj(j -> new AbstractMap.SimpleEntry(sc.nextInt(), sc.nextInt()))
//                .collect(Collectors.toList());

//            IntStream.rangeClosed(1, num).forEach(x ->
//                IntStream.rangeClosed(1, maxC).forEach(y -> {
//                    dp[x][y] = dp[x -1][y];
//                    if (y - list.get(x -1).getKey() >= 0){}
//                })
//            );
//
//            System.out.println("#" + i + "" + result);
        });
    }
}
