/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_i.tuan34.tuan1;

import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import project_i.tuan29.Bai_2;

/**
 *
 * @author Admin
 */
public class Bai2 extends javax.swing.JPanel {

    /**
     * Creates new form Bai1
     */
    Bai_2 bai_2 = new Bai_2();

    public Bai2() {
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
        jTextField1.setText("20");
        jTextField1.setEditable(false);
        jButton1.setText("OK");
    }

    public void handle() {
        int[] list = bai_2.bai_2();
        int size = list.length;
        System.out.println("size:" + size);
        int row = 5;
        int colum = 4;
        int X = 20, Y = 40;
        int WIDTH = 100, HEIGHT = 50;
        JLabel jL[][] = new JLabel[row][colum];
        int count = 0;
        jPanel2.setLayout(new AbsoluteLayout());
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < colum; j++) {
                jL[i][j] = new JLabel();

                jL[i][j].setText("" + list[count]);
                count++;
                jL[i][j].setHorizontalAlignment((int) CENTER_ALIGNMENT);
                jL[i][j].setBorder(new LineBorder(Color.yellow));
                jPanel2.add(jL[i][j], new AbsoluteConstraints(X, Y, WIDTH, HEIGHT));
              
                  X = 20 + 20 * (j + 1) + (j + 1) * WIDTH;
                if (count == size) {
                    break;
                }
            }
           
               Y = 40 + (10 * (i + 1) + (i + 1) * HEIGHT);
            X = 20;
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
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 204));
        setMinimumSize(new java.awt.Dimension(750, 350));
        setPreferredSize(new java.awt.Dimension(750, 350));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

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

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 0, 650, 350));

        jButton1.setText("jButton1");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 100, 30));

        jTextField1.setText("jTextField1");
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 60, 50));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
