package project_i.tuan31;

import java.util.Scanner;

public class Bai_2 {

    //Bài 02: Cho dãy số tự nhiên, in ra màn hình tất cả các số nguyên tố của dãy này.
    Scanner sc = new Scanner(System.in);
    project_i.tuan29.Bai_2 method = new project_i.tuan29.Bai_2();

    public void run() {
        print(bai_2(input()));
    }

    public int[] input() {
        System.out.println("nhap do dai n:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("nhap phan tu mang");
        for (int i = 0; i < n; i++) {
            System.out.print("phan tu " + i + ": ");
            arr[i] = sc.nextInt();
            System.out.println();
        }
        return arr;
    }

    public int[] bai_2(int[] arr) {
        
        int[] temp = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (method.check(arr[i])) {
                temp[index++] = arr[i];
            }
        }
        int[] answer = new int[index];
        for (int i = 0; i < index; i++) {
            answer[i] = temp[i];
        }
        return answer;
    }

    public void print(int[] arr) {
        System.out.print("answer: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
