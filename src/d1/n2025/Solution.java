package d1.n2025;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,new Scanner(System.in).nextInt()).sum());
    }
}
