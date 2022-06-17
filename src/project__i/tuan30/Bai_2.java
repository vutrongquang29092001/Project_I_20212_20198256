/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project__i.tuan30;

/**
 *
 * @author Admin
 */
public class Bai_2 {

    /**
     * Bài 02: Cho số tự nhiên N bất kỳ, tính tổng S= 1+ 1/2! + 1/3! + … + 1/N!
     *
     */
    public double bai_2(int n) {
        double sum = 0;
            for(int i = 1 ; i <= n ; i++){
                sum += 1/factorial(i);
            }
            return sum;
    }

    private double factorial(int n) {
        double factorial = 1;
        if (n == 0 || n == 1) {
            return factorial;
        } else {
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }

    }
}
