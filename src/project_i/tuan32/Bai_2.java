package project_i.tuan32;

import java.util.Scanner;

public class Bai_2 {
    /**
     * Bài 02: Cho trước xâu ký tự bất kỳ. Hãy đếm xem trong xâu có bao nhiêu lần
     * xuất hiện xâu con “abc”
     */
    Scanner sc = new Scanner(System.in);

    public void run() {
        bai_2();
    }

    public void bai_2() {
        System.out.println("nhap xau: ");
        String str = sc.nextLine();
        System.out.println("nhap xau con: ");
        String s = sc.nextLine();
        int a = str.length();
        int b = s.length();
        String[] temp = str.split(s);
        String ss = "";
        for (int i = 0; i < temp.length; i++) {
            ss += temp[i];
        }
        int anwser = (a - ss.length()) / b;
        System.out.println("so lan xuat hien: " + anwser);
    }
}
