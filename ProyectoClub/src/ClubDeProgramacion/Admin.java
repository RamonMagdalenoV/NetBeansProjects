package ClubDeProgramacion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Admin extends javax.swing.JFrame {

    public Connection conexion;
    MySqlOpera c = new MySqlOpera("jdbc:mysql://localhost:3306/club", "root", "root");
    String datos[] = new String[6];
    String[] col = new String[6];
    boolean valida = false;
    Integer id;
    
    String combo;
    DefaultTableModel modelodatos = new DefaultTableModel();
    public Admin() {
        initComponents();
        modelodatos = (DefaultTableModel) jTable.getModel();
        try {
            col[0] = "ID";
            col[1] = "CODIGO";
            col[2] = "NOMBRE";
            col[3] = "APELLIDO";
            col[4] = "TELEFONO";
            col[5] = "DIRECCION";
            DefaultTableModel x = new DefaultTableModel(c.getReg(), col);

            jTable.setModel(x);
            setCombo();
        } catch (IndexOutOfBoundsException e) {
        }

    }
   
    public void setCombo() {
        combo = (String) comboFiltro.getSelectedItem();
        etiFil.setText(combo);
    }

    public void limpiar() {
        txtCod.setText(null);
        txtName.setText(null);
        txtApellido.setText(null);
        txtTel.setText(null);
        txtDir.setText(null);
        idHide.setText(null);
    }
    public void buscar (String campo,String columna){
        modelodatos = (DefaultTableModel) jTable.getModel();
        try {
            col[0] = "ID";
            col[1] = "CODIGO";
            col[2] = "NOMBRE";
            col[3] = "APELLIDO";
            col[4] = "TELEFONO";
            col[5] = "DIRECCION";
            DefaultTableModel x = new DefaultTableModel(c.buscar(campo,columna), col);

            jTable.setModel(x);
            setCombo();
        } catch (IndexOutOfBoundsException e) {
        }
    }
    public void actualizar() {
        try {
            MySqlOpera cx = new MySqlOpera("jdbc:mysql://127.0.0.1/club", "root", "root");
            DefaultTableModel x = new DefaultTableModel(c.getReg(), col);

            jTable.setModel(x);
        } catch (IndexOutOfBoundsException e) {
        }

    }

    public void validarVacios() {
        Object[] d = {txtCod.getText(), txtName.getText(), txtApellido.getText(), txtTel.getText(), txtDir.getText()};

        for (int i = 0; i <= d.length - 1; i++) {
            if (d[i].toString().isEmpty()) {
                valida = true;
                break;
            }
        }

    }
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCod = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();
        JLapellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        idHide = new javax.swing.JTextField();
        etiCodigo = new javax.swing.JLabel();
        etinombre = new javax.swing.JLabel();
        etiTel = new javax.swing.JLabel();
        eqtiDir = new javax.swing.JLabel();
        btnCln = new javax.swing.JButton();
        btnprueba = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox<>();
        etiFil = new javax.swing.JLabel();
        imgSearch = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtFiltro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 51, 204))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N

        txtCod.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        txtName.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        txtTel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        jLabel1.setText("id");

        txtDir.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        JLapellido.setText("Apellido");

        txtApellido.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        idHide.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        idHide.setEnabled(false);
        idHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idHideActionPerformed(evt);
            }
        });

        etiCodigo.setText("Codigo");

        etinombre.setText("Nombre");

        etiTel.setText("Telefono");

        eqtiDir.setText("Dirección");

        btnCln.setText("Limpiar");
        btnCln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClnActionPerformed(evt);
            }
        });

        btnprueba.setText("jButton1");
        btnprueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpruebaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLapellido)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(eqtiDir)
                        .addGap(29, 29, 29)
                        .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiTel)
                            .addComponent(etinombre)
                            .addComponent(etiCodigo)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idHide, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCln, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnprueba, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCln, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idHide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiCodigo)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etinombre)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLapellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiTel))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnprueba)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eqtiDir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrativos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 51, 153))); // NOI18N

        jTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/editar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/add.png"))); // NOI18N
        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/del.png"))); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnDelete.getAccessibleContext().setAccessibleDescription("");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 51, 153))); // NOI18N

        jLabel2.setText("Buscar por: ");

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "codigo", "nombre", "telefono" }));
        comboFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltroActionPerformed(evt);
            }
        });

        imgSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/search-ico.png"))); // NOI18N

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/home.png"))); // NOI18N
        btnBack.setText("Regresar");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiFil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(etiFil, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(imgSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MenuAdministrador regresa = new MenuAdministrador();
        regresa.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        validarVacios();
        if (valida == true) {
            JOptionPane.showMessageDialog(null, "Campos Vacios");
        } else {
            datos[0] = txtCod.getText().toUpperCase();
            datos[1] = txtName.getText();
            datos[2] = txtApellido.getText();
            datos[3] = txtTel.getText();
            datos[4] = txtDir.getText();

            c.addReg(0, datos[0], datos[1], datos[2], datos[3], datos[4]);
            actualizar();
            JOptionPane.showMessageDialog(null, "Agregado correctamente!!");
            limpiar();
            txtCod.grabFocus();
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //  MySqlOpera c = new MySqlOpera("jdbc:mysql://localhost:3306/club", "root", "root");
        try {
            int id;
            id = Integer.parseInt(idHide.getText());
            datos[0] = txtCod.getText().toUpperCase();
            datos[1] = txtName.getText();
            datos[2] = txtApellido.getText();
            datos[3] = txtTel.getText();
            datos[4] = txtDir.getText();
            c.updateRegistro(id, datos[0], datos[1], datos[2], datos[3], datos[4]);
            actualizar();
            JOptionPane.showMessageDialog(null, "Modificado correctamente!!");
            limpiar();
            txtCod.grabFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ningun registro seleccionado");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void idHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idHideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idHideActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        id = Integer.valueOf(jTable.getValueAt(jTable.getSelectedRow(), 0).toString());
        idHide.setText(id.toString());
        txtCod.setText(jTable.getValueAt(jTable.getSelectedRow(), 1).toString());
        txtName.setText(jTable.getValueAt(jTable.getSelectedRow(), 2).toString());
        txtApellido.setText(jTable.getValueAt(jTable.getSelectedRow(), 3).toString());
        txtTel.setText(jTable.getValueAt(jTable.getSelectedRow(), 4).toString());
        txtDir.setText(jTable.getValueAt(jTable.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_jTableMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            c.delRegistro(id);
            actualizar();
            JOptionPane.showMessageDialog(null, "Eliminado Correctamente!!");
            limpiar();
            txtCod.grabFocus();
        } catch (Exception e) {
        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClnActionPerformed
        limpiar();
    }//GEN-LAST:event_btnClnActionPerformed

    private void comboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroActionPerformed
            setCombo();
    }//GEN-LAST:event_comboFiltroActionPerformed

    private void btnpruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpruebaActionPerformed
        // TODO add your handling code here:

      
        buscar(txtFiltro.getText(),"idadministrativos");
    }//GEN-LAST:event_btnpruebaActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLapellido;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCln;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnprueba;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JLabel eqtiDir;
    private javax.swing.JLabel etiCodigo;
    private javax.swing.JLabel etiFil;
    private javax.swing.JLabel etiTel;
    private javax.swing.JLabel etinombre;
    private javax.swing.JTextField idHide;
    private javax.swing.JLabel imgSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
