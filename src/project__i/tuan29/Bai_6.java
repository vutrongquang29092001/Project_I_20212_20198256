/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project__i.tuan29;

import java.math.BigInteger;

/**
 *
 * @author Admin
 */
public class Bai_6 {

    public long[] bai_6() {
        //In ra màn hình 5 số hoàn hảo đầu tiên (Số hoàn hảo là số có tổng bằng các ước số của mình kể cả 1
        long[] arr = new long[5];
        Bai_2 b2 = new Bai_2();
        int index = 1;
        for (int i = 0; i < 6; i++) {
           int b[] = b2.bai_2();
            if (b2.check(Math.pow(2, b2.bai_2()[i]) - 1)) {
                long a = (long) (Math.pow(2, b[i] - 1) * (Math.pow(2, b[i]) - 1));
                arr[index-1] = a;
                System.out.println("số hoàn hảo thứ " + index + ": " + a);
                index ++;
                System.out.println("test :" + check(a));
            }

        }
        return arr;
    }

    public boolean check(long n) {
        long s = 0;
        for (long i = 1; i < n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        if (s == n) {
            return true;
        } else {
            return false;
        }
    }

}
