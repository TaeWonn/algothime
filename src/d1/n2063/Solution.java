package d1.n2063;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<Integer> list = IntStream.range(0, sc.nextInt()).map(i -> sc.nextInt()).sorted().boxed().collect(Collectors.toList());
        System.out.println(list.get(list.size()/2 ));
    }
}
