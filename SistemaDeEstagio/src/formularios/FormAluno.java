/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import dao.AlunoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mapeamento.Aluno;

/**
 *
 * @author Gabriel Pedrosa
 */
public class FormAluno extends javax.swing.JFrame {

    /**
     * Creates new form FormAluno
     */
    public FormAluno() {
        initComponents();
        preencherTabela();
        btCadAtualizar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupSexo = new javax.swing.ButtonGroup();
        tabAluno = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCadId = new javax.swing.JTextField();
        txtCadNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCadTelefone = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCadCpf = new javax.swing.JFormattedTextField();
        txtCadtRg = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCadDataNasc = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        radCadFeminino = new javax.swing.JRadioButton();
        radCadMasculino = new javax.swing.JRadioButton();
        btCadSalvar = new javax.swing.JButton();
        btCadAtualizar = new javax.swing.JButton();
        btCadCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtListPesquisa = new javax.swing.JTextField();
        btListPesquisa = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListAlunos = new javax.swing.JTable();
        btListExcluir = new javax.swing.JButton();
        btListEditar = new javax.swing.JButton();
        btListNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(54, 54, 54));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 620));

        tabAluno.setBackground(new java.awt.Color(54, 54, 54));
        tabAluno.setForeground(new java.awt.Color(54, 54, 54));
        tabAluno.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        tabAluno.setPreferredSize(new java.awt.Dimension(700, 500));

        jPanel1.setBackground(new java.awt.Color(54, 54, 54));

        jPanel3.setBackground(new java.awt.Color(2, 67, 63));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 209, 71));
        jLabel1.setText("CADASTRAR ALUNOS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(54, 54, 54));

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID.:");

        txtCadId.setEditable(false);

        txtCadNome.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CPF.:");

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome.:");

        try {
            txtCadTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCadTelefone.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data Nascimento.:");

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefone.:");

        try {
            txtCadCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCadCpf.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N

        txtCadtRg.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("RG.:");

        try {
            txtCadDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCadDataNasc.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sexo.:");

        radCadFeminino.setBackground(new java.awt.Color(54, 54, 54));
        groupSexo.add(radCadFeminino);
        radCadFeminino.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        radCadFeminino.setForeground(new java.awt.Color(255, 255, 255));
        radCadFeminino.setSelected(true);
        radCadFeminino.setText("Feminino");

        radCadMasculino.setBackground(new java.awt.Color(54, 54, 54));
        groupSexo.add(radCadMasculino);
        radCadMasculino.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        radCadMasculino.setForeground(new java.awt.Color(255, 255, 255));
        radCadMasculino.setText("Masculino");

        btCadSalvar.setText("SALVAR");
        btCadSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadSalvarActionPerformed(evt);
            }
        });

        btCadAtualizar.setText("ATUALIZAR");
        btCadAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadAtualizarActionPerformed(evt);
            }
        });

        btCadCancelar.setText("CANCELAR");
        btCadCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCadCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(txtCadtRg))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCadDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCadTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCadNome, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCadId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radCadFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btCadSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139)
                                .addComponent(btCadAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(radCadMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btCadCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)))))
                .addGap(37, 37, 37))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCadId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCadNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCadCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtCadDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCadtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCadTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radCadFeminino)
                        .addComponent(radCadMasculino)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabAluno.addTab("Cadastro", jPanel1);

        jPanel5.setBackground(new java.awt.Color(2, 67, 63));

        jLabel9.setFont(new java.awt.Font("Courier New", 1, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(252, 209, 71));
        jLabel9.setText("Pesquisar.:");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtListPesquisa.setFont(new java.awt.Font("Courier New", 1, 22)); // NOI18N

        btListPesquisa.setText("...");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtListPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btListPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addComponent(txtListPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btListPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(54, 54, 54));

        tbListAlunos.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        tbListAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "RG", "DATA NASC", "TELEFONE", "SEXO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbListAlunos);
        if (tbListAlunos.getColumnModel().getColumnCount() > 0) {
            tbListAlunos.getColumnModel().getColumn(0).setResizable(false);
            tbListAlunos.getColumnModel().getColumn(0).setPreferredWidth(15);
            tbListAlunos.getColumnModel().getColumn(1).setResizable(false);
            tbListAlunos.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbListAlunos.getColumnModel().getColumn(2).setResizable(false);
            tbListAlunos.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbListAlunos.getColumnModel().getColumn(3).setResizable(false);
            tbListAlunos.getColumnModel().getColumn(3).setPreferredWidth(80);
            tbListAlunos.getColumnModel().getColumn(4).setResizable(false);
            tbListAlunos.getColumnModel().getColumn(5).setResizable(false);
            tbListAlunos.getColumnModel().getColumn(6).setResizable(false);
        }

        btListExcluir.setText("EXCLUIR");
        btListExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListExcluirActionPerformed(evt);
            }
        });

        btListEditar.setText("EDITAR");
        btListEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListEditarActionPerformed(evt);
            }
        });

        btListNovo.setText("NOVO");
        btListNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btListNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(btListEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(btListExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btListEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btListNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabAluno.addTab("Lista de Alunos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadSalvarActionPerformed
        String sexo = radCadFeminino.getText();
        Aluno a = new Aluno();
        a.setNome(txtCadNome.getText());
        a.setCpf(txtCadCpf.getText());
        a.setRg(txtCadtRg.getText());
        a.setTelefone(txtCadTelefone.getText());
        a.setDatanasc(txtCadDataNasc.getText());
        if(radCadFeminino.isSelected()){
            sexo = radCadFeminino.getText();
        }else if(radCadMasculino.isSelected()){
            sexo = radCadMasculino.getText();
        }
        a.setSexo(sexo);
        
        AlunoDAO aDAO = new AlunoDAO();
        
        aDAO.cadastrar(a);
        
        preencherTabela();
        tabAluno.setSelectedIndex(1);
    }//GEN-LAST:event_btCadSalvarActionPerformed

    private void btCadAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadAtualizarActionPerformed
        String sexo = radCadFeminino.getText();
        Aluno a = new Aluno();
        a.setId_aluno(Integer.parseInt(txtCadId.getText()));
        a.setNome(txtCadNome.getText());
        a.setCpf(txtCadCpf.getText());
        a.setRg(txtCadtRg.getText());
        a.setTelefone(txtCadTelefone.getText());
        a.setDatanasc(txtCadDataNasc.getText());
        if(radCadFeminino.isSelected()){
            sexo = radCadFeminino.getText();
        }else if(radCadMasculino.isSelected()){
            sexo = radCadMasculino.getText();
        }
        a.setSexo(sexo);
        
        AlunoDAO aDAO = new AlunoDAO();
        
        aDAO.atualizar(a);
        
        preencherTabela();
        
        btCadAtualizar.setVisible(false);
        btCadSalvar.setVisible(true);
        
        tabAluno.setSelectedIndex(1);
    }//GEN-LAST:event_btCadAtualizarActionPerformed

    private void btListEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListEditarActionPerformed
        int opcao = tbListAlunos.getSelectedRow();
        
        if(opcao >= 0){
            txtCadId.setText(tbListAlunos.getValueAt(opcao, 0).toString());
            txtCadNome.setText(tbListAlunos.getValueAt(opcao, 1).toString());
            txtCadCpf.setText(tbListAlunos.getValueAt(opcao, 2).toString());
            txtCadtRg.setText(tbListAlunos.getValueAt(opcao, 3).toString());
            txtCadDataNasc.setText(tbListAlunos.getValueAt(opcao, 4).toString());
            txtCadTelefone.setText(tbListAlunos.getValueAt(opcao, 5).toString());
            String sexo = tbListAlunos.getValueAt(opcao, 6).toString();
            if(sexo.equals(radCadFeminino.getText())){
                radCadFeminino.setSelected(true);
            }else if(sexo.equals(radCadMasculino.getText())){
                radCadMasculino.setSelected(true);
            }
            
            tabAluno.setSelectedIndex(0);
            
            btCadAtualizar.setVisible(true);
            btCadSalvar.setVisible(false);

        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para continuar!");
        }
    }//GEN-LAST:event_btListEditarActionPerformed

    private void btListExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListExcluirActionPerformed
        int opcao = tbListAlunos.getSelectedRow();
        
        if(opcao >= 0){
            Aluno a = new Aluno();
            a.setId_aluno(Integer.parseInt(tbListAlunos.getValueAt(opcao, 0).toString()));
            a.setNome(tbListAlunos.getValueAt(opcao, 1).toString());
            a.setCpf(tbListAlunos.getValueAt(opcao, 2).toString());
            a.setRg(tbListAlunos.getValueAt(opcao, 3).toString());
            a.setDatanasc(tbListAlunos.getValueAt(opcao, 4).toString());
            a.setTelefone(tbListAlunos.getValueAt(opcao, 5).toString());
            String sexo = tbListAlunos.getValueAt(opcao, 6).toString();
            a.setSexo(sexo);
            
            AlunoDAO aDAO = new AlunoDAO();
            aDAO.excluir(a);
            
            preencherTabela();

        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma linha para continuar!");
        }
    }//GEN-LAST:event_btListExcluirActionPerformed

    private void btCadCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadCancelarActionPerformed
        txtCadId.setText("");
        txtCadNome.setText("");
        txtCadCpf.setText("");
        txtCadtRg.setText("");
        txtCadDataNasc.setText("");
        txtCadTelefone.setText("");
        radCadFeminino.setSelected(true);
        
        btCadAtualizar.setVisible(false);
        btCadSalvar.setVisible(true);
        
        tabAluno.setSelectedIndex(1);
    }//GEN-LAST:event_btCadCancelarActionPerformed

    private void btListNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListNovoActionPerformed
        txtCadId.setText("");
        txtCadNome.setText("");
        txtCadCpf.setText("");
        txtCadtRg.setText("");
        txtCadDataNasc.setText("");
        txtCadTelefone.setText("");
        radCadFeminino.setSelected(true);
        
        btCadAtualizar.setVisible(false);
        btCadSalvar.setVisible(true);
        
        tabAluno.setSelectedIndex(0);
    }//GEN-LAST:event_btListNovoActionPerformed
    
    // Método para preencher a tabela de Alunos
    public void preencherTabela(){
        AlunoDAO aDAO = new AlunoDAO();
        List<Aluno> listaAlunos = aDAO.listarTodos();
        DefaultTableModel modeloTbAlunos = (DefaultTableModel) tbListAlunos.getModel();
        modeloTbAlunos.setRowCount(0);
        for(Aluno a: listaAlunos){
            modeloTbAlunos.addRow(new Object[] {a.getId_aluno(), a.getNome(), a.getCpf(), a.getRg(), a.getDatanasc(), a.getTelefone(), a.getSexo()});
        }
    }
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
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadAtualizar;
    private javax.swing.JButton btCadCancelar;
    private javax.swing.JButton btCadSalvar;
    private javax.swing.JButton btListEditar;
    private javax.swing.JButton btListExcluir;
    private javax.swing.JButton btListNovo;
    private javax.swing.JButton btListPesquisa;
    private javax.swing.ButtonGroup groupSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radCadFeminino;
    private javax.swing.JRadioButton radCadMasculino;
    private javax.swing.JTabbedPane tabAluno;
    private javax.swing.JTable tbListAlunos;
    private javax.swing.JFormattedTextField txtCadCpf;
    private javax.swing.JFormattedTextField txtCadDataNasc;
    private javax.swing.JTextField txtCadId;
    private javax.swing.JTextField txtCadNome;
    private javax.swing.JFormattedTextField txtCadTelefone;
    private javax.swing.JTextField txtCadtRg;
    private javax.swing.JTextField txtListPesquisa;
    // End of variables declaration//GEN-END:variables
}
