/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_i.tuan29;

/**
 *
 * @author Admin
 */
public class Bai_4 {
    //In ra màn hình các số <100 và chia hết cho 3,7

    public  void bai_4() {
        int listNumber[] = new int[100];
        for (int i = 0; i < listNumber.length; i++) {
            listNumber[i] = 0;

        }
        for (int i = 1; i < listNumber.length; i++) {
            if (3 * i < 100) {
                listNumber[3 * i] = 3;
            } 
            if (7 * i < 100) {
               
                listNumber[7 * i] = 7;
            }
            if (3 * 7 * i < 100) {
                listNumber[3 * 7 * i] = 37;
            }

        }
        System.out.println("những số chia hết cho 3");
        System.out.println("[STT]");
        int index = 1;
        for (int i = 0; i < 100; i++) {

            if (listNumber[i] == 3 || listNumber[i] == 37) {

                System.out.println("["+index+"]:\t" + i);
                index++;
            }
        }
        
        System.out.println("những số chia hết cho 7");
        System.out.println("[STT]");
        int indexs = 1;
        for (int i = 0; i < 100; i++) {

            if (listNumber[i] == 7 || listNumber[i] == 37) {

                System.out.println("["+indexs+"]:\t" + i);
                indexs++;
            }
        }
    }
}
