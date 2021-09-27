package d2.n2005;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            System.out.println("#"+i+" ");

            for (int j= 1; j <=i; j++) {

            }
        });
    }
}
