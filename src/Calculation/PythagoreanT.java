package Calculation;

import javax.swing.JOptionPane;


public class PythagoreanT extends javax.swing.JFrame {
    
    double a;
    double b;
    double c;

    
    public PythagoreanT() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        aVal = new javax.swing.JTextField();
        bVal = new javax.swing.JTextField();
        cVal = new javax.swing.JTextField();
        ANSWER = new javax.swing.JTextField();
        ENTER = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1003, 522));

        label1.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        label1.setText("A Value");

        label2.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        label2.setText("B Value");

        label3.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        label3.setText("C Value");

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel5.setText("Answer");

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel6.setText("Formula:");

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel7.setText("a^2 + b^2 = c^2");

        aVal.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        aVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aValActionPerformed(evt);
            }
        });

        bVal.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N

        cVal.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N

        ANSWER.setEditable(false);
        ANSWER.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        ANSWER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANSWERActionPerformed(evt);
            }
        });

        ENTER.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        ENTER.setText("Enter");
        ENTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENTERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(label1)
                    .addComponent(label3)
                    .addComponent(cVal, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(label2)
                    .addComponent(bVal, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(aVal))
                .addGap(270, 270, 270)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(ANSWER))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aVal, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(ANSWER))
                .addGap(18, 18, 18)
                .addComponent(label2)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bVal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cVal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ENTER)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aValActionPerformed

    private void ENTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENTERActionPerformed
      try { 
        //if c is unknown, then a + b will yield c
        if ("".equals(cVal.getText())) {
            a=Double.parseDouble(aVal.getText());
            b=Double.parseDouble(bVal.getText());
            c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
            ANSWER.setText(String.format("c= %.2f", c));
        
        //if b is unknown, then c - a will yield b
        } else if ("".equals(bVal.getText())) {
            
            a=Double.parseDouble(aVal.getText());
            c=Double.parseDouble(cVal.getText());
            b = Math.sqrt(Math.pow(c,2) - Math.pow(a,2));
            ANSWER.setText(String.format("b= %.2f", b));
            
        //if a is unknown then c - b will yield a
        } else if ("".equals(aVal.getText())) {
            
            b=Double.parseDouble(bVal.getText());
            c=Double.parseDouble(cVal.getText());
            a = Math.sqrt(Math.pow(c,2) - Math.pow(b,2));
            ANSWER.setText(String.format("a= %.2f", a));
            
        //if anything else happens then its invalid
        } else {
            JOptionPane.showMessageDialog(null, "Invalid variable");
        }
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Invalid variable");
      }
    }//GEN-LAST:event_ENTERActionPerformed

    private void ANSWERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANSWERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANSWERActionPerformed

   
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
            java.util.logging.Logger.getLogger(PythagoreanT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PythagoreanT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PythagoreanT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PythagoreanT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PythagoreanT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ANSWER;
    private javax.swing.JButton ENTER;
    private javax.swing.JTextField aVal;
    private javax.swing.JTextField bVal;
    private javax.swing.JTextField cVal;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    // End of variables declaration//GEN-END:variables
}
