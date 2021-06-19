/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import static java.lang.Thread.sleep;
import mapeamento.Funcionario;

/**
 *
 * @author Guilherme
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu(Funcionario f) {
        initComponents();
        lbNome.setText("Bem Vindo, "+f.getNome()+"!");
        //animacao();
   }
    
    public void animacao(){
        new Thread(){
            public void run(){
                int x = 400;
                int y = titulo.getLocation().y;
                while(true){
                    x--;
                    if(x < - 400){
                        x = 400;
                    }
                    titulo.setLocation(x, y);
                    try{
                        sleep(10);
                    }catch(Exception ex){
                    }
                }
            }
        }.start();
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
        titulo = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btAlunos = new javax.swing.JButton();
        btFuncionarios = new javax.swing.JButton();
        btEmpresas = new javax.swing.JButton();
        btRelatorios = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btEstágios = new javax.swing.JButton();
        btProfOrient = new javax.swing.JButton();
        btFuncEmpresa = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        itemAluno = new javax.swing.JMenuItem();
        itemEmpresa = new javax.swing.JMenuItem();
        itemFuncionario = new javax.swing.JMenuItem();
        itemFuncionarioEmp = new javax.swing.JMenuItem();
        itemProfOrient = new javax.swing.JMenuItem();
        menuEstagios = new javax.swing.JMenu();
        itemAdicionarEstagio = new javax.swing.JMenuItem();
        itemEditarEstagio = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        itemRelatorioAlunos = new javax.swing.JMenuItem();
        itemRelatorioEstagio = new javax.swing.JMenuItem();
        itemRelatorioEmpresas = new javax.swing.JMenuItem();
        itemRelatorioFuncionarios = new javax.swing.JMenuItem();
        itemRelatorioFuncionarioEmp = new javax.swing.JMenuItem();
        itemRelatorioProfOrient = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itemChamado = new javax.swing.JMenuItem();
        menuConfiguracoes = new javax.swing.JMenu();
        itemAlterarSenha = new javax.swing.JMenuItem();
        itemLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(2, 67, 63));

        titulo.setFont(new java.awt.Font("Courier New", 1, 40)); // NOI18N
        titulo.setForeground(new java.awt.Color(252, 209, 71));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("SISTEMA DE ESTÁGIO");

        btSair.setText("SAIR");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lbNome.setFont(new java.awt.Font("Courier New", 1, 28)); // NOI18N
        lbNome.setForeground(new java.awt.Color(225, 241, 137));
        lbNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNome.setText("Bem vindo, nome!");

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btSair)
                        .addGap(3, 3, 3)))
                .addComponent(lbNome, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(54, 54, 54));

        jPanel4.setBackground(new java.awt.Color(96, 106, 164));
        jPanel4.setPreferredSize(new java.awt.Dimension(700, 409));

        jPanel3.setBackground(new java.awt.Color(96, 106, 164));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 204));

        btAlunos.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aluno.png"))); // NOI18N
        btAlunos.setText("ALUNOS");
        btAlunos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAlunos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlunosActionPerformed(evt);
            }
        });

        btFuncionarios.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionarios.png"))); // NOI18N
        btFuncionarios.setText("FUNCIONARIOS");
        btFuncionarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFuncionarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncionariosActionPerformed(evt);
            }
        });

        btEmpresas.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btEmpresas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/empresa.png"))); // NOI18N
        btEmpresas.setText("EMPRESAS");
        btEmpresas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEmpresas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmpresasActionPerformed(evt);
            }
        });

        btRelatorios.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorios.png"))); // NOI18N
        btRelatorios.setText("RELATÓRIOS");
        btRelatorios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btRelatorios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatoriosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btEmpresas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btEmpresas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(96, 106, 164));

        btEstágios.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btEstágios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/estágio.png"))); // NOI18N
        btEstágios.setText("ESTÁGIOS");
        btEstágios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEstágios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btEstágios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEstágiosActionPerformed(evt);
            }
        });

        btProfOrient.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btProfOrient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/proforient.png"))); // NOI18N
        btProfOrient.setText(" PROF. ORIENTADOR  ");
        btProfOrient.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btProfOrient.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btProfOrient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProfOrientActionPerformed(evt);
            }
        });

        btFuncEmpresa.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btFuncEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcemp.png"))); // NOI18N
        btFuncEmpresa.setText("FUNC. EMPRESA");
        btFuncEmpresa.setActionCommand("<html>\n<center> \nFUNCIONÁRIO\n<br>\nEMPRESA\n</center> ");
        btFuncEmpresa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFuncEmpresa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFuncEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btEstágios, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(btProfOrient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44)
                .addComponent(btFuncEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btEstágios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(btFuncEmpresa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btProfOrient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addGap(48, 48, 48))
        );

        jMenuBar1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N

        menuCadastros.setText("CADASTROS");
        menuCadastros.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N

        itemAluno.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        itemAluno.setText("Aluno");
        itemAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlunoActionPerformed(evt);
            }
        });
        menuCadastros.add(itemAluno);

        itemEmpresa.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        itemEmpresa.setText("Empresa");
        itemEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEmpresaActionPerformed(evt);
            }
        });
        menuCadastros.add(itemEmpresa);

        itemFuncionario.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        itemFuncionario.setText("Funcionário");
        itemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFuncionarioActionPerformed(evt);
            }
        });
        menuCadastros.add(itemFuncionario);

        itemFuncionarioEmp.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        itemFuncionarioEmp.setText("Funcionário Empresa");
        itemFuncionarioEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFuncionarioEmpActionPerformed(evt);
            }
        });
        menuCadastros.add(itemFuncionarioEmp);

        itemProfOrient.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        itemProfOrient.setText("Professor Orientador");
        itemProfOrient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProfOrientActionPerformed(evt);
            }
        });
        menuCadastros.add(itemProfOrient);

        jMenuBar1.add(menuCadastros);

        menuEstagios.setText("ESTÁGIO");
        menuEstagios.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N

        itemAdicionarEstagio.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        itemAdicionarEstagio.setText("Adicionar");
        menuEstagios.add(itemAdicionarEstagio);

        itemEditarEstagio.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        itemEditarEstagio.setText("Editar");
        menuEstagios.add(itemEditarEstagio);

        jMenuBar1.add(menuEstagios);

        menuRelatorios.setText("RELATÓRIOS");
        menuRelatorios.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N

        itemRelatorioAlunos.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        itemRelatorioAlunos.setText("Alunos");
        menuRelatorios.add(itemRelatorioAlunos);

        itemRelatorioEstagio.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        itemRelatorioEstagio.setText("Estágios");
        menuRelatorios.add(itemRelatorioEstagio);

        itemRelatorioEmpresas.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        itemRelatorioEmpresas.setText("Empresas");
        menuRelatorios.add(itemRelatorioEmpresas);

        itemRelatorioFuncionarios.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        itemRelatorioFuncionarios.setText("Funcionários");
        menuRelatorios.add(itemRelatorioFuncionarios);

        itemRelatorioFuncionarioEmp.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        itemRelatorioFuncionarioEmp.setText("Funcionários Empresa");
        menuRelatorios.add(itemRelatorioFuncionarioEmp);

        itemRelatorioProfOrient.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        itemRelatorioProfOrient.setText("Professores Orientadores");
        menuRelatorios.add(itemRelatorioProfOrient);

        jMenuBar1.add(menuRelatorios);

        menuAjuda.setText("AJUDA");
        menuAjuda.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N

        itemChamado.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        itemChamado.setText("Abrir Chamado");
        menuAjuda.add(itemChamado);

        jMenuBar1.add(menuAjuda);

        menuConfiguracoes.setText("CONFIGURAÇÕES");
        menuConfiguracoes.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N

        itemAlterarSenha.setFont(new java.awt.Font("Courier New", 0, 20)); // NOI18N
        itemAlterarSenha.setText("Alterar Senha");
        menuConfiguracoes.add(itemAlterarSenha);

        itemLogout.setFont(new java.awt.Font("Courier New", 3, 20)); // NOI18N
        itemLogout.setText("Logout");
        itemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLogoutActionPerformed(evt);
            }
        });
        menuConfiguracoes.add(itemLogout);

        jMenuBar1.add(menuConfiguracoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLogoutActionPerformed
        FormLogin l = new FormLogin();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemLogoutActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        FormLogin l = new FormLogin();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlunosActionPerformed
        FormAluno form = new FormAluno();
        form.setVisible(true);
    }//GEN-LAST:event_btAlunosActionPerformed

    private void btFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionariosActionPerformed
        FormFuncionario form = new FormFuncionario();
        form.setVisible(true);
    }//GEN-LAST:event_btFuncionariosActionPerformed

    private void btEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmpresasActionPerformed
        FormEmpresa form = new FormEmpresa();
        form.setVisible(true);
    }//GEN-LAST:event_btEmpresasActionPerformed

    private void btEstágiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEstágiosActionPerformed
        FormEstagio form = new FormEstagio();
        form.setVisible(true);
    }//GEN-LAST:event_btEstágiosActionPerformed

    private void btRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btRelatoriosActionPerformed

    private void btProfOrientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProfOrientActionPerformed
        FormProfOrient form = new FormProfOrient();
        form.setVisible(true);
    }//GEN-LAST:event_btProfOrientActionPerformed

    private void btFuncEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncEmpresaActionPerformed
        FormFuncionarioEmp form = new FormFuncionarioEmp();
        form.setVisible(true);
    }//GEN-LAST:event_btFuncEmpresaActionPerformed

    private void itemAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlunoActionPerformed
        FormAluno form = new FormAluno();
        form.setVisible(true);
    }//GEN-LAST:event_itemAlunoActionPerformed

    private void itemEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEmpresaActionPerformed
        FormEmpresa form = new FormEmpresa();
        form.setVisible(true);
    }//GEN-LAST:event_itemEmpresaActionPerformed

    private void itemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFuncionarioActionPerformed
        FormFuncionario form = new FormFuncionario();
        form.setVisible(true);
    }//GEN-LAST:event_itemFuncionarioActionPerformed

    private void itemFuncionarioEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFuncionarioEmpActionPerformed
       FormFuncionarioEmp form = new FormFuncionarioEmp();
       form.setVisible(true);
    }//GEN-LAST:event_itemFuncionarioEmpActionPerformed

    private void itemProfOrientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProfOrientActionPerformed
        FormProfOrient form = new FormProfOrient();
        form.setVisible(true);
    }//GEN-LAST:event_itemProfOrientActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {;
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlunos;
    private javax.swing.JButton btEmpresas;
    private javax.swing.JButton btEstágios;
    private javax.swing.JButton btFuncEmpresa;
    private javax.swing.JButton btFuncionarios;
    private javax.swing.JButton btProfOrient;
    private javax.swing.JButton btRelatorios;
    private javax.swing.JButton btSair;
    private javax.swing.JMenuItem itemAdicionarEstagio;
    private javax.swing.JMenuItem itemAlterarSenha;
    private javax.swing.JMenuItem itemAluno;
    private javax.swing.JMenuItem itemChamado;
    private javax.swing.JMenuItem itemEditarEstagio;
    private javax.swing.JMenuItem itemEmpresa;
    private javax.swing.JMenuItem itemFuncionario;
    private javax.swing.JMenuItem itemFuncionarioEmp;
    private javax.swing.JMenuItem itemLogout;
    private javax.swing.JMenuItem itemProfOrient;
    private javax.swing.JMenuItem itemRelatorioAlunos;
    private javax.swing.JMenuItem itemRelatorioEmpresas;
    private javax.swing.JMenuItem itemRelatorioEstagio;
    private javax.swing.JMenuItem itemRelatorioFuncionarioEmp;
    private javax.swing.JMenuItem itemRelatorioFuncionarios;
    private javax.swing.JMenuItem itemRelatorioProfOrient;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbNome;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuConfiguracoes;
    private javax.swing.JMenu menuEstagios;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
