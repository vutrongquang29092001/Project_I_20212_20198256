package project_i.tuan32;

import java.util.Scanner;

public class Bai_3 {
    /**
     * Bài 03: Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần tên của người này
     */
    Scanner sc = new Scanner(System.in);
    Bai_1 b1 = new Bai_1();

    public void run() {
        bai_3();
    }

    public void bai_3() {
        System.out.println("nhap xau: ");
        String str = sc.nextLine();
        str = handle(str);
        String[] temp = str.split(" ");
        System.out.println("Ten: " + temp[temp.length - 1]);
    }

    public String handle(String str) {
        return b1.handle(str);
    }
}
