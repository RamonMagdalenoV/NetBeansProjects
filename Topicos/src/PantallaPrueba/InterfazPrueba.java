
package PantallaPrueba;

public class InterfazPrueba extends javax.swing.JFrame {

    public InterfazPrueba() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUno = new javax.swing.JButton();
        txtPantalla = new javax.swing.JTextField();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        Buff = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnUno.setText("1");
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        btnDos.setText("2");
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });

        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnCuatro.setText("4");
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

        btnCero.setText("0");
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });

        btnSiete.setText("7");
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });

        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnNueve.setText("9");
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });

        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnOcho.setText("8");
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });

        Buff.setText("StringBuffer");
        Buff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTres)
                        .addGap(68, 68, 68)
                        .addComponent(Buff))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCuatro)
                            .addComponent(btnSiete))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnOcho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNueve))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCinco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSeis))))
                    .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCero))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUno)
                    .addComponent(btnDos)
                    .addComponent(btnTres)
                    .addComponent(Buff))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCinco)
                    .addComponent(btnSeis)
                    .addComponent(btnCuatro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOcho)
                    .addComponent(btnNueve)
                    .addComponent(btnSiete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCero)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
       txtPantalla.setText(txtPantalla.getText() + "1");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
      txtPantalla.setText(txtPantalla.getText() + "7");
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
       txtPantalla.setText(txtPantalla.getText() + "2");
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        txtPantalla.setText(txtPantalla.getText() + "3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
    txtPantalla.setText(txtPantalla.getText() + "4");
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
       txtPantalla.setText(txtPantalla.getText() + "5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        txtPantalla.setText(txtPantalla.getText() + "6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
       txtPantalla.setText(txtPantalla.getText() + "8");
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        txtPantalla.setText(txtPantalla.getText() + "9");
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        txtPantalla.setText(txtPantalla.getText() + "0");
    }//GEN-LAST:event_btnCeroActionPerformed

    private void BuffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuffActionPerformed
        StringBuffer str = new StringBuffer("Hola");
        System.out.println(str);
        str.append(" Mundo");
        System.out.println(str.capacity());
        System.out.println(str);
        //System.out.println(str.reverse());
        str.delete(str.length()-1,str.length());
        System.out.println(str);
    }//GEN-LAST:event_BuffActionPerformed

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
                if ("Nexus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buff;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JTextField txtPantalla;
    // End of variables declaration//GEN-END:variables
}
