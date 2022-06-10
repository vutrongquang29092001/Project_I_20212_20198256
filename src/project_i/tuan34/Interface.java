/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_i.tuan34;

import java.awt.CardLayout;
import javax.swing.JPanel;
import project_i.tuan34.tuan1.Tuan29;
import project_i.tuan34.tuan2.Tuan30;
import project_i.tuan34.tuan3.Tuan31;
import project_i.tuan34.tuan4.Tuan32;

/**
 *
 * @author Admin
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    CardLayout cardLayout = new CardLayout();

    public Interface() {

        initComponents();
        setUp();
        getExWeek();
        Action();
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setUp() {
        tuan1.setText("Tuần 29");
        tuan2.setText("Tuần 30");
        tuan3.setText("Tuần 31");
        tuan4.setText("Tuần 32");
        tuan5.setText("Tuần 33");
    }

    public void getExWeek() {
        cardLayout = (CardLayout) (jPanel3.getLayout());
        jPanel3.setLayout(cardLayout);

        jPanel3.add(new Tuan29(), "tuan29");
        jPanel3.add(new Tuan30(), "tuan30");
        jPanel3.add(new Tuan31(), "tuan31");
        jPanel3.add(new Tuan32(), "tuan32");
        jPanel3.add(new Tuan31(), "tuan31");
        cardLayout.show(jPanel3, "tuan29");

    }

    public void Action() {
        tuan1.addActionListener((e) -> {
            cardLayout.show(jPanel3, "tuan29");
        });
        tuan2.addActionListener((e) -> {
            cardLayout.show(jPanel3, "tuan30");
        });
        tuan3.addActionListener((e) -> {
            cardLayout.show(jPanel3, "tuan31");
        });
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
        jPanel2 = new javax.swing.JPanel();
        tuan1 = new javax.swing.JButton();
        tuan2 = new javax.swing.JButton();
        tuan3 = new javax.swing.JButton();
        tuan4 = new javax.swing.JButton();
        tuan5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tuan1.setText("jButton1");
        jPanel2.add(tuan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        tuan2.setText("jButton2");
        jPanel2.add(tuan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 170, 50));

        tuan3.setText("jButton3");
        jPanel2.add(tuan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 170, 50));

        tuan4.setText("jButton4");
        jPanel2.add(tuan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 170, 50));

        tuan5.setText("jButton5");
        jPanel2.add(tuan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 170, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 50));

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(new java.awt.CardLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 850, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton tuan1;
    private javax.swing.JButton tuan2;
    private javax.swing.JButton tuan3;
    private javax.swing.JButton tuan4;
    private javax.swing.JButton tuan5;
    // End of variables declaration//GEN-END:variables
}
