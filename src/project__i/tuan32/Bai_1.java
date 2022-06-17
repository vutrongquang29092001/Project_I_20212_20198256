package project__i.tuan32;

import java.util.Scanner;

public class Bai_1 {
    /**
     * Bài 01: Cho trước 1 xâu ký tự là họ tên người đầy đủ nhưng khi nhập có thể thừa một số
     * dấu cách. Hãy xóa đi các dấu cách thừa và in ra họ tên chính xác.
     */
    Scanner sc = new Scanner(System.in);

    public void run() {
        bai_1();
    }

    public void bai_1() {
        System.out.println("nhap xau: ");
        String str = sc.nextLine();
        str = handle(str);
        System.out.print("Anwser: ");
        System.out.println(str);

    }

    public String handle(String str) {
        String[] s = str.split(" ");
        str = "";
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(" ") == false) {

                str += " " + s[i];
                str = str.trim();
            }

        }
        return str.trim();
    }

}
