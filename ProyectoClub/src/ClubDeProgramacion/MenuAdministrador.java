
package ClubDeProgramacion;

import javax.swing.JOptionPane;

public class MenuAdministrador extends javax.swing.JFrame {

    public MenuAdministrador() {
        setResizable(false);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTeachers = new javax.swing.JButton();
        btnStudents = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnAsignture = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        JLimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(580, 330));

        btnTeachers.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnTeachers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/teacher.png"))); // NOI18N
        btnTeachers.setText("Profesores");

        btnStudents.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/student.png"))); // NOI18N
        btnStudents.setText("Alumnos");
        btnStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentsActionPerformed(evt);
            }
        });

        btnAdmin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/administrator.png"))); // NOI18N
        btnAdmin.setText("Administrativos");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnAsignture.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAsignture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signatures.png"))); // NOI18N
        btnAsignture.setText("Cursos");
        btnAsignture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsigntureActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close_sesion.png"))); // NOI18N
        btnClose.setText("Cerrar Sesion");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        JLimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin.jpg"))); // NOI18N
        JLimg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLimg, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAsignture, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTeachers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAsignture, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(btnStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(JLimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsigntureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsigntureActionPerformed
        
    }//GEN-LAST:event_btnAsigntureActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        dispose();
        Admin m = new Admin();
        m.setVisible(true);
       
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStudentsActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        Principal x = new Principal();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLimg;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnAsignture;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnStudents;
    private javax.swing.JButton btnTeachers;
    // End of variables declaration//GEN-END:variables
}
