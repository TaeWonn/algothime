import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Solution {

    private static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        IntStream.rangeClosed(1, testCase).forEach(i -> {
            final List<Integer> NTP = getNextLine();
            HashMap<Integer, Long> suc = new HashMap<>();
            HashMap<Integer, Long> ok = new HashMap<>();

            IntStream.rangeClosed(1, NTP.get(0)).forEach(j -> {
                List<Integer> score = getNextLine();
                AtomicInteger index = new AtomicInteger();

                score.stream().filter(x -> x.equals(0)).forEach(x -> {
                    Integer idx = index.getAndIncrement();

                    if (x.equals(0)) {
                        suc.put(idx + 1, suc.getOrDefault(idx, 0L) + 1L);
                    }
                });
            });

            List<Long> collect = LongStream.rangeClosed(1, NTP.get(0))
                    .map(row -> solution(suc, suc.get(row), (int) row))
                    .boxed()
                    .collect(Collectors.toList());

            System.out.println("#"+ i + " " + suc.get(NTP.get(2)) + " " + collect.get(NTP.get(2) - 1));
        });
    }

    public static List<Integer> getNextLine() {
        return Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
    }

    public static long solution(Map<Integer, Long> map, long score, Integer p) {
        long n0 = map.entrySet().stream()
                .filter(s -> s.getValue() > score)
                .count();
        long n1 = 0L;
        long n2 = map.entrySet().stream()
                .filter(s -> s.getValue() == score)
                .filter(s -> s.getKey() < p)
                .count();
        return n0 + n1 + n2;
    }
}