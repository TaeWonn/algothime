package month_8.week_4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(Solution.class.getResource("").getPath()+ "/input.txt"));
        Scanner sc = new Scanner(System.in);

        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            int size = sc.nextInt();
            int[][] arr = new int[size][size];
            int k = 1;
            int right = -1;
            int bottom = 0;
            int top = 1;

            for(int x=5; x>0; x--) {

                for(int j=0; j<size; j++) {
                    right += top;
                    arr[bottom][right] = k;
                    k++;
                }

                size--;

                for(int j=0; j<size; j++) {
                    bottom += top;
                    arr[bottom][right] = k;
                    k++;
                }

                top = top * (-1);
            }

            System.out.println("#"+ i + "\n" + Arrays.stream(arr)
                    .map(x -> Arrays.stream(x).mapToObj(String::valueOf).collect(Collectors.joining(" ")))
                    .collect(Collectors.joining("\n")));
        });
    }
}