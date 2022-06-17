/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project__i.tuan34.tuan1;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author Admin
 */
public class Tuan29 extends javax.swing.JPanel {

    /**
     * Creates new form Tuan29
     */
    Bai1 bai1 = new Bai1();

    Bai2 bai2 = new Bai2();

    Bai3 bai3 = new Bai3();

    Bai4 bai4 = new Bai4();

    Bai5 bai5 = new Bai5();

    Bai6 bai6 = new Bai6();

    Bai7 bai7 = new Bai7();
    Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

    public Tuan29() {
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

    }

    public void setDeBai(String str) {
          jLDeBai.setBorder(border);
        if (str.equals("bai1")) {
            jLDeBai.setText("Bài 01: In ra màn hình tất cả các hợp số <100\n"
                    + "MSSV Họ ten-lop");
        } else if (str.equals("bai2")) {
            jLDeBai.setText("Bài 02: In ra màn hình 20 số nguyên tố đầu tiên");
        } else if (str.equals("bai3")) {
            jLDeBai.setText("Bài 03: In ra màn hình tất cả các số nguyên tố từ 1000 đến 2000");
        } else if (str.equals("bai4")) {
            jLDeBai.setText("Bài 04: In ra màn hình các số <100 và chia hết cho 3,7");
        } else if (str.equals("bai5")) {
            jLDeBai.setText("Bài 05: In ra màn hình các số nằm giữa 1000 và 2000 đồng thời chia hết cho 3,5,7");
        } else if (str.equals("bai6")) {
            jLDeBai.setText("Bài 06: In ra màn hình 5 số hoàn hảo đầu tiên \n"
                    + "(Số hoàn hảo là số có tổng bằng các ước số của mình kể cả 1");
        } else if (str.equals("bai7")) {
            jLDeBai.setText("Bài 07: Trong các số tự nhiên <=100 hãy đếm xem có bao nhiêu số. \n"
                    + "a,	Chia hết cho. 5 \n"
                    + "b,	Chia 5 dư 1. \n"
                    + "c,	Chia 5 dư 2. \n"
                    + "d,	Chia 5 dư 3.");
        }
              jLDeBai.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    }

    public JButton getjButton1() {
        return jBBai1;
    }

    public void setjButton1(JButton jButton1) {
        this.jBBai1 = jButton1;
    }

    public JLabel getjLDeBai() {
        return jLDeBai;
    }

    public void setjLDeBai(JLabel jLDeBai) {
        this.jLDeBai = jLDeBai;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
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
        jPanel2 = new javax.swing.JPanel();
        jLDeBai = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(null);

        jBBai1.setText("jButton1");
        jPanel1.add(jBBai1);
        jBBai1.setBounds(0, 0, 100, 57);

        jBBai2.setText("jButton2");
        jPanel1.add(jBBai2);
        jBBai2.setBounds(0, 57, 100, 57);

        jBBai3.setText("jButton3");
        jPanel1.add(jBBai3);
        jBBai3.setBounds(0, 114, 100, 57);

        jBBai4.setText("jButton4");
        jPanel1.add(jBBai4);
        jBBai4.setBounds(0, 171, 100, 57);

        jBBai5.setText("jButton5");
        jPanel1.add(jBBai5);
        jBBai5.setBounds(0, 228, 100, 57);

        jBBai6.setText("jButton6");
        jPanel1.add(jBBai6);
        jBBai6.setBounds(0, 285, 100, 57);

        jBBai7.setText("jButton7");
        jPanel1.add(jBBai7);
        jBBai7.setBounds(0, 342, 100, 57);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 100, 400);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(null);

        jLDeBai.setText("jLabel1");
        jPanel2.add(jLDeBai);
        jLDeBai.setBounds(0, 0, 750, 50);

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

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 50, 750, 350);

        add(jPanel2);
        jPanel2.setBounds(100, 0, 750, 400);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBai1;
    private javax.swing.JButton jBBai2;
    private javax.swing.JButton jBBai3;
    private javax.swing.JButton jBBai4;
    private javax.swing.JButton jBBai5;
    private javax.swing.JButton jBBai6;
    private javax.swing.JButton jBBai7;
    private javax.swing.JLabel jLDeBai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
