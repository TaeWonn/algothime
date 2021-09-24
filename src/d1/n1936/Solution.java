package d1.n1936;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean r = false;
        if (a==1) r = b==2 ? false: true;
        if (a==2) r = b==1 ? true:false;
        if(a==3) r = b==1 ? false:true;
        System.out.println(r ?"A":"B");
    }
}
