package d1.n2056;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            String y = sc.next();
            int yyyy = Integer.parseInt(y.substring(0, 4));
            int mm = Integer.parseInt(y.substring(4, 6));
            int dd = Integer.parseInt(y.substring(6, 8));
            DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            String r = "-1";
            try {
                LocalDate date = LocalDate.of(yyyy, mm, dd);
                r = date.format(df);
            } catch (Exception e) {}
            System.out.println("#"+i+" "+r);
        });
    }
}