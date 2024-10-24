package view;

import javax.swing.JOptionPane;
import bean.Lspf_clientes;
import dao.Lspf_clientesDAO;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class JDlgCliente extends javax.swing.JDialog {

    
    
    private MaskFormatter mascaraCPF;
    private MaskFormatter mascaraCel;
    private MaskFormatter mascaraData;
    private MaskFormatter mascaraCEP;
    
    public JDlgCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cliente");
        setLocationRelativeTo(null);
        desabilitar();
        
        try { // criando máscaras
        mascaraCPF = new MaskFormatter( "###.###.###-##" ); }
        catch ( ParseException exc ) {
        }
        jFmtLspf_CPF.setFormatterFactory( new DefaultFormatterFactory( mascaraCPF ));
        
        try {
            mascaraCel =  new MaskFormatter("(##) ####-####");
        } catch (ParseException ex) {
        }
        jFmtLspf_Celular.setFormatterFactory(new DefaultFormatterFactory(mascaraCel));
        jFmtLspf_Telefone.setFormatterFactory(new DefaultFormatterFactory(mascaraCel));
        
        try {
            mascaraData = new MaskFormatter("##/##/##");
        } catch (ParseException ex) {
        }
        jFmtLspf_DataNasc.setFormatterFactory(new DefaultFormatterFactory(mascaraData));
        
        try {
            mascaraCEP =  new MaskFormatter("#####-###");
        } catch (ParseException ex) {
        }
        
        jFmtLspf_CEP.setFormatterFactory(new DefaultFormatterFactory(mascaraCEP));
    }

    private void habilitar() {
        jTxtLspf_Nome.setEnabled(true);
        jTxtLspf_Cidade.setEnabled(true);
        jTxtLspf_Bairro.setEnabled(true);
        jTxtLspf_cod.setEnabled(true);
        jFmtLspf_CPF.setEnabled(true);
        jFmtLspf_DataNasc.setEnabled(true);
        jFmtLspf_CEP.setEnabled(true);
        jFmtLspf_Celular.setEnabled(true);
        jFmtLspf_RG.setEnabled(true);
        jFmtLspf_Telefone.setEnabled(true);
        jFmtLspf_Endereco.setEnabled(true);
        jFmtLspf_Email.setEnabled(true);
        jCbLspf_Feminino.setEnabled(true);
        jCbLspf_Masculino.setEnabled(true);
        jCboLpsf_Estado.setEnabled(true);
        jChbLspf_Ativo.setEnabled(true);
        jBtnLspf_Incluir.setEnabled(false);
        jBtnLspf_Alterar.setEnabled(false);
        jBtnLspf_Pesquisar.setEnabled(false);
        jBtnLspf_Excluir.setEnabled(false);
        jBtnLspf_Cancelar.setEnabled(true);
        jBtnLspf_Confirmar.setEnabled(true);
    }

    private void desabilitar() {
        jTxtLspf_Nome.setEnabled(false);
        jTxtLspf_Cidade.setEnabled(false);
        jTxtLspf_Bairro.setEnabled(false);
        jTxtLspf_cod.setEnabled(false);
        jFmtLspf_CPF.setEnabled(false);
        jFmtLspf_DataNasc.setEnabled(false);
        jFmtLspf_CEP.setEnabled(false);
        jFmtLspf_Celular.setEnabled(false);
        jFmtLspf_RG.setEnabled(false);
        jFmtLspf_Telefone.setEnabled(false);
        jFmtLspf_Endereco.setEnabled(false);
        jFmtLspf_Email.setEnabled(false);
        jCbLspf_Feminino.setEnabled(false);
        jCbLspf_Masculino.setEnabled(false);
        jChbLspf_Ativo.setEnabled(false);
        jCboLpsf_Estado.setEnabled(false);
        jBtnLspf_Incluir.setEnabled(true);
        jBtnLspf_Alterar.setEnabled(true);
        jBtnLspf_Pesquisar.setEnabled(true);
        jBtnLspf_Excluir.setEnabled(true);
        jBtnLspf_Cancelar.setEnabled(false);
        jBtnLspf_Confirmar.setEnabled(false);

    }
    
    private void limpar() {
        jTxtLspf_Nome.setText(null);
        jTxtLspf_Cidade.setText(null);
        jTxtLspf_Bairro.setText(null);
        jTxtLspf_cod.setText(null);
        jFmtLspf_CPF.setText(null);
        jFmtLspf_DataNasc.setText(null);
        jFmtLspf_CEP.setText(null);
        jFmtLspf_Celular.setText(null);
        jFmtLspf_RG.setText(null);
        jFmtLspf_Telefone.setText(null);
        jFmtLspf_Endereco.setText(null);
        jFmtLspf_Email.setText(null);
        jChbLspf_Ativo.setSelected(false);
        jCbLspf_Feminino.setSelected(false);
        jCbLspf_Masculino.setSelected(false);
        jChbLspf_Ativo.setSelected(false);
        jCboLpsf_Estado.setSelectedIndex(0);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLblCodigo = new javax.swing.JLabel();
        jLblNome = new javax.swing.JLabel();
        jLblCPF = new javax.swing.JLabel();
        jLblDataNasc = new javax.swing.JLabel();
        jTxtLspf_Nome = new javax.swing.JTextField();
        jFmtLspf_CPF = new javax.swing.JFormattedTextField();
        jFmtLspf_DataNasc = new javax.swing.JFormattedTextField();
        jChbLspf_Ativo = new javax.swing.JCheckBox();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFmtLspf_Endereco = new javax.swing.JTextField();
        jTxtLspf_Cidade = new javax.swing.JTextField();
        jTxtLspf_Bairro = new javax.swing.JTextField();
        jFmtLspf_RG = new javax.swing.JFormattedTextField();
        jFmtLspf_CEP = new javax.swing.JFormattedTextField();
        jFmtLspf_Telefone = new javax.swing.JFormattedTextField();
        jFmtLspf_Celular = new javax.swing.JFormattedTextField();
        jCbLspf_Masculino = new javax.swing.JCheckBox();
        jCbLspf_Feminino = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jTxtLspf_cod = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jFmtLspf_Email = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jCboLpsf_Estado = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLblCodigo.setText("RG");

        jLblNome.setText("Nome");

        jLblCPF.setText("CPF");

        jLblDataNasc.setText("Data de Nascimento");

        jFmtLspf_DataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtLspf_DataNascActionPerformed(evt);
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

        jLabel1.setText("Telefone");

        jLabel2.setText("Bairro");

        jLabel3.setText("CEP");

        jLabel4.setText("Endereço");

        jLabel5.setText("Sexo");

        jLabel6.setText("Cidade");

        jLabel7.setText("Celular");

        jFmtLspf_Endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtLspf_EnderecoActionPerformed(evt);
            }
        });

        jFmtLspf_RG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtLspf_RGActionPerformed(evt);
            }
        });

        jFmtLspf_CEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtLspf_CEPActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCbLspf_Masculino);
        jCbLspf_Masculino.setText("Masculino");
        jCbLspf_Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbLspf_MasculinoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCbLspf_Feminino);
        jCbLspf_Feminino.setText("Feminino");
        jCbLspf_Feminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbLspf_FemininoActionPerformed(evt);
            }
        });

        jLabel8.setText("Código");

        jTxtLspf_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtLspf_codActionPerformed(evt);
            }
        });

        jLabel9.setText("Email");

        jFmtLspf_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtLspf_EmailActionPerformed(evt);
            }
        });

        jLabel10.setText("Estado");

        jCboLpsf_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFmtLspf_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jFmtLspf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblCPF)
                                .addGap(270, 270, 270)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jBtnLspf_Incluir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBtnLspf_Alterar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtnLspf_Excluir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBtnLspf_Confirmar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jFmtLspf_DataNasc)
                                        .addGap(210, 210, 210)))
                                .addComponent(jBtnLspf_Cancelar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnLspf_Pesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFmtLspf_RG, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel1)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jFmtLspf_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFmtLspf_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addComponent(jLabel4))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLblCodigo)
                                .addGap(184, 184, 184)
                                .addComponent(jLabel3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtLspf_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFmtLspf_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(48, 48, 48)))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCbLspf_Masculino)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jChbLspf_Ativo)
                                            .addComponent(jCbLspf_Feminino)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(jLabel6)
                                        .addGap(95, 95, 95)
                                        .addComponent(jLabel2)
                                        .addGap(73, 73, 73))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtLspf_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jCboLpsf_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jFmtLspf_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblNome)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTxtLspf_cod, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTxtLspf_Nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE))
                    .addComponent(jLblDataNasc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jTxtLspf_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtLspf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblCodigo)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFmtLspf_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtLspf_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFmtLspf_RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtLspf_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCboLpsf_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtLspf_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtLspf_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtLspf_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbLspf_Masculino)
                    .addComponent(jCbLspf_Feminino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCPF)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtLspf_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtLspf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChbLspf_Ativo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblDataNasc)
                .addGap(5, 5, 5)
                .addComponent(jFmtLspf_DataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnLspf_Alterar)
                    .addComponent(jBtnLspf_Incluir)
                    .addComponent(jBtnLspf_Cancelar)
                    .addComponent(jBtnLspf_Pesquisar)
                    .addComponent(jBtnLspf_Excluir)
                    .addComponent(jBtnLspf_Confirmar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLspf_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLspf_ConfirmarActionPerformed
        desabilitar();
        
        Lspf_clientes clientes = new Lspf_clientes();
        int cod = Integer.parseInt(jTxtLspf_cod.getText());
        clientes.setLspf_idClientes(cod);
        clientes.setLspf_nome(jTxtLspf_Nome.getText());
        clientes.setLspf_ativo(jChbLspf_Ativo.getText());
        clientes.setLspf_bairro(jTxtLspf_Bairro.getText());
        clientes.setLspf_celular(jFmtLspf_Celular.getText());
        clientes.setLspf_cep(jFmtLspf_CEP.getText());
        clientes.setLspf_cidade(jTxtLspf_Cidade.getText());
        clientes.setLspf_telefone(jFmtLspf_Telefone.getText());
        clientes.setLspf_rg(jFmtLspf_RG.getText());
        clientes.setLspf_cpf(jFmtLspf_CPF.getText());
        clientes.setLspf_email(jFmtLspf_Email.getText());
        clientes.setLspf_endereco(jFmtLspf_Endereco.getText());
        clientes.setLspf_estado(jCboLpsf_Estado.getSelectedIndex());
        clientes.setLspf_dataNascimento(null);

        if (jChbLspf_Ativo.isSelected()){
            clientes.setLspf_ativo("T");
        } else {
            clientes.setLspf_ativo("F");
        }
        
        if (jCbLspf_Masculino.isSelected()){
            clientes.setLspf_sexo("M");
        } else {
            clientes.setLspf_sexo("F");
        }
        
        Lspf_clientesDAO clientesDAO = new Lspf_clientesDAO();
        clientesDAO.insert(clientes);
        
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
        Lspf_clientesDAO clientesDAO = new Lspf_clientesDAO();
        Lspf_clientes clientes = (Lspf_clientes) clientesDAO.list(Integer.parseInt(resp));
        jTxtLspf_cod.setText(resp);
        jTxtLspf_Nome.setText(clientes.getLspf_nome());
        jFmtLspf_CPF.setText(clientes.getLspf_cpf());
        jFmtLspf_DataNasc.setText(null);
        jTxtLspf_Bairro.setText(clientes.getLspf_bairro());
        jTxtLspf_Cidade.setText(clientes.getLspf_cidade());
        jFmtLspf_CEP.setText(clientes.getLspf_cep());
        jFmtLspf_Celular.setText(clientes.getLspf_celular());
        jFmtLspf_Email.setText(clientes.getLspf_email());
        jFmtLspf_Endereco.setText(clientes.getLspf_endereco());
        jFmtLspf_RG.setText(clientes.getLspf_rg());
        jFmtLspf_Telefone.setText(clientes.getLspf_telefone());
        jCboLpsf_Estado.setSelectedIndex(clientes.getLspf_estado());
        if (clientes.getLspf_ativo().equals("T")) {
            jChbLspf_Ativo.setSelected(true);
        } else {jChbLspf_Ativo.setSelected(false);}
        
         if ((clientes.getLspf_sexo()).equals("M")){
            jCbLspf_Masculino.setSelected(true);
        } else {
            jCbLspf_Feminino.setSelected(true);
        }
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
            Lspf_clientes clientes = new Lspf_clientes();
        int cod = Integer.parseInt(jTxtLspf_cod.getText());
        clientes.setLspf_idClientes(cod);
        clientes.setLspf_nome(jTxtLspf_Nome.getText());
        clientes.setLspf_ativo(jChbLspf_Ativo.getText());
        clientes.setLspf_bairro(jTxtLspf_Bairro.getText());
        clientes.setLspf_celular(jFmtLspf_Celular.getText());
        clientes.setLspf_cep(jFmtLspf_CEP.getText());
        clientes.setLspf_cidade(jTxtLspf_Cidade.getText());
        clientes.setLspf_cpf(jFmtLspf_CPF.getText());
        clientes.setLspf_email(jFmtLspf_Email.getText());
        clientes.setLspf_endereco(jFmtLspf_Endereco.getText());
        clientes.setLspf_estado(jCboLpsf_Estado.getSelectedIndex());
        clientes.setLspf_dataNascimento(null);

        if (jChbLspf_Ativo.isSelected()){
            clientes.setLspf_ativo("T");
        } else {
            clientes.setLspf_ativo("F");
        }
        
        if (jCbLspf_Masculino.isSelected()){
            clientes.setLspf_sexo("M");
        } else {
            clientes.setLspf_sexo("F");
        }
        
        Lspf_clientesDAO clientesDAO = new Lspf_clientesDAO();
        clientesDAO.delete(clientes);
        limpar();
        }
    }//GEN-LAST:event_jBtnLspf_ExcluirActionPerformed

    private void jFmtLspf_DataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtLspf_DataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtLspf_DataNascActionPerformed

    private void jCbLspf_MasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbLspf_MasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbLspf_MasculinoActionPerformed

    private void jCbLspf_FemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbLspf_FemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbLspf_FemininoActionPerformed

    private void jFmtLspf_RGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtLspf_RGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtLspf_RGActionPerformed

    private void jFmtLspf_CEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtLspf_CEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtLspf_CEPActionPerformed

    private void jFmtLspf_EnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtLspf_EnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtLspf_EnderecoActionPerformed

    private void jTxtLspf_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtLspf_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtLspf_codActionPerformed

    private void jFmtLspf_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtLspf_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtLspf_EmailActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            JDlgCliente dialog = new JDlgCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtnLspf_Alterar;
    private javax.swing.JButton jBtnLspf_Cancelar;
    private javax.swing.JButton jBtnLspf_Confirmar;
    private javax.swing.JButton jBtnLspf_Excluir;
    private javax.swing.JButton jBtnLspf_Incluir;
    private javax.swing.JButton jBtnLspf_Pesquisar;
    private javax.swing.JCheckBox jCbLspf_Feminino;
    private javax.swing.JCheckBox jCbLspf_Masculino;
    private javax.swing.JComboBox<String> jCboLpsf_Estado;
    private javax.swing.JCheckBox jChbLspf_Ativo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JFormattedTextField jFmtLspf_CEP;
    private javax.swing.JFormattedTextField jFmtLspf_CPF;
    private javax.swing.JFormattedTextField jFmtLspf_Celular;
    private javax.swing.JFormattedTextField jFmtLspf_DataNasc;
    private javax.swing.JFormattedTextField jFmtLspf_Email;
    private javax.swing.JTextField jFmtLspf_Endereco;
    private javax.swing.JFormattedTextField jFmtLspf_RG;
    private javax.swing.JFormattedTextField jFmtLspf_Telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblCPF;
    private javax.swing.JLabel jLblCodigo;
    private javax.swing.JLabel jLblDataNasc;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JTextField jTxtLspf_Bairro;
    private javax.swing.JTextField jTxtLspf_Cidade;
    private javax.swing.JTextField jTxtLspf_Nome;
    private javax.swing.JTextField jTxtLspf_cod;
    // End of variables declaration//GEN-END:variables
}
