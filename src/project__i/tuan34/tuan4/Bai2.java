/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project__i.tuan34.tuan4;


import java.awt.Color;
import javax.swing.border.LineBorder;
import project__i.tuan32.Bai_2;

/**
 *
 * @author Admin
 */
public class Bai2 extends javax.swing.JPanel {

    public Bai2() {
        initComponents();
        setUp();

        jButton1.addActionListener((e) -> {
            handle();

        });
    }

    public void setUp() {
        jLabel2.setText("Nhập xâu kí tự: ");
        jLabel5.setText("Số lần xuất hiện: ");
        jLabel1.setText("Nhập xâu con: ");
        jLabel2.setBorder(new LineBorder(Color.BLACK));
        jLabel5.setBorder(new LineBorder(Color.BLACK));
        jButton1.setText("OK");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");

    }

    public void handle() {
        String[] string = {jTextField1.getText(), jTextField3.getText()};
        int anwser = new Bai_2().bai_2(string);
        jTextField2.setText(anwser + "");

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
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 312, 100, 40);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 100, 350);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(null);

        jPanel3.setLayout(null);

        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(0, 0, 325, 50);
        jPanel3.add(jTextField1);
        jTextField1.setBounds(0, 50, 325, 25);

        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(0, 75, 325, 50);
        jPanel3.add(jTextField3);
        jTextField3.setBounds(0, 125, 325, 25);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 325, 350);

        jPanel4.setLayout(null);

        jLabel5.setText("jLabel5");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(0, 0, 325, 50);
        jPanel4.add(jTextField2);
        jTextField2.setBounds(0, 50, 325, 25);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(325, 0, 325, 350);

        add(jPanel2);
        jPanel2.setBounds(100, 0, 650, 350);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}