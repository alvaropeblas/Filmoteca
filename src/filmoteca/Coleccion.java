/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package filmoteca;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Coleccion extends javax.swing.JFrame {

    TableModelPeliculas table;

    /**
     * Constructor Inicia una conexion con la base de datos al iniciarse la
     * aplicacion Actualiza la tabla de peliculas automaticamente al iniciar
     */
    public Coleccion() {

        try {
            ConexionDB4O.crearConexion("bdpeliculas.db4o");
            ConexionDB4O.getInstance().conectar();

            table = new TableModelPeliculas();
            initComponents();

        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upEditar = new javax.swing.JPopupMenu();
        jmEditar = new javax.swing.JMenuItem();
        jmBorrar = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTitulo = new javax.swing.JTextField();
        jAño = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSinopsis = new javax.swing.JTextField();
        bAñadir = new javax.swing.JButton();
        bLimpiar = new javax.swing.JButton();
        cbPuncuacion = new javax.swing.JComboBox<>();

        upEditar.setComponentPopupMenu(upEditar);
        upEditar.setPopupSize(new java.awt.Dimension(100, 100));

        jmEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editar.png"))); // NOI18N
        jmEditar.setText("Editar");
        jmEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEditarActionPerformed(evt);
            }
        });
        upEditar.add(jmEditar);

        jmBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basura.png"))); // NOI18N
        jmBorrar.setText("Borrar");
        jmBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBorrarActionPerformed(evt);
            }
        });
        upEditar.add(jmBorrar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tbTabla.setModel(table);
        tbTabla.setComponentPopupMenu(upEditar);
        tbTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTabla);

        jLabel1.setText("Titulo:");

        jLabel2.setText("Año:");

        jTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTituloActionPerformed(evt);
            }
        });

        jAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAñoActionPerformed(evt);
            }
        });

        jLabel3.setText("Puntuación:");

        jLabel4.setText("Sinopsis: ");

        jSinopsis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSinopsisActionPerformed(evt);
            }
        });

        bAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mas.png"))); // NOI18N
        bAñadir.setText("Añadir");
        bAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAñadirActionPerformed(evt);
            }
        });

        bLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpieza-de-datos.png"))); // NOI18N
        bLimpiar.setText("Limpiar");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
            }
        });

        cbPuncuacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cbPuncuacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPuncuacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSinopsis, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPuncuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAñadir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bLimpiar)
                        .addComponent(cbPuncuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTituloActionPerformed

    private void jAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAñoActionPerformed

    private void jSinopsisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSinopsisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSinopsisActionPerformed
    /**
     * Botón para añadir una pelicula. Realiza una consulta, y con un Insert
     * recibe los datos introducidos en los TextField, ejecuta dicha consulta y
     * actualiza la base de datos, que a su vez actualiza la tabla con los datos
     * de la BBDD
     */
    private void bAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAñadirActionPerformed

        String titulo = jTitulo.getText();
        int anyo = Integer.parseInt(jAño.getText());
        int puntuacion = Integer.parseInt(cbPuncuacion.getSelectedItem().toString());
        String sinopsis = jSinopsis.getText();

        try {
            int id = 0;
            if (ConexionDB4O.getInstance().listarPeliculas().isEmpty()) {
                id = 1;
            } else {
                id = ConexionDB4O.getInstance().listarPeliculas().getLast().getId() + 1;
            }
            table.insertarPeliculas(id, titulo, anyo, puntuacion, sinopsis);
        } catch (Exception ex) {
            Logger.getLogger(Coleccion.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_bAñadirActionPerformed
    /**
     * Botón para limpiar los campos de texto.
     */
    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        jTitulo.setText("");
        jAño.setText("");
        jSinopsis.setText("");
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void cbPuncuacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPuncuacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPuncuacionActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void tbTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTablaMouseClicked

    }//GEN-LAST:event_tbTablaMouseClicked
    /**
     * Botón que abre un nuevo JFrame, si se ha pulsado correctamente sobre una
     * fila de la tabla. Este JFrame recibe por parametros, la pelicula escogida
     * de la lista y el JTable
     */
    private void jmEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEditarActionPerformed
        Editar edit = new Editar( table.getList().get(tbTabla.getSelectedRow()), this);

        Pelicula peliEdit = edit.editar();
        try {
            table.actualizarPeliculas(peliEdit.getId(), peliEdit.getTitulo(), peliEdit.getAnyo(), peliEdit.getPuntuacion(), peliEdit.getSinopsis());
        } catch (Exception ex) {
            Logger.getLogger(Coleccion.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jmEditarActionPerformed
    /**
     * Botón que ejecuta un DELETE a la base de datos y elimina la pelicula
     * escogida. Actualiza el JTable con la BBDD actualizada.
     */
    private void jmBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBorrarActionPerformed
        Pelicula p = table.getValueAt(tbTabla.getSelectedRow());
        int id = p.getId();
        System.out.println(id);
        table.borrarPelicula(id);
        try {

        } catch (Exception ex) {
            Logger.getLogger(Coleccion.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jmBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Coleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coleccion().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAñadir;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JComboBox<String> cbPuncuacion;
    private javax.swing.JTextField jAño;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSinopsis;
    private javax.swing.JTextField jTitulo;
    private javax.swing.JMenuItem jmBorrar;
    private javax.swing.JMenuItem jmEditar;
    private javax.swing.JTable tbTabla;
    private javax.swing.JPopupMenu upEditar;
    // End of variables declaration//GEN-END:variables
}
