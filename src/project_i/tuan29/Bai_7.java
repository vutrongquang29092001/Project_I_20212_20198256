/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_i.tuan29;

/**
 *
 * @author Admin
 */
public class Bai_7 {

    /*
    : Trong các số tự nhiên <=100 hãy đếm xem có bao nhiêu số
a.	Chia hết cho 5
b.	Chia 5 dư 1
c.	Chia 5 dư 2
d.	Chia 5 dư 3

     */

    public void bai_7() {
        int answer[] = new int[101];
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                answer[i] = 0;
            } else if (i % 5 == 1) {
                answer[i] = 1;
            } else if (i % 5 == 2) {
                answer[i] = 2;
            } else if (i % 5 == 3) {
                answer[i] = 3;
            }
        }
        print(answer);
    }

    private void print(int[] arr) {
        for (int i = 0; i <= 100; i += 5) {
            if (arr[i] == 0) {
                System.out.println("chia hết cho 5: " + i);
            }
        }
        System.out.println("----------------------");
        for (int i = 1; i <= 100; i += 5) {
            if (arr[i] == 1) {
                System.out.println("chia cho 5 dư 1: " + i);
            }
        }
        System.out.println("----------------------");

        for (int i = 2; i <= 100; i += 5) {
            if (i % 5 == 2) {
                System.out.println("chia cho 5 dư 2: " + i);
            }
        }
        System.out.println("----------------------");

        for (int i = 3; i <= 100; i += 5) {
            if (i % 5 == 3) {
                System.out.println("chia cho 5 dư 3: " + i);
            }
        }

    }
}
