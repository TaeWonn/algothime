package year_2022.month_9.week_3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder star = new StringBuilder().append("*");

        IntStream.rangeClosed(1, a).forEach(it -> {
            System.out.println(star);
            star.append("*");
        });
    }
}
