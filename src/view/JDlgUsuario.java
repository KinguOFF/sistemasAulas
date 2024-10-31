package view;

import javax.swing.JOptionPane;
import bean.Lspf_usuarios;
import dao.Lspf_usuariosDAO;
import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class JDlgUsuario extends javax.swing.JDialog {

    private MaskFormatter mascaraCPF;
    private MaskFormatter mascaraData;
    
    
    public JDlgUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Usuario");
        setLocationRelativeTo(null);
        desabilitar();
        
        try { // criando máscaras
        mascaraCPF = new MaskFormatter( "###.###.###-##" ); }
        catch ( ParseException exc ) {
        }
        jFmtLspf_CPF.setFormatterFactory( new DefaultFormatterFactory( mascaraCPF ));
        
        try {
            mascaraData = new MaskFormatter("##/##/##");
        } catch (ParseException ex) {
        }
        jFmtLspf_DataNasc.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
    }

    private void habilitar() {
        jTxtLspf_Codigo.setEnabled(true);
        jTxtLspf_Nome.setEnabled(true);
        jTxtLspf_Apelido.setEnabled(true);
        jFmtLspf_CPF.setEnabled(true);
        jFmtLspf_DataNasc.setEnabled(true);
        jPwfLspf_Senha.setEnabled(true);
        jCboLspf_Nivel.setEnabled(true);
        jChbLspf_Ativo.setEnabled(true);
        jBtnLspf_Incluir.setEnabled(false);
        jBtnLspf_Alterar.setEnabled(false);
        jBtnLspf_Pesquisar.setEnabled(false);
        jBtnLspf_Excluir.setEnabled(false);
        jBtnLspf_Cancelar.setEnabled(true);
        jBtnLspf_Confirmar.setEnabled(true);
    }

    private void desabilitar() {
        jTxtLspf_Codigo.setEnabled(false);
        jTxtLspf_Nome.setEnabled(false);
        jTxtLspf_Apelido.setEnabled(false);
        jFmtLspf_CPF.setEnabled(false);
        jFmtLspf_DataNasc.setEnabled(false);
        jPwfLspf_Senha.setEnabled(false);
        jCboLspf_Nivel.setEnabled(false);
        jChbLspf_Ativo.setEnabled(false);
        jBtnLspf_Incluir.setEnabled(true);
        jBtnLspf_Alterar.setEnabled(true);
        jBtnLspf_Pesquisar.setEnabled(true);
        jBtnLspf_Excluir.setEnabled(true);
        jBtnLspf_Cancelar.setEnabled(false);
        jBtnLspf_Confirmar.setEnabled(false);
    }
    
    private void limpar() {
        jTxtLspf_Codigo.setText(null);
        jTxtLspf_Nome.setText(null);
        jTxtLspf_Apelido.setText(null);
        jFmtLspf_CPF.setText(null);
        jFmtLspf_DataNasc.setText(null);
        jPwfLspf_Senha.setText(null);
        jCboLspf_Nivel.setSelectedIndex(0);
        jChbLspf_Ativo.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblCodigo = new javax.swing.JLabel();
        jLblNome = new javax.swing.JLabel();
        jLblApelido = new javax.swing.JLabel();
        jLblCPF = new javax.swing.JLabel();
        jLblSenha = new javax.swing.JLabel();
        jLblNivel = new javax.swing.JLabel();
        jLblDataNasc = new javax.swing.JLabel();
        jTxtLspf_Codigo = new javax.swing.JTextField();
        jTxtLspf_Nome = new javax.swing.JTextField();
        jTxtLspf_Apelido = new javax.swing.JTextField();
        jFmtLspf_CPF = new javax.swing.JFormattedTextField();
        jFmtLspf_DataNasc = new javax.swing.JFormattedTextField();
        jPwfLspf_Senha = new javax.swing.JPasswordField();
        jCboLspf_Nivel = new javax.swing.JComboBox<>();
        jChbLspf_Ativo = new javax.swing.JCheckBox();
        jBtnLspf_Incluir = new javax.swing.JButton();
        jBtnLspf_Alterar = new javax.swing.JButton();
        jBtnLspf_Excluir = new javax.swing.JButton();
        jBtnLspf_Confirmar = new javax.swing.JButton();
        jBtnLspf_Cancelar = new javax.swing.JButton();
        jBtnLspf_Pesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLblCodigo.setText("Codigo");

        jLblNome.setText("Nome");

        jLblApelido.setText("Apelido");

        jLblCPF.setText("CPF");

        jLblSenha.setText("Senha");

        jLblNivel.setText("Nível");

        jLblDataNasc.setText("Data de Nascimento");

        jCboLspf_Nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Funcionario", "Cliente" }));
        jCboLspf_Nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboLspf_NivelActionPerformed(evt);
            }
        });

        jChbLspf_Ativo.setText("Ativo");

        jBtnLspf_Incluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/incluir.png"))); // NOI18N
        jBtnLspf_Incluir.setText("Incluir");
        jBtnLspf_Incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLspf_IncluirActionPerformed(evt);
            }
        });

        jBtnLspf_Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/alterar.png"))); // NOI18N
        jBtnLspf_Alterar.setText("Alterar");
        jBtnLspf_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLspf_AlterarActionPerformed(evt);
            }
        });

        jBtnLspf_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/Excluir.png"))); // NOI18N
        jBtnLspf_Excluir.setText("Excluir");
        jBtnLspf_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLspf_ExcluirActionPerformed(evt);
            }
        });

        jBtnLspf_Confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/gravar.png"))); // NOI18N
        jBtnLspf_Confirmar.setText("Confirmar");
        jBtnLspf_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLspf_ConfirmarActionPerformed(evt);
            }
        });

        jBtnLspf_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/cancelar.png"))); // NOI18N
        jBtnLspf_Cancelar.setText("Cancelar");
        jBtnLspf_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLspf_CancelarActionPerformed(evt);
            }
        });

        jBtnLspf_Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens/pesquisar.png"))); // NOI18N
        jBtnLspf_Pesquisar.setText("Pesquisar");
        jBtnLspf_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLspf_PesquisarActionPerformed(evt);
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
                        .addComponent(jTxtLspf_Codigo)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblSenha)
                                .addGap(316, 316, 316))
                            .addComponent(jPwfLspf_Senha))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCboLspf_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jChbLspf_Ativo)
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblNivel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jTxtLspf_Apelido)
                    .addComponent(jTxtLspf_Nome)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblCodigo)
                            .addComponent(jLblNome)
                            .addComponent(jLblApelido)
                            .addComponent(jLblCPF)
                            .addComponent(jFmtLspf_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblDataNasc)
                            .addComponent(jFmtLspf_DataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(154, 154, 154))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnLspf_Incluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnLspf_Alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnLspf_Excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnLspf_Confirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnLspf_Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnLspf_Pesquisar)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtLspf_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtLspf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblApelido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtLspf_Apelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCPF)
                    .addComponent(jLblDataNasc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtLspf_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtLspf_DataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblSenha)
                    .addComponent(jLblNivel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPwfLspf_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboLspf_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChbLspf_Ativo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnLspf_Alterar)
                    .addComponent(jBtnLspf_Incluir)
                    .addComponent(jBtnLspf_Excluir)
                    .addComponent(jBtnLspf_Confirmar)
                    .addComponent(jBtnLspf_Cancelar)
                    .addComponent(jBtnLspf_Pesquisar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCboLspf_NivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboLspf_NivelActionPerformed

    }//GEN-LAST:event_jCboLspf_NivelActionPerformed

    private void jBtnLspf_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLspf_ConfirmarActionPerformed
        desabilitar();
        
        Lspf_usuarios Lspf_usuarios = new Lspf_usuarios();
        int cod = Integer.parseInt(jTxtLspf_Codigo.getText());
        Lspf_usuarios.setLspf_idUsuario(cod);
        Lspf_usuarios.setLspf_nome(jTxtLspf_Nome.getText());
        Lspf_usuarios.setLspf_apelido(jTxtLspf_Apelido.getText());
        Lspf_usuarios.setLspf_cpf(jFmtLspf_CPF.getText());
        Lspf_usuarios.setLspf_ativo(jChbLspf_Ativo.getText());
        Lspf_usuarios.setLspf_dataNascimento(null);
        Lspf_usuarios.setLspf_senha(jPwfLspf_Senha.getText());
        Lspf_usuarios.setLspf_nivel(jCboLspf_Nivel.getSelectedIndex());
        if (jChbLspf_Ativo.isSelected()){
            Lspf_usuarios.setLspf_ativo("T");
        } else {
            Lspf_usuarios.setLspf_ativo("F");
        }
        
        Lspf_usuariosDAO Lspf_usuariosDAO = new Lspf_usuariosDAO();
        Lspf_usuariosDAO.insert(Lspf_usuarios);
        
        limpar();
    }//GEN-LAST:event_jBtnLspf_ConfirmarActionPerformed

    private void jBtnLspf_IncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLspf_IncluirActionPerformed
        habilitar();
    }//GEN-LAST:event_jBtnLspf_IncluirActionPerformed

    private void jBtnLspf_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLspf_AlterarActionPerformed
        habilitar();
    }//GEN-LAST:event_jBtnLspf_AlterarActionPerformed

    private void jBtnLspf_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLspf_PesquisarActionPerformed
       
//        String resp = JOptionPane.showInputDialog(null, "Entre com o codigo");
//        Lspf_usuariosDAO lspf_usuariosDAO = new Lspf_usuariosDAO();
//        if (resp == null) {
//        JOptionPane.showMessageDialog(null, "Código em branco");
//        } 
//        else{
//        Lspf_usuarios lspf_usuarios = (Lspf_usuarios) lspf_usuariosDAO.list(Integer.parseInt(resp));
//        jTxtLspf_Codigo.setText(resp);
//        jTxtLspf_Nome.setText(lspf_usuarios.getLspf_nome());
//        jTxtLspf_Apelido.setText(lspf_usuarios.getLspf_apelido());
//        jFmtLspf_CPF.setText(lspf_usuarios.getLspf_cpf());
//        jFmtLspf_DataNasc.setText(null);
//        jPwfLspf_Senha.setText(lspf_usuarios.getLspf_senha());
//        jCboLspf_Nivel.setSelectedIndex(lspf_usuarios.getLspf_nivel());
//         if (lspf_usuarios.getLspf_ativo().equals("T")){
//            jChbLspf_Ativo.setSelected(true);
//        } else {
//            jChbLspf_Ativo.setSelected(false);
//        }
//        };
        
        JDialogUsuariosPesquisar pesquisar = new JDialogUsuariosPesquisar(null, true);
        pesquisar.setVisible(true);
        
    }//GEN-LAST:event_jBtnLspf_PesquisarActionPerformed

    private void jBtnLspf_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLspf_CancelarActionPerformed
        desabilitar();
    }//GEN-LAST:event_jBtnLspf_CancelarActionPerformed

    private void jBtnLspf_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLspf_ExcluirActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Confirme exclusão!", "Deletar registro", JOptionPane.YES_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Exclusão realizada");
             Lspf_usuarios Lspf_usuarios = new Lspf_usuarios();
        int cod = Integer.parseInt(jTxtLspf_Codigo.getText());
        Lspf_usuarios.setLspf_idUsuario(cod);
        Lspf_usuarios.setLspf_nome(jTxtLspf_Nome.getText());
        Lspf_usuarios.setLspf_apelido(jTxtLspf_Apelido.getText());
        Lspf_usuarios.setLspf_cpf(jFmtLspf_CPF.getText());
        Lspf_usuarios.setLspf_ativo(jChbLspf_Ativo.getText());
        Lspf_usuarios.setLspf_dataNascimento(null);
        Lspf_usuarios.setLspf_senha(jPwfLspf_Senha.getText());
        Lspf_usuarios.setLspf_nivel(jCboLspf_Nivel.getSelectedIndex());
        if (jChbLspf_Ativo.isSelected()){
            Lspf_usuarios.setLspf_ativo("T");
        } else {
            Lspf_usuarios.setLspf_ativo("F");
        }
        
        Lspf_usuariosDAO Lspf_usuariosDAO = new Lspf_usuariosDAO();
        Lspf_usuariosDAO.delete(Lspf_usuarios);
        
        limpar();
        }
    }//GEN-LAST:event_jBtnLspf_ExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            JDlgUsuario dialog = new JDlgUsuario(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnLspf_Alterar;
    private javax.swing.JButton jBtnLspf_Cancelar;
    private javax.swing.JButton jBtnLspf_Confirmar;
    private javax.swing.JButton jBtnLspf_Excluir;
    private javax.swing.JButton jBtnLspf_Incluir;
    private javax.swing.JButton jBtnLspf_Pesquisar;
    private javax.swing.JComboBox<String> jCboLspf_Nivel;
    private javax.swing.JCheckBox jChbLspf_Ativo;
    private javax.swing.JFormattedTextField jFmtLspf_CPF;
    private javax.swing.JFormattedTextField jFmtLspf_DataNasc;
    private javax.swing.JLabel jLblApelido;
    private javax.swing.JLabel jLblCPF;
    private javax.swing.JLabel jLblCodigo;
    private javax.swing.JLabel jLblDataNasc;
    private javax.swing.JLabel jLblNivel;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblSenha;
    private javax.swing.JPasswordField jPwfLspf_Senha;
    private javax.swing.JTextField jTxtLspf_Apelido;
    private javax.swing.JTextField jTxtLspf_Codigo;
    private javax.swing.JTextField jTxtLspf_Nome;
    // End of variables declaration//GEN-END:variables
}
