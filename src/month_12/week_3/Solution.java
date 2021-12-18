package month_12.week_3;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, sc.nextInt()).forEach(i -> {
            HashMap<String, Integer> map = new HashMap<>();
            boolean loop = true;
            String result;
            AtomicReference<Boolean> empty = new AtomicReference<>(true);
            Arrays.stream(sc.next().split("")).forEach(j -> map.put(j, map.getOrDefault(j, 0) + 1));
            if (map.entrySet().stream().filter(x->x.getValue()==1).count() == map.size()) empty.set(false);

            while (true) {
                Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<String, Integer> next = iterator.next();
                    map.put(next.getKey(), next.getValue() - 1);
                    if(loop && next.getValue() < 1) loop = false;
                }
                if(!loop) break;
            }

            map.forEach((s, num) -> { if(num != 0) empty.set(false); });

            if (empty.get()) {
                 result = "Good";
            } else {
                result = get(map);
            }

            println(i, result);
        });

    }
    static String get(HashMap<String, Integer> map) {
        return map.entrySet()
                .stream()
                .filter(x -> x.getValue() == 0)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining(""));
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
