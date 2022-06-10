package project_i.tuan32;

import java.io.*;
import java.util.Scanner;

public class Bai_8 {

    /**
     * Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có
     * phần đệm là “Thị”.
     */
    Scanner sc = new Scanner(System.in);
    Bai_1 b1 = new Bai_1();

    public void run() {

        bai_8(input());

    }

    public String[] input() {
        String[] str = new String[256];
        System.out.println("Nhập số n");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap danh sach ten: ");
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();

        }
        return str;
    }

    public int bai_8(String[] str) {
        int n = str.length;
        int count = 0;
        for (int i = 0; i < n; i++) {

            String temp = handle(str[i]);
            if (temp == null) {
                continue;
            }

            if (temp.equals("Thi")) {
                count++;
            }
        }
        System.out.println("So ban có phần đệm \"Thi\": " + count);
        return count;
    }

    public String handle(String str) {
        str = b1.handle(str);
        String[] s = str.split(" ");
        if (s.length == 2) {
            return null;
        } else if (s.length == 3) {
            return s[1];
        } else if (s.length > 3) {
            str = "";
            for (int i = 1; i <= s.length - 2; i++) {
                str += " " + s[i];
            }
            return str;
        }
        return null;
    }
}
