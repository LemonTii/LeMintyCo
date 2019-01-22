
package Calculation;

import javax.swing.JOptionPane;

public class Cosine extends javax.swing.JFrame {

    double a, b, c, A, ans;
    
    public Cosine() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        aVal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        field1 = new javax.swing.JLabel();
        field2 = new javax.swing.JLabel();
        field4 = new javax.swing.JLabel();
        bVal = new javax.swing.JTextField();
        cVal = new javax.swing.JTextField();
        Enter = new javax.swing.JButton();
        AAval = new javax.swing.JTextField();
        field3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Answer = new javax.swing.JTextField();
        field5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        aVal.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        aVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aValActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel1.setText("a^2=b^2+c^2-2*b*c*cosA");

        field1.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        field1.setText("a Value");

        field2.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        field2.setText("b Value");

        field4.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        field4.setText("A Value");

        bVal.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        bVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bValActionPerformed(evt);
            }
        });

        cVal.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        cVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cValActionPerformed(evt);
            }
        });

        Enter.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        Enter.setText("Enter");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        AAval.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        AAval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AAvalActionPerformed(evt);
            }
        });

        field3.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        field3.setText("c Value");

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel2.setText("Formula:");

        Answer.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        Answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerActionPerformed(evt);
            }
        });

        field5.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        field5.setText("Answer:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Enter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aVal)
                    .addComponent(field4)
                    .addComponent(field3)
                    .addComponent(field1)
                    .addComponent(field2)
                    .addComponent(AAval)
                    .addComponent(cVal)
                    .addComponent(bVal))
                .addGap(184, 184, 184)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(field5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(165, 165, 165))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(field5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(field1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aVal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(field2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bVal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(field3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cVal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(field4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AAval, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
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

    private void aValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aValActionPerformed
    }//GEN-LAST:event_aValActionPerformed

    private void bValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bValActionPerformed
    }//GEN-LAST:event_bValActionPerformed

    private void cValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cValActionPerformed
    }//GEN-LAST:event_cValActionPerformed

    private void AAvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AAvalActionPerformed
    }//GEN-LAST:event_AAvalActionPerformed

    private void AnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerActionPerformed
    }//GEN-LAST:event_AnswerActionPerformed

    private double cosinelaw(double x, double y, double Z) {
        double val= Math.pow( x, 2)+ Math.pow(y, 2)+ (2*x*y*Math.cos(Z));
        double fin=Math.sqrt(val);
        return fin;
    }
    
    private double cosineangle(double x, double y, double z) {
        double val= (Math.pow(y, 2)+ Math.pow(z, 2)- Math.pow(x,2)) / (2*y*z);
        double fin= Math.acos(val);
        return fin;
    }
    
    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        try {
            //solves for missing side length a
            if ("".equals(aVal.getText())) {
                b= Double.parseDouble(bVal.getText());
                c= Double.parseDouble(cVal.getText());
                A= Double.parseDouble(AAval.getText());
                
                Answer.setText("a= "+cosinelaw(b,c,A));
            }   
            //solves for missing side length b    
            else if ("".equals(bVal.getText())) {
                a= Double.parseDouble(aVal.getText());
                c= Double.parseDouble(cVal.getText());
                A= Double.parseDouble(AAval.getText());
                
                Answer.setText("b= "+cosinelaw(a,c,A));
            }
            //solves for the missing side length c
            else if ("".equals(cVal.getText())) {
                a= Double.parseDouble(aVal.getText());
                b= Double.parseDouble(bVal.getText());
                A= Double.parseDouble(AAval.getText());
                
                Answer.setText("c= "+cosinelaw(a,b,A));
            }
            //solves for the missing angle
            else if ("".equals(AAval.getText())) {
                a= Double.parseDouble(aVal.getText());
                b= Double.parseDouble(bVal.getText());
                c= Double.parseDouble(cVal.getText());
                
                Answer.setText("Angle= "+cosineangle(a,b,c));
            }
        }
        catch (ArithmeticException a) {
            Answer.setText("Mathematical error");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Invalid/missing variable");
        }
    }//GEN-LAST:event_EnterActionPerformed

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
            java.util.logging.Logger.getLogger(Cosine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cosine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cosine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cosine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cosine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AAval;
    private javax.swing.JTextField Answer;
    private javax.swing.JButton Enter;
    private javax.swing.JTextField aVal;
    private javax.swing.JTextField bVal;
    private javax.swing.JTextField cVal;
    private javax.swing.JLabel field1;
    private javax.swing.JLabel field2;
    private javax.swing.JLabel field3;
    private javax.swing.JLabel field4;
    private javax.swing.JLabel field5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
