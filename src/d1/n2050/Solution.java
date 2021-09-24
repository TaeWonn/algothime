package d1.n2050;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.stream(sc.next().split("")).map(i -> String.valueOf(i.charAt(0) - 64)).collect(Collectors.joining(" ")));
    }
}
