/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculation;

import javax.swing.JOptionPane;

public class KNoTime extends javax.swing.JFrame {

    double d, v1, v2, a;
    
    public KNoTime() {
        initComponents();
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
        Enter = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Answer = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Acc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Dis = new javax.swing.JTextField();
        Vel2 = new javax.swing.JTextField();
        Vel1 = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        Enter.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        Enter.setText("Enter");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel5.setText("Formula:");

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel6.setText("v2^2 = v1^2 + a*t");

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel7.setText("Answer");

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel1.setText("Acceleration (a)");

        Acc.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        Acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel2.setText("Velocity 1 (v1)");

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel3.setText("Displacement (d)");

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel4.setText("Velocity 2 (v2)");

        Dis.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        Dis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisActionPerformed(evt);
            }
        });

        Vel2.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        Vel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vel2ActionPerformed(evt);
            }
        });

        Vel1.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel2))
                                .addComponent(Dis, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Vel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Vel2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(Acc, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addComponent(jLabel6))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(Enter)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Acc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dis, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(41, 41, 41)
                .addComponent(Enter)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        try{
            if("".equals(Vel2.getText())){
                d = Double.parseDouble(Dis.getText());
                v1 = Double.parseDouble(Vel1.getText());
                a = Double.parseDouble(Acc.getText());

                Answer.setText("v2 = "+calculation1(d,v1,a));
            }
            else if ("".equals(Dis.getText())){
                v2 = Double.parseDouble(Vel2.getText());
                v1 = Double.parseDouble(Vel1.getText());
                a = Double.parseDouble(Acc.getText());

                Answer.setText("d = "+calculation3(a,v2,v1));
            }
            else if ("".equals(Vel1.getText())){
                v2 = Double.parseDouble(Vel2.getText());
                d = Double.parseDouble(Dis.getText());
                a = Double.parseDouble(Acc.getText());

                Answer.setText("v1 = "+calculation2(d,v2,a));
            }
            else if ("".equals(Acc.getText())){
                v2 = Double.parseDouble(Vel2.getText());
                d = Double.parseDouble(Dis.getText());
                v1 = Double.parseDouble(Vel1.getText());

                Answer.setText("a = "+calculation3(d,v2,v1));
            }

        }
        catch(ArithmeticException a){
            Answer.setText("Error");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid/missing variable");
        }
    }//GEN-LAST:event_EnterActionPerformed

    private double calculation1(double x, double y, double z){
        double val = (y*y) + 2*(x*z);
        return val;
    }
    
    private double calculation2(double x, double y, double z){
        double val = -(y*y) + 2*(z*x);
        return val;
    }
    
    private double calculation3(double x, double y, double z){
        double val = ((y*y) + (z*z))/(2*x);
        return val;
    }
    
    private void AccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccActionPerformed

    private void DisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisActionPerformed

    private void Vel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Vel2ActionPerformed

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
            java.util.logging.Logger.getLogger(KNoTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KNoTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KNoTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KNoTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KNoTime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Acc;
    private javax.swing.JTextField Answer;
    private javax.swing.JTextField Dis;
    private javax.swing.JButton Enter;
    private javax.swing.JTextField Vel1;
    private javax.swing.JTextField Vel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
