/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_i.tuan34.tuan3;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JLabel;

import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import project_i.tuan31.Bai_1;

/**
 *
 * @author Admin
 */
public class Bai1 extends javax.swing.JPanel {

    ArrayList<Integer> list = new ArrayList<>();
    boolean check = false;

    public Bai1() {
        initComponents();
        setUp();

        jTextField1.addKeyListener(listener());

        jButton1.addActionListener((e) -> {
            jPanel6.removeAll();
            jPanel5.removeAll();
            handle(list);
            check = true;
        });
    }

    public KeyListener listener() {

        KeyListener listener = new KeyListener() {

            String s = "";
            int i = 0;

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (check) {
                    i = 0;
                }
                try {
                      handle(e);
                } catch (Exception e) {
                    System.out.println("co loi");
                }
              
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }

            public void handle(KeyEvent e) {
                if (e.getKeyChar() != ' ') {
                    s += String.valueOf(e.getKeyChar());
                }
                if (e.getKeyChar() == ' ') {
                    int a = Integer.parseInt(s);
                    list.add(a);
                    System.out.println(a);

                    JLabel temp = new JLabel();

                    int Hight = (int) (a * 20);
                    System.out.println(Hight);
                    int X = 5 * i + 25 * i;
                    if (a == 0) {
                        Hight = (int) ((a + 0.5) * 20);
                        X = 5 * i + 25 * i;
                    }
                    temp.setText(s);
                    temp.setBorder(new LineBorder(Color.BLACK));
                    jPanel5.add(temp, new AbsoluteConstraints(X, 275 - Hight, 25, Hight));
                    i++;
                    jPanel5.updateUI();
                    s = "";
                    check = false;
                }

            }
        };
        return listener;
    }

    public void setUp() {
        jLabel2.setText("Nhập dãy N: ");
        jLabel5.setText("Dãy đã sắp xếp: ");
        jLabel2.setBorder(new LineBorder(Color.BLACK));
        jLabel5.setBorder(new LineBorder(Color.BLACK));
        jButton1.setText("OK");
        jTextField1.setText("");
        jTextField2.setText("");
        jPanel3.setLayout(new AbsoluteLayout());
        jPanel4.setLayout(new AbsoluteLayout());
        jPanel2.setLayout(new AbsoluteLayout());
        jPanel3.setLayout(new AbsoluteLayout());

        jPanel3.add(jLabel2, new AbsoluteConstraints(0, 0, 325, 50));
        jPanel3.add(jTextField1, new AbsoluteConstraints(0, 50, 325, 25));
        jPanel2.add(jPanel3, new AbsoluteConstraints(0, 0, 325, 350));

        jPanel4.setLayout(new AbsoluteLayout());
        jPanel4.add(jLabel5, new AbsoluteConstraints(0, 0, 325, 50));
        jPanel4.add(jTextField2, new AbsoluteConstraints(0, 50, 325, 25));

        jPanel5.setLayout(new AbsoluteLayout());
        jPanel6.setLayout(new AbsoluteLayout());
        jPanel3.add(jPanel5, new AbsoluteConstraints(0, 75, 325, 275));
        jPanel4.add(jPanel6, new AbsoluteConstraints(0, 75, 325, 275));
        jPanel2.add(jPanel4, new AbsoluteConstraints(325, 0, 325, 350));

        jPanel6.removeAll();
        jPanel5.removeAll();

        jPanel6.updateUI();
        jPanel5.updateUI();

    }

    public void handle(ArrayList<Integer> arr) {
        String str = "";
        for (Integer a : arr) {
            str += String.valueOf(a) + " ";
        }
        jTextField2.setText(str);
        arr = new Bai_1().bubbleSort(arr);
        int size = arr.size();
        for (int i = 0; i < size; i++) {
            JLabel temp = new JLabel();
            int Hight = (int) (arr.get(i) * 20);

            System.out.println(Hight);
            int X = 5 * i + 25 * i;
            if (arr.get(i) == 0) {
                Hight = (int) ((arr.get(i) + 0.5) * 20);
                X = 5 * i + 25 * i;
            }
            temp.setText(arr.get(i) + "");
            temp.setBorder(new LineBorder(Color.BLACK));
            jPanel6.add(temp, new AbsoluteConstraints(X, 275 - Hight, 25, Hight));
            jPanel6.updateUI();
        }
        list.clear();
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 312, 100, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 350));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 325, 50));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 325, 25));
        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, 325, 275));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 325, 350));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("jLabel5");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 325, 50));
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 325, 25));
        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, 325, 275));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 0, 325, 350));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 650, 350));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
