package project__i.tuan31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai_4 {

    /**
     * Bài 04: Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị max của dãy
     * này và tất cả các chỉ số ứng với giá trị max này.
     */
    //Bài 04: Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị max của dãy này và tất cả các chỉ số ứng với giá trị max này.
    Scanner sc = new Scanner(System.in);
    Bai_1 b1 = new Bai_1();

    public void run() {
        bai_4(input());
    }

    public ArrayList<Integer> input() {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("nhap do dai n:");
        int n = sc.nextInt();

        int[] answer = new int[n];
        System.out.println("nhap phan tu mang");
        for (int i = 0; i < n; i++) {
            System.out.print("phan tu " + i + ": ");
            arr.set(i, sc.nextInt());
            System.out.println();
        }
        return arr;
    }

    public Map<Integer, Integer> bai_4(ArrayList<Integer> arr) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = arr.size();
        int[] temp = new int[n];
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr.get(i);
        }
        temp = b1.insertionSort(temp);
        int max = temp[0];

        for (int i = 0; i < n; i++) {
            if (arr.get(i) == max) {
                answer[i] = max;
                map.put(i, max);
            }
        }
        System.out.println("Value Max: " + max);
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == max) {
                System.out.println("index: " + i);
            }
        }

        return map;
    }
}
