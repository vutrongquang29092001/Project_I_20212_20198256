package project__i.tuan32;

import java.util.Scanner;

public class Bai_4 {

    /**
     * Bài 04: Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần họ
     * của người này
     */
    Scanner sc = new Scanner(System.in);
    Bai_1 b1 = new Bai_1();

    public void run() {
        bai_4(input());
    }

    public String input() {
        System.out.println("nhap xau: ");
        String str = sc.nextLine();
        return str;
    }

    public String bai_4(String str) {

        str = handle(str);
        String[] temp = str.split(" ");
        System.out.println("Ho: " + temp[0]);
        return temp[0];
    }

    public String handle(String str) {
        return b1.handle(str);
    }

}
