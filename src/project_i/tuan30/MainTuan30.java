/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_i.tuan30;

import project_i.tuan30.*;


import java.util.Scanner;

/**
 * @author Admin
 */
public class MainTuan30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            ViewTuan30.viewTuan30();
            int input = sc.nextInt();
            int n;
            switch (input) {
                case 1:
                    System.out.println("Nhập n: ");
                    n = sc.nextInt();
                    project_i.tuan30.Bai_1 b1 = new Bai_1();
                    System.out.println("Sum = "+b1.bai_1(n));
                    break;
                case 2:
                    System.out.println("Nhập n: ");
                    n = sc.nextInt();
                    project_i.tuan30.Bai_2 b2 = new Bai_2();
                    System.out.println("Sum = " + b2.bai_2(n));
                    break;
                case 3:
                    System.out.println("Nhập n: ");
                    n = sc.nextInt();
                    project_i.tuan30.Bai_3 b3 = new Bai_3();
                    System.out.println("Sum = " + b3.bai_3(n));
                    break;
                case 4:
                    System.out.println("Nhập n: ");
                    n = sc.nextInt();
                    project_i.tuan30.Bai_4 b4 = new Bai_4();
                    System.out.println("số fibonaxi thứ "+n+" = "+b4.fibonaxi(n));

                    break;

            }
        }

    }
}