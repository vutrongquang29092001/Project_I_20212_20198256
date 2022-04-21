package project_i.tuan31;

import java.util.Scanner;

public class Bai_1 {
    /**
     * Bài  01: Cho một dãy số tự nhiên, viết chương trình sắp xếp dãy này theo thứ tự giảm dần.
     */
    Scanner sc = new Scanner(System.in);

    public void bai_1() {

    }

    public int[] input() {
        System.out.println("nhập độ dài của mảng: ");
        int n = sc.nextInt();
        int input[] = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        return input;
    }

    public int[] insertionSort(int[] arr) {
        int j, last;
        for (int i = 0; i < arr.length; i++) {
            last = arr[i];
            j = i;
            while ((j > 0) && (arr[j - 1] > last)) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = last;

        }
        return arr;
    }
    public int[] selectionSort(int[] arr){
        return arr;
    }
}
