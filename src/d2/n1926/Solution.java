package d2.n1926;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, new Scanner(System.in).nextInt()).forEach(i -> {
            if (i != 1) System.out.print(" ");
            String r = String.valueOf(i);
            byte[] b = r.getBytes();
            for (int j=0;j<b.length;j++) {
                if (b[j] == '3'||b[j] == '6'||b[j] == '9'){
                    if (r.startsWith("-")) r += "-";
                    else r = "-";
                }
            }
            System.out.print(r);
        });
    }
}
