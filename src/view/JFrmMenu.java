/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class JFrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form JFrm
     */
    public JFrmMenu() {
        initComponents();
        setTitle("Sistema Biblioteca");
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMnuLspf_Cadastro = new javax.swing.JMenu();
        jMnuLspf_Usuarios = new javax.swing.JMenuItem();
        jMnuLspf_Vendedores = new javax.swing.JMenuItem();
        jMnuLspf_Clientes = new javax.swing.JMenuItem();
        jMnuLspf_Livros = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMnuLspf_Sair = new javax.swing.JMenuItem();
        jMnuLspf_Movimento = new javax.swing.JMenu();
        jMnuLspf_Vendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMnuLspf_Cadastro.setMnemonic('C');
        jMnuLspf_Cadastro.setText("Cadastro");

        jMnuLspf_Usuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuLspf_Usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/usuario.png"))); // NOI18N
        jMnuLspf_Usuarios.setMnemonic('u');
        jMnuLspf_Usuarios.setText("Usuarios");
        jMnuLspf_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMnuLspf_UsuariosMouseClicked(evt);
            }
        });
        jMnuLspf_Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuLspf_UsuariosActionPerformed(evt);
            }
        });
        jMnuLspf_Cadastro.add(jMnuLspf_Usuarios);

        jMnuLspf_Vendedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuLspf_Vendedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/grupo.png"))); // NOI18N
        jMnuLspf_Vendedores.setMnemonic('v');
        jMnuLspf_Vendedores.setText("Vendedores");
        jMnuLspf_Vendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuLspf_VendedoresActionPerformed(evt);
            }
        });
        jMnuLspf_Cadastro.add(jMnuLspf_Vendedores);

        jMnuLspf_Clientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuLspf_Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/cliente.png"))); // NOI18N
        jMnuLspf_Clientes.setMnemonic('c');
        jMnuLspf_Clientes.setText("Clientes");
        jMnuLspf_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuLspf_ClientesActionPerformed(evt);
            }
        });
        jMnuLspf_Cadastro.add(jMnuLspf_Clientes);

        jMnuLspf_Livros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMnuLspf_Livros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/produto.png"))); // NOI18N
        jMnuLspf_Livros.setMnemonic('l');
        jMnuLspf_Livros.setText("Livros");
        jMnuLspf_Livros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuLspf_LivrosActionPerformed(evt);
            }
        });
        jMnuLspf_Cadastro.add(jMnuLspf_Livros);
        jMnuLspf_Cadastro.add(jSeparator1);

        jMnuLspf_Sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMnuLspf_Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/exit.png"))); // NOI18N
        jMnuLspf_Sair.setText("Sair");
        jMnuLspf_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuLspf_SairActionPerformed(evt);
            }
        });
        jMnuLspf_Cadastro.add(jMnuLspf_Sair);

        jMenuBar1.add(jMnuLspf_Cadastro);

        jMnuLspf_Movimento.setMnemonic('M');
        jMnuLspf_Movimento.setText("Movimento");

        jMnuLspf_Vendas.setText("Vendas");
        jMnuLspf_Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuLspf_VendasActionPerformed(evt);
            }
        });
        jMnuLspf_Movimento.add(jMnuLspf_Vendas);

        jMenuBar1.add(jMnuLspf_Movimento);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuLspf_UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuLspf_UsuariosActionPerformed
        JDlgUsuario jDlgU = new JDlgUsuario(null, true);
        jDlgU.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMnuLspf_UsuariosActionPerformed

    private void jMnuLspf_UsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMnuLspf_UsuariosMouseClicked
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMnuLspf_UsuariosMouseClicked

    private void jMnuLspf_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuLspf_SairActionPerformed
        System.exit(WIDTH);        // TODO add your handling code here:
    }//GEN-LAST:event_jMnuLspf_SairActionPerformed

    private void jMnuLspf_LivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuLspf_LivrosActionPerformed
        JDlgLivro jDlgL = new JDlgLivro(null, true);
        jDlgL.setVisible(true); 
// TODO add your handling code here:
    }//GEN-LAST:event_jMnuLspf_LivrosActionPerformed

    private void jMnuLspf_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuLspf_ClientesActionPerformed
        JDlgCliente jDlgC = new JDlgCliente(null, true);
        jDlgC.setVisible(true); 
// TODO add your handling code here:
    }//GEN-LAST:event_jMnuLspf_ClientesActionPerformed

    private void jMnuLspf_VendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuLspf_VendedoresActionPerformed
    JDlgVendedor jDlgV = new JDlgVendedor(null, true);
    jDlgV.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jMnuLspf_VendedoresActionPerformed

    private void jMnuLspf_VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuLspf_VendasActionPerformed
       JOptionPane.showMessageDialog(rootPane, "Em construção");   // TODO add your handling code here:
    }//GEN-LAST:event_jMnuLspf_VendasActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMnuLspf_Cadastro;
    private javax.swing.JMenuItem jMnuLspf_Clientes;
    private javax.swing.JMenuItem jMnuLspf_Livros;
    private javax.swing.JMenu jMnuLspf_Movimento;
    private javax.swing.JMenuItem jMnuLspf_Sair;
    private javax.swing.JMenuItem jMnuLspf_Usuarios;
    private javax.swing.JMenuItem jMnuLspf_Vendas;
    private javax.swing.JMenuItem jMnuLspf_Vendedores;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
