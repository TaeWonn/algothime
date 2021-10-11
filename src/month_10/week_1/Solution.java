package month_10.week_1;

import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {

        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            int len = sc.nextInt();
            int result = 1;

            int[] arr = IntStream.range(0, len)
                    .map(j -> sc.nextInt())
                    .toArray();
            int max = arr[1];

            for (int x =2; x < arr.length ; x++) {
                if (arr[i-1]> 0 && arr[i] + arr[i-1]> 0) {
                    arr[i] += arr[i-1];
                }
                if (max < arr[i]) {
                    max = arr[i];
                }
            }

            println(i, result);
        });
    }

    static void println(int i, Object target) { System.out.println(new StringBuilder().append("#").append(i).append(" ").append(target)); }
    static void println(int i, Object... target) { StringBuilder builder = new StringBuilder().append("#").append(i);for (Object o: target) { builder.append(" ").append(o); } System.out.println(builder); }
    static class sc {
        static { try { System.setIn(new FileInputStream(sc.class.getResource("").getPath()+ "/input.txt")); } catch (FileNotFoundException e) {} }
        static { br = new BufferedReader(new InputStreamReader(System.in)); st = new StringTokenizer(""); }
        static BufferedReader br; static StringTokenizer st;
        static String readLine() { try { return br.readLine(); } catch (IOException e) { return null; } }
        static String readLineReplace() { try { return br.readLine().replaceAll("\\s+", "");} catch (IOException e) { return null; } }
        static String next() { while (!st.hasMoreTokens()) { try {st = new StringTokenizer(br.readLine());} catch (IOException e) {} } return st.nextToken(); }
        static long nextLong() { return Long.parseLong(next()); }
        static int nextInt() { return Integer.parseInt(next()); }
        static double nextDouble() { return Double.parseDouble(next()); }
    }
}
