/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senac.sp.padoka.interfaces;

import br.senac.sp.padoka.dao.VendaDAO;
import br.senac.sp.padoka.model.Cliente;
import br.senac.sp.padoka.model.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nathan.ferreira
 */
public class TelaVendas extends javax.swing.JFrame {

    /**
     * Creates new form TelaVendas
     */
    Produto produto = new Produto();
    Cliente cliente = new Cliente();

    public TelaVendas() {
        initComponents();

        // SETA O TÍTULO DO JFRAME
        setTitle("Vendas");

        // FECHA SOMENTE O JFRAME ATUAL, AO INVÉS DO APP
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // SETA O FAVICON
        setIconImage(new ImageIcon(TelaVendas.class.getResource("/imagens/favicon.png")).getImage());
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
        txtIDProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaCarrinho = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        txtTotal = new javax.swing.JFormattedTextField();
        txtValorUnitario = new javax.swing.JFormattedTextField();
        btnRemover = new javax.swing.JButton();
        btnFinalizarCompra = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 220, 183));
        jPanel1.setMaximumSize(new java.awt.Dimension(450, 330));
        jPanel1.setMinimumSize(new java.awt.Dimension(450, 330));

        txtIDProduto.setMaximumSize(new java.awt.Dimension(310, 30));
        txtIDProduto.setMinimumSize(new java.awt.Dimension(310, 30));
        txtIDProduto.setPreferredSize(new java.awt.Dimension(310, 30));
        txtIDProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDProdutoFocusLost(evt);
            }
        });
        txtIDProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDProdutoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(94, 50, 8));
        jLabel5.setText("ID PRODUTO");

        txtNomeProduto.setEnabled(false);
        txtNomeProduto.setMaximumSize(new java.awt.Dimension(310, 30));
        txtNomeProduto.setMinimumSize(new java.awt.Dimension(310, 30));
        txtNomeProduto.setPreferredSize(new java.awt.Dimension(310, 30));
        txtNomeProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeProdutoFocusLost(evt);
            }
        });
        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(94, 50, 8));
        jLabel6.setText("NOME PRODUTO");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(94, 50, 8));
        jLabel7.setText("QUANTIADE");

        txtQuantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(94, 50, 8));
        jLabel8.setText("VALOR UNITÁRIO");

        tabelaCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "VALOR UNITÁRIO", "QUANTIDADE"
            }
        ));
        tabelaCarrinho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaCarrinho.setMaximumSize(new java.awt.Dimension(480, 430));
        jScrollPane4.setViewportView(tabelaCarrinho);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(94, 50, 8));
        jLabel9.setText("TOTAL");

        btnAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(94, 50, 8));
        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas.png"))); // NOI18N
        btnAdicionar.setText("ADICIONAR AO CARRINHO");
        btnAdicionar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdicionar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAdicionar.setMaximumSize(new java.awt.Dimension(110, 30));
        btnAdicionar.setMinimumSize(new java.awt.Dimension(110, 30));
        btnAdicionar.setPreferredSize(new java.awt.Dimension(110, 30));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        txtTotal.setEnabled(false);

        txtValorUnitario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤ #,##0.00"))));
        txtValorUnitario.setEnabled(false);
        txtValorUnitario.setPreferredSize(new java.awt.Dimension(310, 30));

        btnRemover.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemover.setForeground(new java.awt.Color(94, 50, 8));
        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas.png"))); // NOI18N
        btnRemover.setText("REMOVER DO CARRINHO");
        btnRemover.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRemover.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnRemover.setMaximumSize(new java.awt.Dimension(110, 30));
        btnRemover.setMinimumSize(new java.awt.Dimension(110, 30));
        btnRemover.setPreferredSize(new java.awt.Dimension(110, 30));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnFinalizarCompra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFinalizarCompra.setForeground(new java.awt.Color(94, 50, 8));
        btnFinalizarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas.png"))); // NOI18N
        btnFinalizarCompra.setText("FINALIZAR COMPRA");
        btnFinalizarCompra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFinalizarCompra.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnFinalizarCompra.setMaximumSize(new java.awt.Dimension(110, 30));
        btnFinalizarCompra.setMinimumSize(new java.awt.Dimension(110, 30));
        btnFinalizarCompra.setPreferredSize(new java.awt.Dimension(110, 30));
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(94, 50, 8));
        jLabel10.setText("ID CLIENTE");

        txtIDCliente.setMaximumSize(new java.awt.Dimension(310, 30));
        txtIDCliente.setMinimumSize(new java.awt.Dimension(310, 30));
        txtIDCliente.setPreferredSize(new java.awt.Dimension(310, 30));
        txtIDCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDClienteFocusLost(evt);
            }
        });
        txtIDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDClienteActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(94, 50, 8));
        jLabel11.setText("NOME CLIENTE");

        txtNomeCliente.setEnabled(false);
        txtNomeCliente.setMaximumSize(new java.awt.Dimension(310, 30));
        txtNomeCliente.setMinimumSize(new java.awt.Dimension(310, 30));
        txtNomeCliente.setPreferredSize(new java.awt.Dimension(310, 30));
        txtNomeCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeClienteFocusLost(evt);
            }
        });
        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(5, 5, 5)
                        .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(5, 5, 5)
                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(5, 5, 5)
                            .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(5, 5, 5)
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtValorUnitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDProdutoFocusLost
        VendaDAO venda = new VendaDAO();

        produto = venda.buscaProduto(Integer.parseInt(txtIDProduto.getText()));

        txtNomeProduto.setText(produto.getNome());
        txtValorUnitario.setText(String.valueOf(produto.getValor()));
    }//GEN-LAST:event_txtIDProdutoFocusLost

    private void txtIDProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDProdutoActionPerformed

    private void txtNomeProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeProdutoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoFocusLost

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private int getQuantidadeNoCarrinho(DefaultTableModel tabela, String idProduto) {
        int quantidade = 0;
        for (int i = 0; i < tabela.getRowCount(); i++) {
            String idNaTabela = tabela.getValueAt(i, 0).toString();
            if (idNaTabela.equals(idProduto)) {
                quantidade += Integer.parseInt(tabela.getValueAt(i, 3).toString());
            }
        }
        return quantidade;
    }

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) tabelaCarrinho.getModel();

        if (txtIDProduto.getText().isEmpty() || txtIDCliente.getText().isEmpty()) {
            btnAdicionar.disable();
            JOptionPane.showMessageDialog(rootPane, "Digite o ID do produto/cliente.");
        } else if (produto == null) {
            txtIDProduto.setText("");
            JOptionPane.showMessageDialog(rootPane, "Produto não encontrado!");
        } else {
            int quantidadeNova = (int) txtQuantidade.getValue();
            int quantidadeNoCarrinho = getQuantidadeNoCarrinho(tabela, txtIDProduto.getText());
            int quantidadeTotal = quantidadeNova + quantidadeNoCarrinho;

            if (produto.getEstoque() >= quantidadeTotal) {

                tabela.addRow(new Object[]{
                    txtIDProduto.getText(),
                    produto.getNome(),
                    produto.getValor(),
                    txtQuantidade.getValue()
                });

                double valorProduto = produto.getValor();
                int quantidade = (int) txtQuantidade.getValue();
                String textoAtual = txtTotal.getText();

                if (!textoAtual.isEmpty()) {
                    double valorAtual = Double.parseDouble(textoAtual);
                    double novoTotal = valorAtual + (valorProduto * quantidade);
                    txtTotal.setText(String.valueOf(novoTotal));
                } else {
                    double novoTotal = valorProduto * quantidade;
                    txtTotal.setText(String.valueOf(novoTotal));
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Não há " + produto.getNome().toLowerCase() + " suficiente em estoque!");
            }
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) tabelaCarrinho.getModel();
        int linhaSelecionada = tabelaCarrinho.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione um produto para remover do carrinho.");
        } else {
            tabela.removeRow(linhaSelecionada);

            Double valor = 0.0;

            for (int linha = 0; linha < tabela.getRowCount(); linha++) {
                valor += (Double) tabela.getValueAt(linha, 2);
            }

            txtTotal.setValue(valor);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) tabelaCarrinho.getModel();
        VendaDAO venda = new VendaDAO();

        List<Integer> idsProdutos = new ArrayList<>();
        List<Integer> quantidadesProdutos = new ArrayList<>();

        for (int i = 0; i < tabela.getRowCount(); i++) {
            idsProdutos.add(Integer.parseInt(tabela.getValueAt(i, 0).toString()));
            quantidadesProdutos.add(Integer.parseInt(tabela.getValueAt(i, 3).toString()));
        }

        double valorTotal = Double.parseDouble(txtTotal.getText());
        venda.realizaVenda(idsProdutos, valorTotal, quantidadesProdutos, Integer.parseInt(txtIDCliente.getText()));
        JOptionPane.showMessageDialog(rootPane, "Venda realizada com sucesso!");

        txtIDCliente.setText("");
        txtNomeCliente.setText("");
        txtIDProduto.setText("");
        txtNomeProduto.setText("");
        txtValorUnitario.setText("");
        txtTotal.setValue(0);
        tabela.setRowCount(0);
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

    private void txtIDClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDClienteFocusLost
        VendaDAO venda = new VendaDAO();

        cliente = venda.buscaCliente(Integer.parseInt(txtIDCliente.getText()));

        txtNomeCliente.setText(cliente.getNome());
    }//GEN-LAST:event_txtIDClienteFocusLost

    private void txtIDClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDClienteActionPerformed

    private void txtNomeClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeClienteFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeClienteFocusLost

    private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeClienteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVendas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabelaCarrinho;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtIDProduto;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JSpinner txtQuantidade;
    private javax.swing.JFormattedTextField txtTotal;
    private javax.swing.JFormattedTextField txtValorUnitario;
    // End of variables declaration//GEN-END:variables
}
