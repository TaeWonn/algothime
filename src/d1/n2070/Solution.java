package d1.n2070;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            int l = sc.nextInt();
            int r = sc.nextInt();
            String result = "";
            if (l > r) result = ">";
            if (l == r) result = "=";
            if (l < r) result = "<";
            System.out.println("#"+i+" "+result);
        });
    }
}
