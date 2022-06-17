package project__i.tuan31;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai_3 {

    /**
     * Bài 03: Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị min của dãy
     * này và tất cả các chỉ số ứng với giá trị min này.
     */
    Scanner sc = new Scanner(System.in);

    Bai_1 b1 = new Bai_1();

    public void run() {
        bai_3(input());
    }

    public ArrayList<Integer> input() {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("nhap do dai n:");
        int n = sc.nextInt();
        System.out.println("nhap phan tu mang");
        for (int i = 0; i < n; i++) {
            System.out.print("phan tu " + i + ": ");
            arr.set(i, sc.nextInt());
            System.out.println();
        }
        return arr;
    }

    public Map<Integer, Integer> bai_3(ArrayList<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = arr.size();
        int[] temp = new int[n];
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr.get(i);
        }
        temp = b1.insertionSort(temp);
        int min = temp[n - 1];

        for (int i = 0; i < n; i++) {
            if (arr.get(i) == min) {
                answer[i] = min;
                map.put(i,min);
            }
        }
        System.out.println("Value Min: " + min);
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == min) 
            {
                System.out.println("index: " + i);
            }
        }

        return map;
    }

}
