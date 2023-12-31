/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Estructuras.NodeUser;
import grafos.App;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @Descripcion: interfaz para agregar usuarios
 * @author Catalina Matheus
 * @version: 21/10/2023
 */
public class AddUser extends javax.swing.JFrame {

    App app = App.getInstance();
    String nuevoUsuario = null;
    String relacion1 = null;
    String relacion2 = null;
    boolean existe = false;

    /**
     * Creates new form AddUser
     */
    public AddUser() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.limpiarList();
        this.agregarElementosLista(); // para colocar desde el comienzo lo que tenemos en el grafo en la lista
    }

    /**
     * @Descripcion: funcion que limpia los JList antes de desplegar la
     * información
     * @return
     * @author: Catalina Matheus
     * @version: 17/10/2023
     */
    public DefaultListModel limpiarList() {
        DefaultListModel modelo = new DefaultListModel();
        jList1.setModel(modelo);
        jList2.setModel(modelo);
        return modelo;
    }

    /**
     * @Descripcion: funcion que coloca todos los usuarios que estan en el grafo
     * en la jList
     * @return
     * @author: Catalina Matheus
     * @version: 17/10/2023
     */
    public DefaultListModel agregarElementosLista() {
        DefaultListModel modelo = (DefaultListModel) jList1.getModel();
        NodeUser aux = this.app.getGraph().getUsers().getpFirst();

        while (aux != null) {
            modelo.addElement(aux.getUsername());
            aux = aux.getpNext();
        }

        return modelo;
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
        jLabel2 = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("Username: ");

        inputUsername.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        inputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUsernameActionPerformed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        jList2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(jList2);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setText("Seleccione (1 a la vez) las personas que ");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setText("siguen al nuevo usuario creado");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel5.setText("Seleccione (1 a la vez) las personas que ");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel6.setText("el nuevo usaurio sigue ");

        jToggleButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jToggleButton1.setText("Agregar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Agregar usuario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel1)
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(109, 109, 109))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jToggleButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(65, 65, 65))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 480));

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, -1, -1));

        jButton3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton3.setText("Atrás");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, -1, -1));

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * @Descripcion: botón para agregar a un nuevo usuario en el grafo (un nuevo
     * nodo)
     * @param evt
     * @author: Catalina Matheus
     * @version: 21/10/2023
     */
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        String username = inputUsername.getText();
        nuevoUsuario = username;
        existe = app.getGraph().getUsers().usernameExists(nuevoUsuario);
        if (username.contains("@") && !username.equals("") && username.length() > 2 && !existe) {
            app.getGraph().getUsers().appendLast(username.replace(" ", ""));
            JOptionPane.showMessageDialog(null, "Se logró guardar de forma exitosa a: " + username.replace(" ", ""));
            app.Addusertxt("src//Txt//Usuarios1.txt", username);
            app.copyTxt("src//Txt//Usuarios1.txt", "src//Txt//Usuarioscopy.txt");
        } else if (existe) {
            JOptionPane.showMessageDialog(null, "El usuario que colocó ya existe!");
            nuevoUsuario = null;
        } else {
            JOptionPane.showMessageDialog(null, "Error! El usuario debe contener al prinicipio un '@'!");
            nuevoUsuario = null;
        }


    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void inputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUsernameActionPerformed

    /**
     * @Descripcion: botón para salir, pero solo si el usuario que fue creado tiene alguna relacion
     * @param evt
     * @author: Rinaldo Reyes
     * @version: 25/10/2023
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        app.printGraph();
        if (this.nuevoUsuario == null) {
            this.setVisible(false);
            ModifyGraph modify = new ModifyGraph();
            modify.setVisible(true);
        } else if (!((this.nuevoUsuario != null && this.relacion1 != null) || (this.nuevoUsuario != null && this.relacion2 != null))) {
            JOptionPane.showMessageDialog(null, "Error! Es necesario agregar una relacion al nuevo usuario");
        } else {
            this.setVisible(false);
            ModifyGraph modify = new ModifyGraph();
            modify.setVisible(true);
        }

    }//GEN-LAST:event_jButton3ActionPerformed
    /**
     * @Descripcion: botón que agrega todos los usuarios que el nuevo usuario
     * sigue
     * @param evt
     * @author: Catalina Matheus
     * @version: 21/10/2023
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (nuevoUsuario == null) {
            JOptionPane.showMessageDialog(null, "Primero debe crear al nuevo usuario!");
        } else {
            String username;
            username = jList2.getSelectedValue();
            if (app.getGraph().getUsers().getpLast().getUsername().equals(nuevoUsuario)) {
                app.getGraph().getUsers().getpLast().getRelaciones().appendLast(username);
                JOptionPane.showMessageDialog(null, "Se guardo con exito la relación");
                app.Addrelaciontxt("src//Txt//Usuarios1.txt", username, nuevoUsuario);
                app.copyTxt("src//Txt//Usuarios1.txt", "src//Txt//Usuarioscopy.txt");
                relacion2 = username;
            }
        }


    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * @Descripcion: boton para agregar una relacion de los usuarios que siguen
     * al nuevo usuario
     * @param evt
     * @author: Catalina Matheus
     * @version: 21/10/2023
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (nuevoUsuario == null) {
            JOptionPane.showMessageDialog(null, "Debe primero crear al nuevo usuario!");
        } else {
            String username;
            username = jList1.getSelectedValue();// el usuario que va a seguir al nuevo usuario
            app.insertRelation(username, nuevoUsuario);
            JOptionPane.showMessageDialog(null, "Se guardo con exito la relación");
            app.Addrelaciontxt("src//Txt//Usuarios1.txt", nuevoUsuario, username);
            app.copyTxt("src//Txt//Usuarios1.txt", "src//Txt//Usuarioscopy.txt");
            relacion1 = username;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
