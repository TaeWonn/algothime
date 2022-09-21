package year_2022.month_9.week_3;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class Solution4 {
    public String solution(String[] log) {
        long studyTime = 0L;
        for (int i = 0; i < log.length; i += 2) {
            int[] startTime = parse(log[i]);
            int[] endTime = parse(log[i + 1]);

            LocalTime start = LocalTime.of(startTime[0], startTime[1]);
            LocalTime end = LocalTime.of(endTime[0], endTime[1]);

            long realStudyTime = start.until(end, ChronoUnit.MINUTES);
            if (realStudyTime < 5) continue;

            if (realStudyTime > 105) {
                studyTime += 105;
            } else {
                studyTime += realStudyTime;
            }

        }

        long hour = studyTime / 60;
        long minute = studyTime % 60;

        return padding(hour) + ":" + padding(minute);
    }

    private int[] parse(String str) {
        return Arrays.stream(str.split(":"))
                .map(Integer::parseInt)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private String padding(long value) {
        return value > 9 ? String.valueOf(value) : "0" + value;
    }
    public static void main(String[] args) {
        Solution4 s = new Solution4();

        String[] arr = new String[] {"08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"};

        System.out.println(s.solution(arr));

    }
}
