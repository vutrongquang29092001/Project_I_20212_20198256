package project__i.tuan32;

import java.math.BigInteger;
import java.util.Scanner;

public class Bai_5 {
    /**
     * Bài 05: Cho một xâu ký tự bao gồm toàn các ký tự 0,1. Hãy biến đổi xâu này theo cách 0🡪1, 1🡪0 và in ra kết quả.
     */
    Scanner sc = new Scanner(System.in);

    public void run() {
        bai_5(input());
    }
    public String input(){
        
        System.out.println("nhap xau: ");
        String str = sc.nextLine();
        return str;
    }
     
        
    public String bai_5(String str) {
        
        char[] temp = str.toCharArray();

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == '0') {
                temp[i] = '1';
            } else if (temp[i] == '1') {
                temp[i] = '0';
            }
        }
        str = "";

        for (int i = 0; i < temp.length; i++) {
            str += temp[i];
        }
        System.out.println("anwser: "+str);
        return str;
    }
}
