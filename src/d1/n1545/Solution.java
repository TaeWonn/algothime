package d1.n1545;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        for(int i=new Scanner(System.in).nextInt(); i> -1; i--) {
            System.out.print(i);
            if (i !=0) System.out.print(" ");
        }
    }
}
