package project_i.tuan31;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai_6 {

    /**
     * Bài 06: Cho một dãy số tự nhiên, hãy in ra tất cả các số hạng của dãy
     * trên thỏa mãn: số này là ước số thực sự của 1 số hạng khác trong dãy
     * trên.
     */
    Scanner sc = new Scanner(System.in);

    public void run() {
        bai_6(input());
    }

    public ArrayList<Integer> input() {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("nhap do dai mang: ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("phan tu thu " + i + ": ");
            arr.set(i, sc.nextInt());
            System.out.println();
        }
        return arr;
    }

    public ArrayList<ArrayList<Integer>> bai_6(ArrayList<Integer> aa) {
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();

        int n = aa.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = aa.get(i);
        }
        arr = bubbleSort(arr);

        System.out.println();
        int column = n;
        int row = arr[n - 1];
        int[][] a = new int[column][row];
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> t = new ArrayList<>();
            // tim uoc cua arr[i]

            a[i][0] = arr[i];
            t.add(arr[i]);
            for (int j = i+1; j < n; j++) {
                int[] temp = FindU(arr[i]);
                for (int z = 0; z < n; z++) {

                    if (arr[i] == temp[z]) {
                        a[i][index] = arr[j];
                        index++;
                        t.add(arr[j]);
                    }

                }

            }
            l.add(t);
            index = 1;
        }
        for (int i = 0; i < column; i++) {
            System.out.println("uoc thuc su " + a[i][0] + ":");
            int count = -1;
            for (int j = 1; j < row; j++) {
                if (a[i][j] != 0) {

                    System.out.print(a[i][j] + " ");
                } else {
                    count++;
                }
                if (count == (row - 2)) {
                    System.out.println("null");
                }
            }
            count = -1;
            System.out.println();
        }
        return l;
    }

    public int[] FindU(int a) {
        int[] temp = new int[a];
        int z = 0;
        for (int i = 1, j = 0; i < a; i++) {
            if (a % i == 0) {
                temp[j++] = i;
            }
            z = j;
        }
        int[] answer = new int[z];
        for (int i = 0; i < z; i++) {
            answer[i] = temp[i];
        }
        return answer;
    }

    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
