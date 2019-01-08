
package Calculation;


public class Calculator extends javax.swing.JFrame {
    
    
    double firstNum;
    double secondNum;
    double result;
    String operations; 
    
    public Calculator() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        DISPLAY = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        PLUS = new javax.swing.JButton();
        MINUS = new javax.swing.JButton();
        DIVIDE = new javax.swing.JButton();
        MULTIPLY = new javax.swing.JButton();
        NEGA = new javax.swing.JButton();
        DEC = new javax.swing.JButton();
        ERASE = new javax.swing.JButton();
        EQUAL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        DISPLAY.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DISPLAY.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton10.setText("0");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        PLUS.setBackground(new java.awt.Color(255, 255, 255));
        PLUS.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        PLUS.setText("+");
        PLUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLUSActionPerformed(evt);
            }
        });

        MINUS.setBackground(new java.awt.Color(255, 255, 255));
        MINUS.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        MINUS.setText("-");
        MINUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MINUSActionPerformed(evt);
            }
        });

        DIVIDE.setBackground(new java.awt.Color(255, 255, 255));
        DIVIDE.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        DIVIDE.setText("/");
        DIVIDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIVIDEActionPerformed(evt);
            }
        });

        MULTIPLY.setBackground(new java.awt.Color(255, 255, 255));
        MULTIPLY.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        MULTIPLY.setText("*");
        MULTIPLY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MULTIPLYActionPerformed(evt);
            }
        });

        NEGA.setBackground(new java.awt.Color(255, 255, 255));
        NEGA.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        NEGA.setText("+/-");
        NEGA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEGAActionPerformed(evt);
            }
        });

        DEC.setBackground(new java.awt.Color(255, 255, 255));
        DEC.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        DEC.setText(".");
        DEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DECActionPerformed(evt);
            }
        });

        ERASE.setBackground(new java.awt.Color(255, 255, 255));
        ERASE.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        ERASE.setText("C");
        ERASE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ERASEActionPerformed(evt);
            }
        });

        EQUAL.setBackground(new java.awt.Color(255, 255, 255));
        EQUAL.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        EQUAL.setText("=");
        EQUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EQUALActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(DISPLAY, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PLUS, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MINUS, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(DIVIDE, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MULTIPLY, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NEGA, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DEC, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ERASE, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EQUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DISPLAY, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PLUS, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MINUS, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DIVIDE, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MULTIPLY, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NEGA, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DEC, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ERASE, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EQUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String EnterNum = DISPLAY.getText() + jButton4.getText();
        DISPLAY.setText(EnterNum);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String EnterNum = DISPLAY.getText() + jButton8.getText();
        DISPLAY.setText(EnterNum);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String EnterNum = DISPLAY.getText() + jButton1.getText();
        DISPLAY.setText(EnterNum);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String EnterNum = DISPLAY.getText() + jButton2.getText();
        DISPLAY.setText(EnterNum);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String EnterNum = DISPLAY.getText() + jButton3.getText();
        DISPLAY.setText(EnterNum);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String EnterNum = DISPLAY.getText() + jButton5.getText();
        DISPLAY.setText(EnterNum);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String EnterNum = DISPLAY.getText() + jButton6.getText();
        DISPLAY.setText(EnterNum);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String EnterNum = DISPLAY.getText() + jButton7.getText();
        DISPLAY.setText(EnterNum);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String EnterNum = DISPLAY.getText() + jButton9.getText();
        DISPLAY.setText(EnterNum);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String EnterNum = DISPLAY.getText() + jButton10.getText();
        DISPLAY.setText(EnterNum);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void ERASEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ERASEActionPerformed
        DISPLAY.setText("");
    }//GEN-LAST:event_ERASEActionPerformed

    private void PLUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLUSActionPerformed
        // TODO add your handling code here:
        firstNum = Double.parseDouble(DISPLAY.getText());
        DISPLAY.setText("");
        operations = "+";
    }//GEN-LAST:event_PLUSActionPerformed

    private void MINUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MINUSActionPerformed
        // TODO add your handling code here:
        firstNum = Double.parseDouble(DISPLAY.getText());
        DISPLAY.setText("");
        operations = "-";
    }//GEN-LAST:event_MINUSActionPerformed

    private void DIVIDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIVIDEActionPerformed
        firstNum = Double.parseDouble(DISPLAY.getText());
        DISPLAY.setText("");
        operations = "/";
    }//GEN-LAST:event_DIVIDEActionPerformed

    private void MULTIPLYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MULTIPLYActionPerformed
        firstNum = Double.parseDouble(DISPLAY.getText());
        DISPLAY.setText("");
        operations = "*";
    }//GEN-LAST:event_MULTIPLYActionPerformed

    private void DECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DECActionPerformed
        String EnterNum = DISPLAY.getText() + DEC.getText();
        DISPLAY.setText(EnterNum);
    }//GEN-LAST:event_DECActionPerformed

    private void NEGAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEGAActionPerformed
        double ops = Double.parseDouble(String.valueOf(DISPLAY.getText()));
        ops = ops * (-1);
        DISPLAY.setText(String.valueOf(ops));
    }//GEN-LAST:event_NEGAActionPerformed

    private void EQUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EQUALActionPerformed
        String answer;
        secondNum = Double.parseDouble(DISPLAY.getText());
        
        if (operations == "+") {
            result = firstNum + secondNum;
            answer = String.format("%.0f",result);
            DISPLAY.setText(answer);
        }
        else if (operations == "-") {
            result = firstNum - secondNum;
            answer = String.format("%.0f",result);
            DISPLAY.setText(answer);
        }
        else if (operations == "/") {
            result = firstNum / secondNum;
            answer = String.format("%.0f",result);
            DISPLAY.setText(answer);
        }
        else if (operations == "*") {
            result = firstNum * secondNum;
            answer = String.format("%.0f",result);
            DISPLAY.setText(answer);
        }
    }//GEN-LAST:event_EQUALActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DEC;
    private javax.swing.JTextField DISPLAY;
    private javax.swing.JButton DIVIDE;
    private javax.swing.JButton EQUAL;
    private javax.swing.JButton ERASE;
    private javax.swing.JButton MINUS;
    private javax.swing.JButton MULTIPLY;
    private javax.swing.JButton NEGA;
    private javax.swing.JButton PLUS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
