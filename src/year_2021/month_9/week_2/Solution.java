package year_2021.month_9.week_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(Solution.class.getResource("").getPath()+ "/input.txt"));
        Scanner sc = new Scanner(System.in);

        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            int result = 0;

            int now = sc.nextInt();
            int after = sc.nextInt();

            result = now + after;

            if (result >= 24) {
                result -= 24;
            }

            System.out.println("#"+ i + " " + result);
        });
    }
}
