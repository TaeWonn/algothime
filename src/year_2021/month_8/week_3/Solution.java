package year_2021.month_8.week_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Solution {
    private static BigDecimal MILL = BigDecimal.valueOf(100L);

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(Solution.class.getResource("").getPath()+ "/input.txt"));
        Scanner sc = new Scanner(System.in);

        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            BigDecimal num = new BigDecimal(sc.next());
            AtomicInteger x = new AtomicInteger(1);
            float result = 1.0F;

            if (num.compareTo(BigDecimal.TEN) >= 1) {
                result = calc(num, x);
            }

            System.out.println("#" + i + " " + result + "*10^" + x.get());
        });
    }

    private static float calc(BigDecimal num, AtomicInteger x) {
        if (num.compareTo(MILL) < 0) {
            float v = Math.round(num.floatValue()) / 10F;
            if (v == 10F) {
                x.incrementAndGet();
                return 1.0F;
            }
            return v;
        } else {
            x.incrementAndGet();
            return calc(num.divide(BigDecimal.TEN), x);
        }
    }
}
