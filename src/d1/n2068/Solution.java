package d1.n2068;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStream.rangeClosed(1, sc.nextInt()).forEach(i-> {
            int r = IntStream.range(0,10).map(j->sc.nextInt()).max().getAsInt();
            System.out.println("#"+i+" "+r);
        });
    }
}
