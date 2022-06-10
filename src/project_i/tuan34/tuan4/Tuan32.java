/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_i.tuan34.tuan4;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.BorderFactory;

import javax.swing.border.Border;

/**
 *
 * @author Admin
 */
public class Tuan32 extends javax.swing.JPanel {

    Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
    Bai1 bai1 = new Bai1();

    Bai2 bai2 = new Bai2();

    Bai3 bai3 = new Bai3();

    Bai4 bai4 = new Bai4();

    Bai5 bai5 = new Bai5();

    Bai6 bai6 = new Bai6();

    Bai7 bai7 = new Bai7();

    Bai8 bai8 = new Bai8();

    Bai9 bai9 = new Bai9();

    public Tuan32() {
        initComponents();
        setUp();
        getEx();
    }

    public void setUp() {
        jBBai1.setText("Bai1");
        jBBai2.setText("Bai2");
        jBBai3.setText("Bai3");
        jBBai4.setText("Bai4");
        jBBai5.setText("Bai5");
        jBBai6.setText("Bai6");
        jBBai7.setText("Bai7");
        jBBai8.setText("Bai8");
        jBBai9.setText("Bai9");
    }

    public void getEx() {
        jPanel3.setLayout(new CardLayout());

        CardLayout cardLayout = (CardLayout) jPanel3.getLayout();
        jPanel3.add(bai1, "bai1");
        jPanel3.add(bai2, "bai2");
        jPanel3.add(bai3, "bai3");
        jPanel3.add(bai4, "bai4");
        jPanel3.add(bai5, "bai5");
        jPanel3.add(bai6, "bai6");
        jPanel3.add(bai7, "bai7");
        jPanel3.add(bai8, "bai8");
        jPanel3.add(bai9, "bai9");

        setDeBai("bai1");
        jBBai1.addActionListener((e) -> {
            bai1.setUp();
            cardLayout.show(jPanel3, "bai1");
            setDeBai("bai1");

        });
        jBBai2.addActionListener((e) -> {
            bai2.setUp();
            cardLayout.show(jPanel3, "bai2");
            setDeBai("bai2");
        });
        jBBai3.addActionListener((e) -> {
            bai3.setUp();
            cardLayout.show(jPanel3, "bai3");
            setDeBai("bai3");
        });
        jBBai4.addActionListener((e) -> {
            bai4.setUp();
            cardLayout.show(jPanel3, "bai4");
            setDeBai("bai4");
        });
        jBBai5.addActionListener((e) -> {
            bai5.setUp();
            cardLayout.show(jPanel3, "bai5");
            setDeBai("bai5");
        });
        jBBai6.addActionListener((e) -> {
            bai6.setUp();
            cardLayout.show(jPanel3, "bai6");
            setDeBai("bai6");
        });
        jBBai7.addActionListener((e) -> {
            bai7.setUp();
            cardLayout.show(jPanel3, "bai7");
            setDeBai("bai7");
        });
        jBBai8.addActionListener((e) -> {
            bai8.setUp();
            cardLayout.show(jPanel3, "bai8");
            setDeBai("bai8");
        });
        jBBai9.addActionListener((e) -> {
            bai9.setUp();
            cardLayout.show(jPanel3, "bai9");
            setDeBai("bai9");
        });

    }

    public void setDeBai(String str) {
        jLDeBai.setBorder(border);
        if (str.equals("bai1")) {
            jLDeBai.setText("");
            String s = "\tBài 1: Cho trước 1 xâu ký tự là họ tên người đầy đủ nhưng khi nhập có thể thừa một số dấu cách. \n"
                    + "\t       Hãy xóa đi các dấu cách thừa và in ra họ tên chính xác";
            jLDeBai.append(s);

            jPanel2.updateUI();
        } else if (str.equals("bai2")) {
            jLDeBai.setText("Bài 2: Cho trước xâu ký tự bất kỳ. Hãy đếm xem trong xâu có bao nhiêu lần xuất hiện xâu con “abc”");

            jPanel2.updateUI();
        } else if (str.equals("bai3")) {
            jLDeBai.setText("Bài 3: Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần tên của người này");
        } else if (str.equals("bai4")) {
            jLDeBai.setText("Bài 4: Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần họ của người này");
        } else if (str.equals("bai5")) {
            jLDeBai.setText("Bài 5: Cho một xâu ký tự bao gồm toàn các ký tự 0,1. Hãy biến đổi xâu này theo cách 0->1, 1->0 và in ra kết quả");
        } else if (str.equals("bai6")) {
            jLDeBai.setText("Bài 6: Cho trước xâu ký tự S, in ra xâu S1 ngược lại xâu S.");

        } else if (str.equals("bai7")) {
            jLDeBai.setText("Bài 7: Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn tên “An”.");

        } else if (str.equals("bai8")) {
            jLDeBai.setText("Bài 8: Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có phần đệm là  “Thị”.");

        } else if (str.equals("bai9")) {
            jLDeBai.setText("Bài 9: Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn  có tên bắt đầu bằng chữ “H”.");

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBBai1 = new javax.swing.JButton();
        jBBai2 = new javax.swing.JButton();
        jBBai3 = new javax.swing.JButton();
        jBBai4 = new javax.swing.JButton();
        jBBai5 = new javax.swing.JButton();
        jBBai6 = new javax.swing.JButton();
        jBBai7 = new javax.swing.JButton();
        jBBai8 = new javax.swing.JButton();
        jBBai9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLDeBai = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBBai1.setText("jButton1");
        jPanel1.add(jBBai1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 43));

        jBBai2.setText("jButton2");
        jPanel1.add(jBBai2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 44, 100, 43));

        jBBai3.setText("jButton3");
        jPanel1.add(jBBai3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, 100, 43));

        jBBai4.setText("jButton4");
        jPanel1.add(jBBai4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 132, 100, 43));

        jBBai5.setText("jButton5");
        jPanel1.add(jBBai5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 176, 100, 43));

        jBBai6.setText("jButton6");
        jPanel1.add(jBBai6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 100, 43));

        jBBai7.setText("jButton1");
        jPanel1.add(jBBai7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 264, 100, 43));

        jBBai8.setText("jButton2");
        jPanel1.add(jBBai8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 308, 100, 43));

        jBBai9.setText("jButton3");
        jPanel1.add(jBBai9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 352, 100, 44));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 400));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 750, 350));

        jLDeBai.setColumns(20);
        jLDeBai.setRows(5);
        jPanel2.add(jLDeBai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 750, 400));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBai1;
    private javax.swing.JButton jBBai2;
    private javax.swing.JButton jBBai3;
    private javax.swing.JButton jBBai4;
    private javax.swing.JButton jBBai5;
    private javax.swing.JButton jBBai6;
    private javax.swing.JButton jBBai7;
    private javax.swing.JButton jBBai8;
    private javax.swing.JButton jBBai9;
    private javax.swing.JTextArea jLDeBai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
