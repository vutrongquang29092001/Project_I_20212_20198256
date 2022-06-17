package project__i.tuan31;

import java.util.ArrayList;
import project__i.tuan29.Bai_2;

import java.util.Scanner;

public class Bai_5 {

    /**
     * Bài 05: Cho một dãy số tự nhiên, hãy đếm xem trong dãy số trên có bao
     * nhiêu số nguyên tố, có bao nhiêu hợp số.
     */
    Scanner sc = new Scanner(System.in);
    Bai_2 b2 = new Bai_2();

    public void run() {
        bai_5();
    }

    public void bai_5() {
        System.out.print("Nhap do dai mang: ");
        int n = sc.nextInt();
        System.out.println();
        int[][] answer = new int[n][2];
        int snt = 0;
        int shs = 0;
        for (int i = 0; i < answer.length; i++) {
            System.out.print("phan tu thu " + i + ": ");
            answer[i][0] = sc.nextInt();
            if (answer[i][0] == 1) {
                answer[i][1] = -1;

            } else if (b2.check(answer[i][0])) {
                answer[i][1] = 1;
                snt++;
            } else {
                answer[i][1] = 0;
                shs++;
            }
        }
        System.out.println("so nguyen to: " + snt);
        for (int i = 0; i < answer.length; i++) {
            if (answer[i][1] == 1) {
                System.out.println("index: " + i + "\t value: " + answer[i][0]);
            }
        }
        System.out.println("so hop so " + shs);
        for (int i = 0; i < answer.length; i++) {
            if (answer[i][1] == 0) {
                System.out.println("index: " + i + "\t value: " + answer[i][0]);
            }
        }
    }

    public ArrayList<ArrayList<Integer>> bai_5(ArrayList<Integer> list) {
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        ArrayList<Integer> snt = new ArrayList<>();
        ArrayList<Integer> shs = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) == 1) {
                continue;

            } else if (b2.check(list.get(i))) {
                snt.add(list.get(i));
            } else {
                shs.add(list.get(i));
            }
        }
        l.add(snt);
        l.add(shs);
        return l;
    }

}
