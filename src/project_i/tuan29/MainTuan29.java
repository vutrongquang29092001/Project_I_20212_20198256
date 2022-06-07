/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_i.tuan29;

import java.util.Scanner;

/**
 * @author Admin
 */
public class MainTuan29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            ViewTuan29.viewTuan29();
            int input = sc.nextInt();
            switch (input){
                case 1:
                    Bai_1 b1 = new Bai_1();
                    b1.bai_1();
                    break;
                case 2:
                    Bai_2 b2 = new Bai_2();
                   b2.print(b2.bai_2());
                    break;
                case 3:
                    Bai_3 b3 = new Bai_3();
                    b3.bai_3();
                    break;
                case 4:
                    Bai_4 b4 = new Bai_4();
                    b4.bai_4();
                    break;
                case 5:
                    Bai_5 b5 = new Bai_5();
                    b5.bai_5();
                    break;
                case 6:
                    Bai_6 b6 = new Bai_6();
                    b6.bai_6();
                    break;
                case 7:
                    Bai_7 b7 = new Bai_7();
                    b7.bai_7();
                    break;
            }

        }


    }

}
