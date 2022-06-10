/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_i.tuan34.tuan1;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import project_i.tuan29.Bai_1;

/**
 *
 * @author Admin
 */
public class Bai1 extends javax.swing.JPanel {

    /**
     * Creates new form Bai1
     */
    Bai_1 bai_1 = new Bai_1();

    public Bai1() {
        initComponents();
        setUp();
        jButton1.addActionListener((e) -> {
            jPanel3.removeAll();
            handle();
            jPanel3.updateUI();

        });

    }

    public void setUp() {
        jLabel1.setText("N: ");
        jTextField1.setText("");
        jLabel3.setText("Các hợp số: ");
        jButton1.setText("OK");
        jLabel2.setText("Vũ Trọng Quảng - MSSV: 20198256");
        jLabel2.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        jLabel2.setBorder(new LineBorder(Color.BLACK));
        jTextField1.setText("20");
        jTextField1.setEditable(false);
        jPanel3.removeAll();
        jPanel3.updateUI();
    }

    public void handle() {

        ArrayList<Integer> list = bai_1.bai_1();
        int size = list.size();
        System.out.println("size:" + size);
        int row = 8;
        int colum = 10;
        int X = 0, Y = 0;
        int WIDTH = 60, HEIGHT = 25;
        JLabel jL[][] = new JLabel[row][colum];
        int count = 0;
        jPanel3.setLayout(new AbsoluteLayout());
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < colum; j++) {
                jL[i][j] = new JLabel();

                jL[i][j].setText(list.get(count) + "");
                count++;
                jL[i][j].setHorizontalAlignment((int) CENTER_ALIGNMENT);
                jL[i][j].setBorder(new LineBorder(Color.BLACK));
                jPanel3.add(jL[i][j], new AbsoluteConstraints(X, Y, WIDTH, HEIGHT));

                X = 3 * (j + 1) + (j + 1) * WIDTH;
                if (count == size) {
                    break;
                }
            }

            Y = (12 * (i + 1) + (i + 1) * HEIGHT);
            X = 0;
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 50));

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 70, 50));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 312, 100, 40));

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 100, 25));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 350));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 153, 153));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 50));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 650, 300));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 650, 350));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
