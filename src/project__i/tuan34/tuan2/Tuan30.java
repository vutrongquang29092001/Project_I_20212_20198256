/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project__i.tuan34.tuan2;

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
public class Tuan30 extends javax.swing.JPanel {

    
    Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
    Bai1 bai1 = new Bai1();

    Bai2 bai2 = new Bai2();

    Bai3 bai3 = new Bai3();

    Bai4 bai4 = new Bai4();

    public Tuan30() {
        initComponents();
        getEx();
    }

    public void getEx() {
        jBBai1.setText("Bai1");
        jBBai2.setText("Bai2");
        jBBai3.setText("Bai3");
        jBBai4.setText("Bai4");
      
        jPanel3.setLayout(new CardLayout());
        CardLayout cardLayout = (CardLayout) jPanel3.getLayout();
        jPanel3.add(bai1, "bai1");
        jPanel3.add(bai2, "bai2");
        jPanel3.add(bai3, "bai3");
        jPanel3.add(bai4, "bai4");

        setDeBai("bai1");
        jBBai1.addActionListener((e) -> {
            bai1.setUp();
            cardLayout.show(jPanel3, "bai1");
            setDeBai("bai1");

        });
        jBBai2.addActionListener((e) -> {
            System.out.println("tuan 30");
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

    }

    public void setDeBai(String str) {
        jLDeBai.setBorder(border);
        if (str.equals("bai1")) {
            jLDeBai.setText("Bài 1: Cho số tự nhiên N bất kỳ Tính tổng S=1+1/(1+2) + 1/(1+2+3) +…+\n"
                    + "      1/(1+2+3+..+N)");
        } else if (str.equals("bai2")) {
            jLDeBai.setText("Bài 2: Cho số tự nhiên N bất kỳ, tính tổng S= 1+ 1/2! + 1/3! + … + 1/N!");
        } else if (str.equals("bai3")) {
            jLDeBai.setText("Bài 3: Cho số tự nhiên N bất kỳ, tính tổng S=1+1/(1+2!) + 1/(1+2!+3!)+..+ 1/(1+2!+3!+..+N!)");
        } else if (str.equals("bai4")) {
            jLDeBai.setText("Bài 4: Dãy Fibonaxi 1, 2, 3, … F(k) = F(k-1) + F(k-2). Tính số Fibonaxi thứ N.");
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
        jPanel2 = new javax.swing.JPanel();
        jLDeBai = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(null);

        jBBai1.setText("jButton1");
        jPanel1.add(jBBai1);
        jBBai1.setBounds(0, 0, 100, 100);

        jBBai2.setText("jButton2");
        jPanel1.add(jBBai2);
        jBBai2.setBounds(0, 100, 100, 100);

        jBBai3.setText("jButton3");
        jPanel1.add(jBBai3);
        jBBai3.setBounds(0, 200, 100, 100);

        jBBai4.setText("jButton4");
        jPanel1.add(jBBai4);
        jBBai4.setBounds(0, 300, 100, 100);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 100, 400);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setLayout(null);

        jLDeBai.setText("jLabel1");
        jPanel2.add(jLDeBai);
        jLDeBai.setBounds(0, 0, 750, 50);

        jPanel3.setLayout(null);
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
    private javax.swing.JLabel jLDeBai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
