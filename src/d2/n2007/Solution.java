package d2.n2007;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            String a = sc.next();
            int r = 0;
            for (int j =2; j< a.length(); j++) {
                if (a.substring(0,j).equals(a.substring(j, j+j))) {
                    r = j;
                    break;
                }
            }
            System.out.println("#"+i+" "+r);
        });
    }
}
