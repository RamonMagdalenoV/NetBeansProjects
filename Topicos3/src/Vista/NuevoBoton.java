/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import napkin.NapkinLookAndFeel;
//import napkin.NapkinLookAndFeel;

/**
 *
 * @author Ralex-Pc
 */
public class NuevoBoton extends javax.swing.JFrame {

    /**
     * Creates new form NuevoBoton
     */
    public NuevoBoton() {
        initComponents();
    }

    private void setImage(int x, int y)
    {
        Jb_m.setIcon(ajustarImagen("/ico/200px-NSMB2_Fire_Mario.png", x, y));
        Jb_m.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
   }
    
    private ImageIcon ajustarImagen(String ico, int x, int y)
    {
        ImageIcon icotmp = new ImageIcon(getClass().getResource(ico));
        ImageIcon icox = new ImageIcon(icotmp.getImage().getScaledInstance(x, y,Image.SCALE_DEFAULT));
        return icox;
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vistaBoton1 = new Vista.VistaBoton();
        btnt = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        Jb_m = new javax.swing.JLabel();
        vistaBoton2 = new Vista.VistaBoton();

        vistaBoton1.setText("vistaBoton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnt.setText("jButton1");
        btnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntActionPerformed(evt);
            }
        });

        jSlider1.setMajorTickSpacing(5);
        jSlider1.setMaximum(30);
        jSlider1.setMinimum(5);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(15);
        jSlider1.setValueIsAdjusting(true);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        Jb_m.setIcon(new javax.swing.ImageIcon("C:\\Users\\rammv\\Documents\\NetBeansProjects\\Topicos3\\src\\ico\\200px-NSMB2_Fire_Mario.png")); // NOI18N
        Jb_m.setPreferredSize(new java.awt.Dimension(120, 120));

        vistaBoton2.setPreferredSize(new java.awt.Dimension(130, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(Jb_m, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(vistaBoton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(btnt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Jb_m, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vistaBoton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        setImage(jSlider1.getValue()*5, jSlider1.getValue()*5);
      btnt.setBounds(btnt.getX(), btnt.getY(), jSlider1.getValue()*5, jSlider1.getValue()*5);
       vistaBoton2.setSize(jSlider1.getValue()*5, jSlider1.getValue()*5); 
        
      

    }//GEN-LAST:event_jSlider1StateChanged

    private void btntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntActionPerformed
        
    }//GEN-LAST:event_btntActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoBoton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoBoton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoBoton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoBoton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    NuevoBoton v = new NuevoBoton();
                UIManager.setLookAndFeel(new NapkinLookAndFeel());
                SwingUtilities.updateComponentTreeUI(v);
                v.setVisible(true);
                } catch (UnsupportedLookAndFeelException e) {
                    Logger.getLogger(NuevoBoton.class.getName()).log(Level.SEVERE,null,e);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jb_m;
    private javax.swing.JButton btnt;
    private javax.swing.JSlider jSlider1;
    private Vista.VistaBoton vistaBoton1;
    private Vista.VistaBoton vistaBoton2;
    // End of variables declaration//GEN-END:variables
}
