package year_2021.month_9.week_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(Solution.class.getResource("").getPath()+ "/input.txt"));
        Scanner sc = new Scanner(System.in);

        IntStream.rangeClosed(1, 10).forEach(i -> {
            int result = 0;
            int range = sc.nextInt();
            int[] arr = IntStream.range(0, range).map(x -> sc.nextInt()).toArray();

            for (int j = 0; j < range; j ++) {
                int[] arr2 = new int[] { 0, 0, 0, 0 };
                if (j > 0) arr2[0] = arr[j -1];
                if (j > 1) arr2[1] = arr[j -2];
                if (j <= range -2) arr2[2] = arr[j + 1];
                if (j <= range -3) arr2[3] = arr[j + 2];
                result += calc(arr2, arr[j]);
            }
            System.out.println("#" + i + " " + result);
        });
    }

    static int calc(int[] arr2, int current) {
        int max = Arrays.stream(arr2).max().getAsInt();
        //System.out.println("current: " + current +", max: " + max + ", result: " + Math.max(0, current - max));
        return Math.max(0, current - max);
    }
}
