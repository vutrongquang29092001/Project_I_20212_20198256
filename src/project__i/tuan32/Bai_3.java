package project__i.tuan32;

import java.util.Scanner;

public class Bai_3 {

    /**
     * Bài 03: Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần
     * tên của người này
     */
    Scanner sc = new Scanner(System.in);
    Bai_1 b1 = new Bai_1();

    public void run() {
        bai_3(input());
    }

    public String input() {
        System.out.println("nhap xau: ");
        String str = sc.nextLine();
        return str;
    }

    public String bai_3(String str) {

        str = handle(str);
        String[] temp = str.split(" ");
        String ten = temp[temp.length - 1];
        System.out.println("Ten: " + ten );
        return ten;
    }

    public String handle(String str) {
        return b1.handle(str);
    }
}
