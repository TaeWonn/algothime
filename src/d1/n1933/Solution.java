package d1.n1933;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1;i<n;i++){
            for(int j = i+1; j<=n; j++) {
                if (i * j == n) {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        System.out.println(list.stream().sorted().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
