package year_2021.month_11.week_4;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            boolean result = false;
            String[] arr = sc.next().split("");
            Map<String, Integer> map = new HashMap<>();
            Arrays.stream(arr).forEach(j -> map.put(j , map.getOrDefault(j, 0) + 1));

            Set<Map.Entry<String, Integer>> entries = map.entrySet();
            if (entries.size() == 2) {
                result = true;
                Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
                while (iterator.hasNext()) {
                    if (iterator.next().getValue() != 2) {
                        result= false;
                        break;
                    }
                }
            }
            println(i , result ? "Yes" : "No");
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
