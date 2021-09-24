package d1.n2058;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.stream(sc.next().split("")).mapToInt(Integer::parseInt).sum());
    }
}
