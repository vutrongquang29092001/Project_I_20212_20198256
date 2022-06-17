/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project__i.tuan29;

/**
 *
 * @author Admin
 */
public class Bai_3 {
    //In ra màn hình tất cả các số nguyên tố từ 1000 đến 2000
    Bai_2  bai_2 = new Bai_2();
     public int[] bai_3() {
        int count = 0;
        int listNumber[] = new int[2000];
        for (int i = 0; i < 100; i++) {
            listNumber[i] = 0;

        }
        for (int i = 2; i < 2000; i++) {
          //  System.out.println("i : " + i);
            for (int j = 2; j < 2000; j++) {
                int x = i* j;
            //
                if (x >= 2000) {
                    break;

                }
                else{
                    listNumber[x] = 1;
                    count++;
                  // System.out.println("listNumber[" + x + "]" + listNumber[x]);
                }


            }
        }
        int temp[] = new int[135];
         System.out.println("Danh sách số nguyên tố từ 1000 đến 2000");
         System.out.println("[STT]" );
        int index = 1;
        for (int i = 1000; i < 2000; i++) {
            if(listNumber[i] == 1){
                continue;
            }else{
                
               System.out.println("[" + index + "]:\t" + i + bai_2.check(i) );
               
               temp[index-1] = i;
               index++;
            }
        }
         System.out.println("lengh: "+ temp.length);
        return temp;
    }

}
