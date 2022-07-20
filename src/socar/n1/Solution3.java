package socar.n1;

import java.util.Arrays;

public class Solution3 {
    public int solution(int[] play_list, int listen_time) {
        int answer = 0;
        int current = 0;
        int currentPlayIdx = 0;
        int playtime = 0;

        int sum = Arrays.stream(play_list).sum();

        if (sum < listen_time) {
            return play_list.length;
        }

        w: while (true) {
            if (current + listen_time > sum) break;
            int listenMusic = 0;

            int currentTime = listen_time - play_list[currentPlayIdx] + playtime;

            f: for (int i = 1; i <= listen_time ; i ++) {
                listenMusic ++;
                if (currentTime < 0) {
                    break f;
                }
                int next = play_list[currentPlayIdx + i];
                currentTime = currentTime - next;
            }

            answer = Math.max(listenMusic, answer);

            if (playtime == play_list[currentPlayIdx] ){
                currentPlayIdx++;
                playtime = 0;
            } else {
                playtime++;
            }
            current ++;
        }


        return answer;
    }

    public static void main(String[] args) {
        var s = new Solution3();

        var r= s.solution(new int[] {2,3,1,4}, 3);
        var r2= s.solution(new int[] {1,2,3,4}, 5);
        var r3= s.solution(new int[] {1,2,3,4}, 20);
        System.out.println(r);
        System.out.println(r2);
        System.out.println(r3);
    }
}
