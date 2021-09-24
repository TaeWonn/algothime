package month_7.week_4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(Solution.class.getResource("").getPath()+ "/input.txt"));
        Scanner sc = new Scanner(System.in);
        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            boolean result = true;
            int n = sc.nextInt(); // 사람 수
            int m = sc.nextInt(); // 붕어빵 만드는 시간
            int k = sc.nextInt(); // 한번에 만든 붕어빵 갯수

            List<Integer> list = IntStream.range(0, n).map(j -> sc.nextInt())
                    .boxed()
                    .collect(Collectors.toList());

            int time = list.stream().mapToInt(x -> x.intValue()).sum();
            Queue<Integer> queue = new ArrayDeque(list);
            int prefix = queue.poll();

            int bang = 0;

            for (int j = 1; j <= time; j ++ ) {
                if (j % m == 0) bang += k;
                if (j == prefix) {
                    bang --;
                    if (bang < 1) { result = false; break; }
                    Integer next = queue.poll();
                    prefix = prefix + (next == null ? 0 : next);
                }
            }

            System.out.println("#"+i+ " "+ (result? "Possible":"Impossible"));
        });
    }
}
