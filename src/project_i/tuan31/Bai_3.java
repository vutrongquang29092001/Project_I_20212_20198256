package project_i.tuan31;

import java.util.Scanner;

public class Bai_3 {
    /**
     * Bài 03: Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị min của dãy này và tất cả các chỉ số ứng với giá trị min này.
     */
    Scanner sc = new Scanner(System.in);

    Bai_1 b1 = new Bai_1();

    public void run() {
        bai_3();
    }

    public int[] bai_3() {

        System.out.println("nhap do dai n:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int[] answer = new int[n];
        System.out.println("nhap phan tu mang");
        for (int i = 0; i < n; i++) {
            System.out.print("phan tu " + i + ": ");
            arr[i] = sc.nextInt();
            System.out.println();
        }
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        temp = b1.bubbleSort(temp);
        int min = temp[n - 1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                answer[i] = min;
            }
        }
        System.out.println("Value Min: " + min);
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == min) {
                System.out.println("index: " + i);
            }
        }

        return answer;
    }


}
