package month_9.week_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Solution {
    static AtomicInteger result = new AtomicInteger(1);

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(Solution.class.getResource("").getPath()+ "/input.txt"));
        Scanner sc = new Scanner(System.in);

        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            int t = sc.nextInt();
            int[] arr = IntStream.range(1, t).toArray();
            int[] out = new int[arr.length];
            boolean[] visit = new boolean[arr.length];

            for (int j = 1; j <= arr.length; j++) {
                calc(arr, out, visit, 0, arr.length, j, t);
            }

            System.out.println("#" + i + " " + result.get());
            result.set(1);
        });
    }

    private static void calc(int[] arr, int[] out, boolean[] visit, int depth, int length, int cnt, int t) {
        if (cnt == 0) {
            if (Arrays.stream(out).sum() == t) result.incrementAndGet();
            return;
        }

        for (int i=0; i< length; i++) {
            if (visit[i] != true) {
                visit[i] = true;
                out[depth] = arr[i];
                calc(arr, out, visit, depth +1, length, cnt -1, t);
                visit[i] = false;
            }
        }
    }


}
