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
public class Bai_4 {
    /**
     * Bài 04: Dãy Fibonaxi 1, 2, 3, … F(k) = F(k-1) + F(k-2). Tính số Fibonaxi thứ N.
     */
    public double fibonaxi (int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        return fibonaxi(n-1)+fibonaxi(n-2);
    }
}
