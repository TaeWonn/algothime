package month_11.week_3;

import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            int value = sc.nextInt();
            boolean[][] arr = new boolean[value][value];
            boolean diagonalX = true;
            boolean diagonalY = true;
            boolean result = true;

            for (int j = 0; j < value; j++) {
                String ox = sc.next();
                for (int x = 0; x < ox.length(); x ++) if (ox.charAt(x) == 'o') arr[j][x] = true;
            }

            for (int x = 0; x < arr.length; x++) {
                //가로
                result = true;
                row: for (int y=0;y<arr[x].length;y++) {
                    if(!arr[x][y]) {
                        result = false;
                        break row;
                    }
                }
                if (result) break;

                //세로
                result = true;
                column: for(int y=0; y<arr[x].length;y++) {
                    if(!arr[y][x]) {
                        result = false;
                        break column;
                    }
                }
                if (result) break;

                //대각선
                if (!arr[x][x]) diagonalX = false;
                if (!arr[x][arr.length - x-1]) diagonalY = false;
            }
            if (result || diagonalX || diagonalY) result = true;

            println(i, result ? "YES" : "NO");
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
