package project_i.tuan31;

import java.util.Scanner;

public class Bai_4 {
    /**
     *Bài 04: Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị max của dãy này và tất cả các chỉ số ứng với giá trị max này.
     */
    //Bài 04: Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị max của dãy này và tất cả các chỉ số ứng với giá trị max này.
    Scanner sc = new Scanner(System.in);
    Bai_1 b1 = new Bai_1();
    public void run(){
        bai_4();
    }
    public int[] bai_4() {

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
        int max = temp[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                answer[i] = max;
            }
        }
        System.out.println("Value Max: " + max);
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == max) {
                System.out.println("index: " + i);
            }
        }

        return answer;
    }
}
