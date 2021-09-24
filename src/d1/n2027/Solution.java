package d1.n2027;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        IntStream.range(0,5).forEach(i -> {
            String[] r = {"+","+","+","+","+"};
            r[i]="#";
            System.out.println(Arrays.stream(r).collect(Collectors.joining("")));
        });
    }
}
