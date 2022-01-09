package year_2021.month_11.week_2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    static int[] moneys = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

    public static void main(String[] args) {
        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            int[] result = new int[moneys.length];
            int money = sc.nextInt();

            for (int j = 0; j < moneys.length; j++) {
                result[j] = money / moneys[j];
                money %= moneys[j];
            }

            println(i,"\n"+ Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
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
