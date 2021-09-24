package d1.n2019;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt() + 1;
        int[] r = new int[n];
        r[0] = 1;
        for (int i=1;i<n;i++) {
            r[i] = r[i-1] * 2;
        }

        System.out.println(Arrays.stream(r).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}
