package project_i.tuan32;

import java.io.*;
import java.util.Scanner;

public class Bai_9 {
    /**
     * Bài 09: Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn  có tên bắt
     * đầu bằng chữ “H”.
     */
    Scanner sc = new Scanner(System.in);
    Bai_1 b1 = new Bai_1();

    public void run() {
        try {
            bai_9();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void bai_9() throws IOException {

        String[] str = new String[256];
        System.out.println("Nhập số n");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap danh sach ten: ");
        for(int i = 0; i < n ; i++ ){
            str[i] = sc.nextLine();

        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(str[i].equals("")){
                break;
            }
            String[] s = b1.handle(str[i]).split(" ");
            if (s[s.length - 1].startsWith("H")) {
                count++;
            }

        }
        System.out.println("So ban có tên bắt đầu \"H\": " + count);
    }
}
