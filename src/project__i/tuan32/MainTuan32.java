package project__i.tuan32;

import java.util.Scanner;

public class MainTuan32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println();
            ViewTuan32.viewTuan32();
            System.out.print("Nhập bài muốn chọn: ");
            String input = sc.nextLine();
            switch (input){
                case "1":
                    Bai_1 b1 = new Bai_1();
                    b1.run();
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "2":
                    Bai_2 b2 = new Bai_2();
                    b2.run();
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "3":
                    Bai_3 b3 = new Bai_3();
                    b3.run();
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "4":
                    Bai_4 b4 = new Bai_4();
                    b4.run();
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "5":
                    Bai_5 b5 = new Bai_5();
                    b5.run();
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "6":
                    Bai_6 b6 = new Bai_6();
                    b6.run();
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "7":
                    Bai_7 b7 = new Bai_7();
                    b7.run();
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "8":
                    Bai_8 b8 = new Bai_8();
                    b8.run();
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case "9":
                    Bai_9 b9 = new Bai_9();
                    b9.run();
                    sc.nextLine();
                    sc.nextLine();
                    break;
                default:
                    System.out.println("Ban có chắc muốn thoát (Y/N)");
                    String output = sc.nextLine();
                    if(output.equals("y")||output.equals("Y")){
                        return;
                    }

            }
        }
    }
}
