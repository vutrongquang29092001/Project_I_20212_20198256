/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_i.tuan34.tuan1;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import project_i.tuan29.Bai_6;

/**
 *
 * @author Admin
 */
public class Bai6 extends javax.swing.JPanel {

    /**
     * Creates new form
     */
    public Bai6() {
        initComponents();
        setUp();
        jButton1.addActionListener((e) -> {
        jPanel2.removeAll();
        handle();
        jPanel2.updateUI();
        });
    }

    public void setUp() {
        jLabel1.setText("N: ");
        jTextField1.setText("5");
        jButton1.setText("OK");
        jPanel2.removeAll();
        jPanel2.updateUI();
    }

    public void handle() {
        long arr[] = new Bai_6().bai_6();
        int size = arr.length;
        System.out.println("size:" + size);
        int row = 5;
        int colum = 1;
        int X = 50, Y = 50;
        int WIDTH = 200, HEIGHT = 50;
        JLabel jL3[][] = new JLabel[row][colum];
        int count = 0;
        jPanel2.setLayout(new AbsoluteLayout());

        for (int i = 0; i < colum; i++) {

            for (int j = 0; j < row; j++) {
                jL3[j][i] = new JLabel();
                jL3[j][i].setText("" + arr[count]);
                count++;
                jL3[j][i].setHorizontalAlignment((int) LEFT_ALIGNMENT);
                jL3[j][i].setBorder(new LineBorder(Color.black));
                jPanel2.add(jL3[j][i], new AbsoluteConstraints(X, Y, WIDTH, HEIGHT));
                Y = 50 + (5 * (j + 1) + (j + 1) * HEIGHT);
                if (count == size) {
                    break;
                }
            }
            X = 50 + 10 * (i + 1) + (i + 1) * WIDTH;
            Y = 0;
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 102, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 325, 100, 25));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 25));

        jTextField1.setText("jTextField1");
        jTextField1.setActionCommand("<Not Set>");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 60, 25));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 350));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 650, 350));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
