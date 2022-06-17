/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project__i.tuan29;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Bai_1 {
    // in ra tất cả các hợp số nhở hơn 100;
    
    public ArrayList<Integer> bai_1() {
        int index = 1;
        ArrayList<Integer> list = new ArrayList();
        for (int i = 3; i < 100; ++i) {

            for (int j = 2; j <= Math.sqrt(i); j++) {
                
                if (i % j == 0) {  
                //    System.out.println("hợp số thứ " + index + ": " + i);
                    list.add(i);
                    index++;
                    break;
                }
            }
        }
        return list;
    }
}
