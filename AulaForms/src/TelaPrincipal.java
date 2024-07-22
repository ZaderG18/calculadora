public class TelaPrincipal extends javax.swing.JFrame {

    double v1,v2,resul;
    
    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtValor1 = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        rblValor1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rblValor2 = new javax.swing.JTextField();
        txtResul = new javax.swing.JLabel();
        rblResul = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        brSoma = new javax.swing.JButton();
        btMult = new javax.swing.JButton();
        btDiv = new javax.swing.JButton();
        btSubtracao = new javax.swing.JButton();
        btPorcen = new javax.swing.JButton();
        btLimpar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtValor2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtValor1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtValor1.setForeground(new java.awt.Color(0, 204, 204));
        txtValor1.setText("Valor 1");
        getContentPane().add(txtValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        txtValor1.getAccessibleContext().setAccessibleName("N1");

        btSair.setBackground(new java.awt.Color(0, 204, 204));
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 80, 40));

        rblValor1.setBackground(new java.awt.Color(51, 255, 204));
        rblValor1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        rblValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rblValor1ActionPerformed(evt);
            }
        });
        getContentPane().add(rblValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 110, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Calculadora");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 288, -1));

        rblValor2.setBackground(new java.awt.Color(51, 255, 204));
        rblValor2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(rblValor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 110, -1));

        txtResul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtResul.setForeground(new java.awt.Color(0, 204, 204));
        txtResul.setText("Resultado:");
        getContentPane().add(txtResul, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        rblResul.setBackground(new java.awt.Color(51, 255, 204));
        rblResul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        rblResul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rblResulActionPerformed(evt);
            }
        });
        getContentPane().add(rblResul, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 110, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operações", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        brSoma.setBackground(new java.awt.Color(153, 204, 255));
        brSoma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        brSoma.setText("+");
        brSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brSomaActionPerformed(evt);
            }
        });

        btMult.setBackground(new java.awt.Color(153, 204, 255));
        btMult.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btMult.setText("*");
        btMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultActionPerformed(evt);
            }
        });

        btDiv.setBackground(new java.awt.Color(153, 204, 255));
        btDiv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btDiv.setText("/");
        btDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDivActionPerformed(evt);
            }
        });

        btSubtracao.setBackground(new java.awt.Color(153, 204, 255));
        btSubtracao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btSubtracao.setText("-");
        btSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubtracaoActionPerformed(evt);
            }
        });

        btPorcen.setBackground(new java.awt.Color(153, 204, 255));
        btPorcen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btPorcen.setText("%");
        btPorcen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPorcenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btMult, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(brSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btSubtracao, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(btDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btPorcen, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMult, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btPorcen, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 170, 210));

        btLimpar1.setBackground(new java.awt.Color(0, 204, 204));
        btLimpar1.setText("Limpar");
        btLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 80, 40));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        txtValor2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtValor2.setForeground(new java.awt.Color(0, 204, 204));
        txtValor2.setText("Valor 2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtValor2)
                .addContainerGap(453, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(txtValor2)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rblResulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rblResulActionPerformed
        
    }//GEN-LAST:event_rblResulActionPerformed

    private void rblValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rblValor1ActionPerformed
       
    }//GEN-LAST:event_rblValor1ActionPerformed

    private void btMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultActionPerformed
        v1 = Double.parseDouble(rblValor1.getText());
        v2 = Double.parseDouble(rblValor2.getText());
        
        resul =v1 * v2;
        
        rblResul.setText(String.valueOf(resul));
    }//GEN-LAST:event_btMultActionPerformed

    private void btDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDivActionPerformed
        v1 = Double.parseDouble(rblValor1.getText());
        v2 = Double.parseDouble(rblValor2.getText());
        
        resul = v1/v2;
        
        rblResul.setText(String.valueOf(resul));
    }//GEN-LAST:event_btDivActionPerformed

    private void brSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brSomaActionPerformed
v1 = Double.parseDouble(rblValor1.getText());  
v2 = Double.parseDouble(rblValor2.getText());

resul = v1+v2;

rblResul.setText(String.valueOf(resul));
    }//GEN-LAST:event_brSomaActionPerformed

    private void btSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubtracaoActionPerformed
v1 = Double.parseDouble(rblValor1.getText());
v2 = Double.parseDouble(rblValor2.getText());

resul = v1 - v2;

rblResul.setText(String.valueOf(resul));

    }//GEN-LAST:event_btSubtracaoActionPerformed

    private void btLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpar1ActionPerformed
    rblValor1.setText("");
    rblValor2.setText("");
    rblResul.setText("");

    }//GEN-LAST:event_btLimpar1ActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btPorcenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPorcenActionPerformed
        v1 = Double.parseDouble(rblValor1.getText());
        v2 = Double.parseDouble(rblValor2.getText());
        
        resul = v1 * v2 / 100;
        
        rblResul.setText(String.valueOf(resul));
    }//GEN-LAST:event_btPorcenActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brSoma;
    private javax.swing.JButton btDiv;
    private javax.swing.JButton btLimpar1;
    private javax.swing.JButton btMult;
    private javax.swing.JButton btPorcen;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSubtracao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField rblResul;
    private javax.swing.JTextField rblValor1;
    private javax.swing.JTextField rblValor2;
    private javax.swing.JLabel txtResul;
    private javax.swing.JLabel txtValor1;
    private javax.swing.JLabel txtValor2;
    // End of variables declaration//GEN-END:variables
}
