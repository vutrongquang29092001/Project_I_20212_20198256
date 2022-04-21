/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_i.tuan30;

/**
 *
 * @author Admin
 */
public class Bai_1 {

    /**
     * Bài 01: Cho số tự nhiên N bất kỳ Tính tổng S=1+1/(1+2) + 1/(1+2+3) +…+
     * 1/(1+2+3+..+N)
     *
     */
    public double bai_1(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double) 2/(i*(i+1));
        }
        return sum;
    }

}
