package year_2022.month_2.week_3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        while (true) {
            String s = sc.readLine();
            if (s == null) break;

            int n = Integer.parseInt(s);
            int cnt = 1;
            int num = 1;
            while (true) {
                if (num % n == 0) break;
                cnt ++;
                num = (num * 10 + 1) % n;
            }
            System.out.println(cnt);
        }
    }

    static class sc {
        static { try { System.setIn(new FileInputStream(Main.class.getResource("").getPath()+ "/input.txt")); } catch (FileNotFoundException e) {} }
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
