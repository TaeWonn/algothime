package socar.n1;

public class Solution2 {
    public int solution(String[] moves) {
        int answer = 0;

        for (int i = 0 ; i< moves.length -3 ; i ++) {

            if (hasBox(moves[i], moves[i +1], moves[i +2], moves[i+3])) {
                answer ++;
                i = i + 4;
            }
        }

        return answer;
    }

    private boolean hasBox(String s1, String s2, String s3, String s4) {
        UDLR[] arr = new UDLR[] { UDLR.parse(s1), UDLR.parse(s2), UDLR.parse(s3), UDLR.parse(s4) };
        boolean[] result = new boolean[4];

        for (UDLR udlr: arr) {
            if (udlr == UDLR.U) result[0] = true;
            if (udlr == UDLR.D) result[1] = true;
            if (udlr == UDLR.L) result[2] = true;
            if (udlr == UDLR.R) result[3] = true;
        }
        for (boolean r: result) {
            if (!r) return false;
        }
        return true;
    }

    enum UDLR {
        U, D, L, R;

        public static UDLR parse(String s) {
            if (s.equals("U")) return UDLR.U;
            if (s.equals("D")) return UDLR.D;
            if (s.equals("L")) return UDLR.L;
            if (s.equals("R")) return UDLR.R;
            throw new RuntimeException();
        }

    }

    public static void main(String[] args) {
        var s = new Solution2();
        var a1 = new String[] { "U", "R", "D", "L", "U", "R", "D", "L"};
        var a2 = new String[] { "U", "U", "R", "D", "L", "L", "L", "U", "R", "D", "D", "D", "L", "U", "R", "R", "R", "D", "L", "U"};
        var a3 = new String[] { "U", "L", "D", "R", "R", "D", "D", "L", "U", "U"};
        System.out.println(s.solution(a1));
        System.out.println(s.solution(a2));
        System.out.println(s.solution(a3));
    }
}
