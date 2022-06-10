package project_i.tuan31;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai_1 {

    /**
     * Bài 01: Cho một dãy số tự nhiên, viết chương trình sắp xếp dãy này theo
     * thứ tự giảm dần.
     */
    Scanner sc = new Scanner(System.in);

    public void bai_1() {

    }

    public void run() {
        print(insertionSort(input()));
    }

    public int[] input() {
        System.out.println("nhập độ dài của mảng: ");
        int n = sc.nextInt();
        int input[] = new int[n];
        System.out.println("nhập giá trị các phần tử: ");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        return input;
    }

    public void print(int[] arr) {
        System.out.println("kết quả: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] insertionSort(int[] arr) {
        int j, last;
        for (int i = 0; i < arr.length; i++) {
            last = arr[i];
            j = i;
            while ((j > 0) && (arr[j - 1] < last)) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = last;
        }
        return arr;
    }

    public int[] selectionSort(int[] arr) {
        int max;
        for (int i = 0; i < arr.length; i++) {
            max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            System.out.println(".." + arr[max]);
            int c = arr[i];
            arr[i] = arr[max];
            arr[max] = c;
        }
        return arr;
    }

    public ArrayList<Integer> bubbleSort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) < arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        return arr;
    }
}
