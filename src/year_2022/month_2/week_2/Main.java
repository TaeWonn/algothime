package year_2022.month_2.week_2;

import java.io.*;
import java.util.*;

public class Main {
    static int size = 2;
    static int[][] map;
    static int mapSize;
    static int left = 0;
    static int result = 0;

    public static void main(String[] args) {
        int currentX = 0;
        int currentY = 0;
        mapSize = sc.nextInt();
        int noneCount = 0;
        map = new int[mapSize][mapSize];

        for(int i = 0 ; i < mapSize; i++) {
            map[i] = Arrays.stream(sc.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for(int i = 0 ; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if (map[i][j] == 0) {
                    noneCount++;
                    left++;
                }
                if (map[i][j] == 9) {
                    currentX = i;
                    currentY = j;
                }
            }
        }

        if (mapSize - 1 == noneCount) {
            System.out.println(result);
            return;
        }

        while (true) {
            var search = search(currentX, currentY);

            if (search.getKey() == -1) break;
        }
        System.out.println(result);
    }

    static AbstractMap.SimpleEntry<Integer, Integer> search(int x, int y) {
        if (mapSize - 1 == left) {
            return new AbstractMap.SimpleEntry(-1, -1);
        }
        //todo
        // 가장 가까운 먹이 찾기
        // 가까운게 여러개일 때 우선순위 1. 위 2. 왼쪽
        int targetX = 0;
        int targetY = 0;

        // 먹기
        result++;
        map[targetX][targetY] = 0;
        left --;

        return new AbstractMap.SimpleEntry(x, y);
    }

    static void println(int i, Object target) { System.out.println(new StringBuilder().append("#").append(i).append(" ").append(target)); }
    static void println(int i, Object... target) { StringBuilder builder = new StringBuilder().append("#").append(i);for (Object o: target) { builder.append(" ").append(o); } System.out.println(builder); }
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
