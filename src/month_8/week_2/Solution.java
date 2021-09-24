package month_8.week_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(Solution.class.getResource("").getPath()+ "/input.txt"));
        Scanner sc = new Scanner(System.in);


        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            int[] arr = IntStream.range(0, 7).map(j -> sc.nextInt()).toArray();
            int[] out = new int[3];
            boolean[] visit = new boolean[arr.length];
            Set<Integer> set = new HashSet<>();

            calc(0, arr, visit, out, set);

            List list = new ArrayList(set);
            Collections.sort(list);
            System.out.println("#" + i + " " + list.get(list.size() -5));
        });


    }

    private static void calc(int i,int[] arr, boolean[] visit, int[] out, Set<Integer> set) {
        if (i == out.length) {
            int sum = Arrays.stream(out).sum();
            set.add(sum);
            return;
        }
        for (int j =0; j < arr.length; j ++) {
            if (!visit[j]) {
                visit[j] = true;
                out[i] = arr[j];
                calc(i+1, arr, visit, out, set);
                visit[j] = false;
            }
        }
    }
}
