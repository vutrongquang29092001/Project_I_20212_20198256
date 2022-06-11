/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_i.tuan29;

/**
 * @author Admin
 */
public class Bai_2 {
    // In ra màn hình 20 số nguyên tố đầu tiên

    public int[] bai_2() {
        int index = 0;
        int count = 0;
        int list[] = new int[20];
        for (int i = 2; i < 100; ++i) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count < 1 & index < 20) {
                //   System.out.println("số nguyên tố thứ " + index + ": " + i);
                list[index] = i;
                index++;
            }
            count = 0;
        }
        return list;
    }

    public void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("số nguyên tố thứ " + i + ": " + a[i]);
        }
    }

    public boolean check(int n) {
        if(n <= 0)return false;
        if(n == 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {

             return false;
            }

        }
        return true;
    }
     public boolean check(double n) {
        if(n <= 0)return false;
        if(n == 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {

             return false;
            }

        }
        return true;
    }
}
