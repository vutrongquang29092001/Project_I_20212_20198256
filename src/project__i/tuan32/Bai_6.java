package project__i.tuan32;

import java.util.Scanner;

public class Bai_6 {

    /**
     * Bài 06: Cho trước xâu ký tự S, in ra xâu S1 ngược lại xâu S.
     */
    Scanner sc = new Scanner(System.in);

    public void run() {
        bai_6(input());
    }

    public String input() {
        System.out.println("nhap xau: ");
        String str = sc.nextLine();
        return str;
    }

    public String bai_6(String str) {

        char[] temp = str.toCharArray();
        str = "";

        for (int i = temp.length - 1; i >= 0; i--) {
            str += temp[i];
        }
        System.out.println("anwser: " + str);
        return str;
    }
}
