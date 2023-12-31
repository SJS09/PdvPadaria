/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senac.sp.padoka.interfaces.produto;

import br.senac.sp.padoka.model.Produto;
import br.senac.sp.padoka.dao.ProdutoDAO;
import br.senac.sp.padoka.model.Categoria;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author nathan.ferreira
 */
public class TelaCadastroProduto extends javax.swing.JFrame {

    private boolean tipoTela;

    public TelaCadastroProduto() {
        this.tipoTela = true;

        initComponents();

        carregarCategorias();

        // SETA O TÍTULO DO JFRAME
        setTitle("Cadastro de produtos");

        // FECHA SOMENTE O JFRAME ATUAL, AO INVÉS DO APP
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // SETA O FAVICON
        setIconImage(new ImageIcon(TelaCadastroProduto.class.getResource("/imagens/favicon.png")).getImage());
    }

    public TelaCadastroProduto(boolean edit) {
        this.tipoTela = false;

        initComponents();

        carregarCategorias();

        // SETA O TÍTULO
        setTitle("Editar produto");

        // ALTERA O TEXTO DO btnConfirmar
        btnConfirmar.setText("ATUALIZAR");

        // FECHA SOMENTE O JFRAME ATUAL, AO INVÉS DO APP
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // SETA O FAVICON
        setIconImage(new ImageIcon(TelaCadastroProduto.class.getResource("/imagens/favicon.png")).getImage());
    }

    private void carregarCategorias() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        List categorias = produtoDAO.getCategorias();
        for (Object c : categorias) {
            var categoria = (Categoria) c;
            txtCategoria.addItem(categoria.getNome());
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

        jPanel1 = new javax.swing.JPanel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JComboBox<>();
        txtUnidadeMedida = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 330));

        jPanel1.setBackground(new java.awt.Color(248, 220, 183));

        btnConfirmar.setBackground(new java.awt.Color(248, 220, 183));
        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(94, 50, 8));
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirmar.png"))); // NOI18N
        btnConfirmar.setText("CONFIRMAR");
        btnConfirmar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirmar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfirmar.setMaximumSize(new java.awt.Dimension(95, 55));
        btnConfirmar.setMinimumSize(new java.awt.Dimension(95, 55));
        btnConfirmar.setPreferredSize(new java.awt.Dimension(95, 55));
        btnConfirmar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(248, 220, 183));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(94, 50, 8));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setMaximumSize(new java.awt.Dimension(95, 55));
        btnCancelar.setMinimumSize(new java.awt.Dimension(95, 55));
        btnCancelar.setPreferredSize(new java.awt.Dimension(95, 55));
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtID.setEnabled(false);
        txtID.setMaximumSize(new java.awt.Dimension(310, 30));
        txtID.setMinimumSize(new java.awt.Dimension(310, 30));
        txtID.setPreferredSize(new java.awt.Dimension(310, 30));
        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDFocusLost(evt);
            }
        });
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(94, 50, 8));
        jLabel2.setText("ID");

        txtNome.setMaximumSize(new java.awt.Dimension(310, 30));
        txtNome.setMinimumSize(new java.awt.Dimension(310, 30));
        txtNome.setPreferredSize(new java.awt.Dimension(310, 30));
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(94, 50, 8));
        jLabel3.setText("NOME");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(94, 50, 8));
        jLabel4.setText("CATEGORIA");

        txtCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESCOLHA A CATEGORIA" }));

        txtUnidadeMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESCOLHA O TIPO", "KG", "G", "L", "ML" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(94, 50, 8));
        jLabel6.setText("UNIDADE DE MEDIDA");

        txtValor.setMaximumSize(new java.awt.Dimension(310, 30));
        txtValor.setMinimumSize(new java.awt.Dimension(310, 30));
        txtValor.setPreferredSize(new java.awt.Dimension(310, 30));
        txtValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorFocusLost(evt);
            }
        });
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(94, 50, 8));
        jLabel5.setText("ESTOQUE");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(94, 50, 8));
        jLabel7.setText("VALOR");

        txtEstoque.setMaximumSize(new java.awt.Dimension(310, 30));
        txtEstoque.setMinimumSize(new java.awt.Dimension(310, 30));
        txtEstoque.setPreferredSize(new java.awt.Dimension(310, 30));
        txtEstoque.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEstoqueFocusLost(evt);
            }
        });
        txtEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUnidadeMedida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
        txtID.setText(txtID.getText().toUpperCase());
    }//GEN-LAST:event_txtIDFocusLost

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        txtNome.setText(txtNome.getText().toUpperCase());
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorFocusLost

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        if (tipoTela) {
            // INSERINDO NA TABELA produtos
            Produto produto = new Produto();

            produto.setNome(txtNome.getText());
            if (txtCategoria.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Escolha uma categoria!");
                return;
            }

            if (txtUnidadeMedida.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Escolha um tipo!");
                return;
            }

            produto.setUnidade_de_medida((String) txtUnidadeMedida.getSelectedItem());
            produto.setCategoria(txtCategoria.getSelectedIndex());
            produto.setEstoque(Integer.parseInt(txtEstoque.getText()));
            produto.setValor(Double.parseDouble(txtValor.getText().replace(',', '.')));

            ProdutoDAO produtoDAO = new ProdutoDAO();
            produtoDAO.inserir(produto);

            JOptionPane.showMessageDialog(null, "Produto inserido com sucesso!");
            this.dispose();
        }

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtEstoqueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEstoqueFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstoqueFocusLost

    private void txtEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstoqueActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JComboBox<String> txtCategoria;
    public javax.swing.JTextField txtEstoque;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtNome;
    public javax.swing.JComboBox<String> txtUnidadeMedida;
    public javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
