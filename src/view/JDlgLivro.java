package view;

import javax.swing.JOptionPane;
import bean.Lspf_livros;
import dao.Lspf_livrosDAO;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class JDlgLivro extends javax.swing.JDialog {

    
        private MaskFormatter mascaraData;
        
    public JDlgLivro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Livros");
        setLocationRelativeTo(null);
        desabilitar();
        
        
        
        try {
            mascaraData = new MaskFormatter("##/##/##");
        } catch (ParseException ex) {
        }
        jFmtLspf_DataLasc.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
        
        
    }

    private void habilitar() {
        jTxtLspf_Codigo.setEnabled(true);
        jTxtLspf_Descricao.setEnabled(true);
        jTxtLspf_Quantidade.setEnabled(true);
        jTxtLspf_Editora.setEnabled(true);
        jTxtLspf_Autor.setEnabled(true);
        jFmtLspf_DataLasc.setEnabled(true);
        jFmtLspf_Preco.setEnabled(true);
        jBtnLspf_Incluir.setEnabled(false);
        jBtnLspf_Alterar.setEnabled(false);
        jBtnLspf_Pesquisar.setEnabled(false);
        jBtnLspf_Excluir.setEnabled(false);
        jBtnLspf_Cancelar.setEnabled(true);
        jBtnLspf_Confirmar.setEnabled(true);
    }

    private void desabilitar() {
        jTxtLspf_Codigo.setEnabled(false);
        jTxtLspf_Descricao.setEnabled(false);
        jTxtLspf_Quantidade.setEnabled(false);
        jTxtLspf_Editora.setEnabled(false);
        jTxtLspf_Autor.setEnabled(false);
        jFmtLspf_DataLasc.setEnabled(false);
        jFmtLspf_Preco.setEnabled(false);
        jBtnLspf_Incluir.setEnabled(true);
        jBtnLspf_Alterar.setEnabled(true);
        jBtnLspf_Pesquisar.setEnabled(true);
        jBtnLspf_Excluir.setEnabled(true);
        jBtnLspf_Cancelar.setEnabled(false);
        jBtnLspf_Confirmar.setEnabled(false);
    }
    
    private void limpar() {
        jTxtLspf_Codigo.setText(null);
        jTxtLspf_Descricao.setText(null);
        jTxtLspf_Quantidade.setText(null);
        jTxtLspf_Editora.setText(null);
        jTxtLspf_Autor.setText(null);
        jFmtLspf_DataLasc.setText(null);;
        jFmtLspf_Preco.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblCodigo = new javax.swing.JLabel();
        jLblNome = new javax.swing.JLabel();
        jLblApelido = new javax.swing.JLabel();
        jLblDataNasc = new javax.swing.JLabel();
        jTxtLspf_Codigo = new javax.swing.JTextField();
        jTxtLspf_Descricao = new javax.swing.JTextField();
        jFmtLspf_DataLasc = new javax.swing.JFormattedTextField();
        jBtnLspf_Incluir = new javax.swing.JButton();
        jBtnLspf_Alterar = new javax.swing.JButton();
        jBtnLspf_Excluir = new javax.swing.JButton();
        jBtnLspf_Confirmar = new javax.swing.JButton();
        jBtnLspf_Cancelar = new javax.swing.JButton();
        jBtnLspf_Pesquisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxtLspf_Quantidade = new javax.swing.JTextField();
        jTxtLspf_Editora = new javax.swing.JTextField();
        jFmtLspf_Preco = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtLspf_Autor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLblCodigo.setText("Preço");

        jLblNome.setText("Código");

        jLblApelido.setText("Descrição");

        jLblDataNasc.setText("Data de Lançamento");

        jFmtLspf_DataLasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtLspf_DataLascActionPerformed(evt);
            }
        });

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

        jLabel2.setText("Editora");

        jLabel6.setText("Quantidade");

        jFmtLspf_Preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtLspf_PrecoActionPerformed(evt);
            }
        });

        jLabel8.setText("Autor");

        jTxtLspf_Autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtLspf_AutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTxtLspf_Descricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                        .addComponent(jTxtLspf_Codigo, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLblApelido)
                    .addComponent(jLblNome)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jBtnLspf_Incluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnLspf_Alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnLspf_Excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnLspf_Confirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnLspf_Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnLspf_Pesquisar))
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTxtLspf_Autor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFmtLspf_Preco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(jLblCodigo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtLspf_Quantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jTxtLspf_Editora))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFmtLspf_DataLasc, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblDataNasc)))))
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
                .addComponent(jTxtLspf_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCodigo)
                    .addComponent(jLabel6))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtLspf_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtLspf_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel8)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLblDataNasc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtLspf_Autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtLspf_Editora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtLspf_DataLasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
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
        
        Lspf_livros livros = new Lspf_livros ();
        
        int cod = Integer.parseInt(jTxtLspf_Codigo.getText());
        livros.setLspf_idLivros(cod);
        livros.setLspf_autor(jTxtLspf_Autor.getText());
        livros.setLspf_editora(jTxtLspf_Editora.getText());
        livros.setLspf_descr(jTxtLspf_Descricao.getText());
        int quant = Integer.parseInt(jTxtLspf_Quantidade.getText());
        BigDecimal preco = new BigDecimal(jFmtLspf_Preco.getText());
        livros.setLspf_preco(preco);
        livros.setLspf_quantidade(quant);
        livros.setLspf_data(null);
        
        Lspf_livrosDAO livrosDAO = new Lspf_livrosDAO();
        livrosDAO.insert(livros);
        
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
        if (resp == null) {
            JOptionPane.showMessageDialog(null, "Código em branco");
        } else {
        Lspf_livrosDAO livrosDAO = new Lspf_livrosDAO();
        Lspf_livros livros = (Lspf_livros) livrosDAO.list(Integer.parseInt(resp));
        
        jTxtLspf_Codigo.setText(String.valueOf(resp));
        jTxtLspf_Autor.setText(livros.getLspf_autor());
        jTxtLspf_Descricao.setText(livros.getLspf_descr());
        jTxtLspf_Editora.setText(livros.getLspf_editora());
        jTxtLspf_Quantidade.setText(String.valueOf(livros.getLspf_quantidade()));
        jFmtLspf_DataLasc.setText(null);
        jFmtLspf_Preco.setText(String.valueOf(livros.getLspf_preco()));
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
        Lspf_livros livros = new Lspf_livros ();
        
        int cod = Integer.parseInt(jTxtLspf_Codigo.getText());
        livros.setLspf_idLivros(cod);
        livros.setLspf_autor(jTxtLspf_Autor.getText());
        livros.setLspf_editora(jTxtLspf_Editora.getText());
        livros.setLspf_descr(jTxtLspf_Descricao.getText());
        int quant = Integer.parseInt(jTxtLspf_Quantidade.getText());
        livros.setLspf_quantidade(quant);
        livros.setLspf_data(null);
        
        Lspf_livrosDAO livrosDAO = new Lspf_livrosDAO();
        livrosDAO.delete(livros);
        
        limpar();
        }
    }//GEN-LAST:event_jBtnLspf_ExcluirActionPerformed

    private void jFmtLspf_DataLascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtLspf_DataLascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtLspf_DataLascActionPerformed

    private void jFmtLspf_PrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtLspf_PrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtLspf_PrecoActionPerformed

    private void jTxtLspf_AutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtLspf_AutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtLspf_AutorActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            JDlgLivro dialog = new JDlgLivro(new javax.swing.JFrame(), true);
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
    private javax.swing.JFormattedTextField jFmtLspf_DataLasc;
    private javax.swing.JFormattedTextField jFmtLspf_Preco;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLblApelido;
    private javax.swing.JLabel jLblCodigo;
    private javax.swing.JLabel jLblDataNasc;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JTextField jTxtLspf_Autor;
    private javax.swing.JTextField jTxtLspf_Codigo;
    private javax.swing.JTextField jTxtLspf_Descricao;
    private javax.swing.JTextField jTxtLspf_Editora;
    private javax.swing.JTextField jTxtLspf_Quantidade;
    // End of variables declaration//GEN-END:variables
}
