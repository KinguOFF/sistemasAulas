package view;

import javax.swing.JOptionPane;
import bean.Lspf_vendedores;
import dao.Lspf_vendedoresDAO;
import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class JDlgVendedor extends javax.swing.JDialog {

    private MaskFormatter mascaraCel;
    private MaskFormatter mascaraCEP;
    
    public JDlgVendedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Vedendor");
        setLocationRelativeTo(null);
        desabilitar();
        
        
        try {
            mascaraCel =  new MaskFormatter("(##) ####-####");
        } catch (ParseException ex) {
        }
        jFmtLspf_Telefone.setFormatterFactory(new DefaultFormatterFactory(mascaraCel));
           
        try {
            mascaraCEP =  new MaskFormatter("#####-###");
        } catch (ParseException ex) {
        }
        
        jFmtLspf_CEP.setFormatterFactory(new DefaultFormatterFactory(mascaraCEP));
    }

    private void habilitar() {
        jTxtLspf_Codigo.setEnabled(true);
        jTxtLspf_Nome.setEnabled(true);
        jTxtLspf_Cidade.setEnabled(true);
        jCboLspf_Estado.setEnabled(true);
        jFmtLspf_Email.setEnabled(true);
        jFmtLspf_CEP.setEnabled(true);
        jFmtLspf_Telefone.setEnabled(true);
        jFmtLspf_Endereco.setEnabled(true);
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
        jTxtLspf_Cidade.setEnabled(false);
        jCboLspf_Estado.setEnabled(false);
        jFmtLspf_Email.setEnabled(false);
        jFmtLspf_CEP.setEnabled(false);
        jFmtLspf_Telefone.setEnabled(false);
        jFmtLspf_Endereco.setEnabled(false);
        jBtnLspf_Incluir.setEnabled(true);
        jBtnLspf_Alterar.setEnabled(true);
        jBtnLspf_Pesquisar.setEnabled(true);
        jBtnLspf_Excluir.setEnabled(true);
        jBtnLspf_Cancelar.setEnabled(false);
        jBtnLspf_Confirmar.setEnabled(false);
    }
    
    private void limpar(){
        jTxtLspf_Codigo.setText(null);
        jTxtLspf_Nome.setText(null);
        jTxtLspf_Cidade.setText(null);
        jFmtLspf_CEP.setText(null);
        jFmtLspf_Telefone.setText(null);
        jFmtLspf_Endereco.setText(null);
        jFmtLspf_Email.setText(null);
        jCboLspf_Estado.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblNome = new javax.swing.JLabel();
        jLblApelido = new javax.swing.JLabel();
        jLblCPF = new javax.swing.JLabel();
        jTxtLspf_Codigo = new javax.swing.JTextField();
        jTxtLspf_Nome = new javax.swing.JTextField();
        jFmtLspf_Email = new javax.swing.JFormattedTextField();
        jBtnLspf_Incluir = new javax.swing.JButton();
        jBtnLspf_Alterar = new javax.swing.JButton();
        jBtnLspf_Excluir = new javax.swing.JButton();
        jBtnLspf_Confirmar = new javax.swing.JButton();
        jBtnLspf_Cancelar = new javax.swing.JButton();
        jBtnLspf_Pesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jFmtLspf_Endereco = new javax.swing.JTextField();
        jTxtLspf_Cidade = new javax.swing.JTextField();
        jFmtLspf_CEP = new javax.swing.JFormattedTextField();
        jFmtLspf_Telefone = new javax.swing.JFormattedTextField();
        jCboLspf_Estado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLblNome.setText("Código");

        jLblApelido.setText("Nome");

        jLblCPF.setText("Email");

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

        jLabel1.setText("Telefone");

        jLabel2.setText("Estado");

        jLabel3.setText("CEP");

        jLabel4.setText("Endereço");

        jLabel6.setText("Cidade");

        jFmtLspf_Endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtLspf_EnderecoActionPerformed(evt);
            }
        });

        jFmtLspf_CEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtLspf_CEPActionPerformed(evt);
            }
        });

        jCboLspf_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        jCboLspf_Estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboLspf_EstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFmtLspf_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTxtLspf_Nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                        .addComponent(jTxtLspf_Codigo, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLblApelido)
                    .addComponent(jLblCPF)
                    .addComponent(jLblNome)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jBtnLspf_Incluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnLspf_Alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnLspf_Excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnLspf_Confirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnLspf_Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnLspf_Pesquisar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jFmtLspf_Email, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jFmtLspf_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addComponent(jFmtLspf_Endereco, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(jTxtLspf_Cidade))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jCboLspf_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtLspf_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLblApelido)
                .addGap(18, 18, 18)
                .addComponent(jTxtLspf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtLspf_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtLspf_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboLspf_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtLspf_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtLspf_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLblCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFmtLspf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnLspf_Alterar)
                    .addComponent(jBtnLspf_Incluir)
                    .addComponent(jBtnLspf_Cancelar)
                    .addComponent(jBtnLspf_Pesquisar)
                    .addComponent(jBtnLspf_Excluir)
                    .addComponent(jBtnLspf_Confirmar))
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLspf_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLspf_ConfirmarActionPerformed
        desabilitar();
        
        Lspf_vendedores vendedores = new Lspf_vendedores();
        
        int cod = Integer.parseInt(jTxtLspf_Codigo.getText());
        vendedores.setLspf_idVendedores(cod);
        vendedores.setLspf_cidade(jTxtLspf_Cidade.getText());
        vendedores.setLspf_nome(jTxtLspf_Nome.getText());
        vendedores.setLspf_email(jFmtLspf_Email.getText());
        vendedores.setLspf_endereco(jFmtLspf_Endereco.getText());
        vendedores.setLspf_cep(jFmtLspf_CEP.getText());
        vendedores.setLspf_telefone(jFmtLspf_Telefone.getText());
        vendedores.setLspf_estado(jCboLspf_Estado.getSelectedIndex());
        
        Lspf_vendedoresDAO vendedoresDAO = new Lspf_vendedoresDAO();
        vendedoresDAO.insert(vendedores);
        
        limpar();
    }//GEN-LAST:event_jBtnLspf_ConfirmarActionPerformed

    private void jBtnLspf_IncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLspf_IncluirActionPerformed
        habilitar();
    }//GEN-LAST:event_jBtnLspf_IncluirActionPerformed

    private void jBtnLspf_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLspf_AlterarActionPerformed
        habilitar();
    }//GEN-LAST:event_jBtnLspf_AlterarActionPerformed

    private void jBtnLspf_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLspf_PesquisarActionPerformed
        String resp = JOptionPane.showInputDialog(null, "Entre com o codigo");
        Lspf_vendedoresDAO vendedoresDAO = new Lspf_vendedoresDAO();
        if (resp == null) {
        JOptionPane.showMessageDialog(null, "Código em branco");
        } 
        else{
        Lspf_vendedores vendedores = (Lspf_vendedores) vendedoresDAO.list(Integer.parseInt(resp));
        jTxtLspf_Codigo.setText(resp);
        jTxtLspf_Nome.setText(vendedores.getLspf_nome());
        jTxtLspf_Cidade.setText(vendedores.getLspf_cidade());
        jFmtLspf_CEP.setText(vendedores.getLspf_cep());
        jFmtLspf_Email.setText(vendedores.getLspf_email());
        jFmtLspf_Endereco.setText(vendedores.getLspf_endereco());
        jFmtLspf_Telefone.setText(vendedores.getLspf_telefone());
        jCboLspf_Estado.setSelectedIndex(vendedores.getLspf_estado());
        }
    }//GEN-LAST:event_jBtnLspf_PesquisarActionPerformed

    private void jBtnLspf_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLspf_CancelarActionPerformed
        desabilitar();
    }//GEN-LAST:event_jBtnLspf_CancelarActionPerformed

    private void jBtnLspf_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLspf_ExcluirActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Confirme exclusão!", "Deletar registro", JOptionPane.YES_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Exclusão realizada");
            desabilitar();
        Lspf_vendedores vendedores = new Lspf_vendedores();
        
        int cod = Integer.parseInt(jTxtLspf_Codigo.getText());
        vendedores.setLspf_idVendedores(cod);
        vendedores.setLspf_cidade(jTxtLspf_Cidade.getText());
        vendedores.setLspf_email(jFmtLspf_Email.getText());
        vendedores.setLspf_endereco(jFmtLspf_Endereco.getText());
        vendedores.setLspf_cep(jFmtLspf_CEP.getText());
        vendedores.setLspf_telefone(jFmtLspf_Telefone.getText());
        vendedores.setLspf_estado(jCboLspf_Estado.getSelectedIndex());
        
        Lspf_vendedoresDAO vendedoresDAO = new Lspf_vendedoresDAO();
        vendedoresDAO.delete(vendedores);
        
        limpar();
        }
    }//GEN-LAST:event_jBtnLspf_ExcluirActionPerformed

    private void jFmtLspf_CEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtLspf_CEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtLspf_CEPActionPerformed

    private void jFmtLspf_EnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtLspf_EnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtLspf_EnderecoActionPerformed

    private void jCboLspf_EstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboLspf_EstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboLspf_EstadoActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            JDlgVendedor dialog = new JDlgVendedor(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> jCboLspf_Estado;
    private javax.swing.JFormattedTextField jFmtLspf_CEP;
    private javax.swing.JFormattedTextField jFmtLspf_Email;
    private javax.swing.JTextField jFmtLspf_Endereco;
    private javax.swing.JFormattedTextField jFmtLspf_Telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLblApelido;
    private javax.swing.JLabel jLblCPF;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JTextField jTxtLspf_Cidade;
    private javax.swing.JTextField jTxtLspf_Codigo;
    private javax.swing.JTextField jTxtLspf_Nome;
    // End of variables declaration//GEN-END:variables
}
