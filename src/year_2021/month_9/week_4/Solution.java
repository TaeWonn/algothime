package year_2021.month_9.week_4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(Solution.class.getResource("").getPath() + "/input.txt"));
        Scanner sc = new Scanner(System.in);

        IntStream.rangeClosed(1, 10).forEach(i -> {
            int length = sc.nextInt();
            List<Integer> t = Arrays.asList(sc.next().split(""))
                    .stream()
                    .mapToInt(Integer::parseInt)
                    .boxed()
                    .collect(Collectors.toList());

            int prev = -1;
            int index = 0;

            while (index < t.size()) {

                if (prev == t.get(index)) {
                    t.remove(index);
                    t.remove(index - 1);
                    index = 0;
                    prev = -1;
                }
                prev = t.get(index);
                index ++;
            }
            String result = t.stream().map(String::valueOf).collect(Collectors.joining(""));
            System.out.println("#" + i + " " + result);
        });

    }
}
