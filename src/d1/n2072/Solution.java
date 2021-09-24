package d1.n2072;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(Solution.class.getResource("").getPath() + "/input.txt"));
        Scanner sc = new Scanner(System.in);

        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            int result = IntStream.range(0,10)
                    .map(j-> sc.nextInt())
                    .filter(j -> (j & 1) == 1)
                    .sum();
            System.out.println("#" + i + " " + result);
        });
    }
}
