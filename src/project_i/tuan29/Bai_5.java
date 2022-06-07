/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_i.tuan29;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class Bai_5 {
    // In ra màn hình các số nằm giữa 1000 và 2000 đồng thời chia hết cho 3,5,7
public Map bai_5(){
      int listNumber[] = new int[2000];
     Map<Integer,Integer> map = new HashMap<Integer,Integer>();
       
        for (int i = (1000/(3*5*7)), j = 1; i < (2000/(3*5*7)); i++) {
           
            if (3 * 7 * 5*i < 2000 & 3 * 7 * 5*i > 1000) {
                map.put(j,3 * 7 * 5*i);
                j++;
            }

        }
        System.out.println(map);
        return map;
}
}
