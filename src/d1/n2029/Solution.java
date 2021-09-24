package d1.n2029;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("#"+i+" " + (a/b) + " "+ (a%b));
        });
    }
}
