package project__i.tuan32;

import java.util.Scanner;

public class Bai_2 {

    /**
     * Bài 02: Cho trước xâu ký tự bất kỳ. Hãy đếm xem trong xâu có bao nhiêu
     * lần xuất hiện xâu con “abc”
     */
    Scanner sc = new Scanner(System.in);

    public void run() {
        bai_2(input());
    }

    public String[] input() {
        String[] s = new String[2];
        System.out.println("nhap xau: ");
        s[0] = sc.nextLine();
        System.out.println("nhap xau con: ");
        s[1] = sc.nextLine();
        return s;
    }

    public int bai_2(String[] s) {
        String str = s[0];
        String s1 = s[1];
        int a = str.length();
        int b = s1.length();
        String[] temp = str.split(s1);
        String ss = "";
        for (int i = 0; i < temp.length; i++) {
            ss += temp[i];
        } 
        int anwser = (a - ss.length()) / b;
        System.out.println("so lan xuat hien: " + anwser);
        return anwser;
    }
}
