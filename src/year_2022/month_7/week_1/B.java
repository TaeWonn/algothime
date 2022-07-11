package year_2022.month_7.week_1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder str = new StringBuilder();

        IntStream.range(0, a).forEach(value -> {
            str.append("*");
            System.out.println(str.toString());
        });
    }

}
