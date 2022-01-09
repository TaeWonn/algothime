package year_2021.month_7.week_3;

import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Solution {

    private static Set<Integer> values = new HashSet<Integer>();

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream(Solution.class.getResource("").getPath()+ "/input.txt"));
        Scanner sc = new Scanner(System.in);

        for (int i=1; i<10; i++) {
            for (int j=1; j<10; j++) {
                values.add(i * j);
            }
        }

        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            int target = sc.nextInt();
            boolean result = calc(target);

            System.out.println("#"+i+" "+ (result? "Yes": "No"));
        });
    }

    public static boolean calc(int value) {
        if (value < 10) return true;
        if (value > 81) return false;

        if (values.contains(value)) return true;

        return false;
    }
}
