package project_i.tuan32;

import java.util.Scanner;

public class Bai_6 {
    /**
     * Bài 06: Cho trước xâu ký tự S, in ra xâu S1 ngược lại xâu S.
     */
    Scanner sc = new Scanner(System.in);

    public void run() {
        bai_6();
    }

    public void bai_6() {
        System.out.println("nhap xau: ");
        String str = sc.nextLine();
        char[] temp = str.toCharArray();
        str = "";

        for (int i = temp.length-1; i >=0; i--) {
            str += temp[i];
        }
        System.out.println("anwser: "+str);
    }
}
