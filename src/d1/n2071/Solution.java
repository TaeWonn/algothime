package d1.n2071;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            float r = Math.round((float)IntStream.range(0, 10).map(j-> sc.nextInt()).sum() / 10);
            System.out.println("#"+i+" "+ (int)r);
        });
    }
}
