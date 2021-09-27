package month_9.week_5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream(Solution.class.getResource("").getPath() + "/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());

        for (int test_case= 1; test_case<=r; test_case++) {
            String[] read = br.readLine().split(" ");
            int a = Integer.parseInt(read[0]);
            int b = Integer.parseInt(read[1]);
            int c = Integer.parseInt(read[2]);
            int d = Integer.parseInt(read[3]);
            int result = Math.min(b,d) - Math.max(a,c);

            System.out.println("#"+test_case+" "+Math.max(result,0));
        }
    }
}
