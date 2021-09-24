package month_6.week_4;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        List<Integer> collect = IntStream.rangeClosed(1, testCase)
                .mapToObj(i -> sc.nextInt())
                .collect(Collectors.toList());

        int max = collect.stream()
                .max(Comparator.comparing(x -> x))
                .get()
                .intValue();

        AtomicInteger val = new AtomicInteger(-1);
        AtomicInteger row = new AtomicInteger(0);
        List<List<Integer>> pyramid = IntStream.rangeClosed(1, max)
                .mapToObj(i -> {
                    row.addAndGet(2);
                    return IntStream.range(1, row.get())
                            .mapToObj(j -> val.addAndGet(2))
                            .collect(Collectors.toList());
                })
                .collect(Collectors.toList());

        AtomicInteger index = new AtomicInteger(1);
        collect.forEach(i -> {

            int idx = index.getAndAdd(1);
            int first = pyramid.get(i  - 1).stream().findFirst().get();
            int last = pyramid.get(i -1 ).get(pyramid.get(i - 1).size() - 1);
            System.out.println("#" + idx + " " + first + " " +  last);
        });
    }
}
