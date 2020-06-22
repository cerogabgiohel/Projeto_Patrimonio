package Formularios;

import utilitarios.conectaBanco;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import net.proteanit.sql.DbUtils;
// @author Gabriel

public class PesquisarPatrimonio extends javax.swing.JFrame {

    conectaBanco conecta = new conectaBanco();
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public PesquisarPatrimonio() {
        initComponents();
        conn = conecta.conexao();
        preencheTabela();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePatrimonio = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEquipamento = new javax.swing.JTextField();
        jTextFieldPatrimonio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldLocal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jRadioButtonEquipamento = new javax.swing.JRadioButton();
        jRadioButtonPatrimonio = new javax.swing.JRadioButton();
        jRadioButtonLocal = new javax.swing.JRadioButton();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTablePatrimonio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTablePatrimonio);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Patrimônio: ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Equipamento: ");

        jTextFieldEquipamento.setEnabled(false);

        jTextFieldPatrimonio.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Local:");

        jTextFieldLocal.setEnabled(false);

        jButton1.setText("Buscar");

        jRadioButtonEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEquipamentoActionPerformed(evt);
            }
        });

        jRadioButtonPatrimonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPatrimonioActionPerformed(evt);
            }
        });

        jRadioButtonLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonLocalActionPerformed(evt);
            }
        });

        jButtonPrimeiro.setText("Ir para o Primeiro");
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });

        jButtonAnterior.setText("Ir para o Anterior");

        jButtonProximo.setText("Ir para o Próximo");

        jButtonUltimo.setText("Ir para o último");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonPrimeiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonProximo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonUltimo)
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButtonPatrimonio)
                            .addComponent(jRadioButtonLocal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldPatrimonio)
                                .addComponent(jTextFieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonEquipamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButtonEquipamento)
                    .addComponent(jTextFieldEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonPatrimonio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonLocal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrimeiro)
                    .addComponent(jButtonAnterior)
                    .addComponent(jButtonProximo)
                    .addComponent(jButtonUltimo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Pesquisar Patrimônio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        setSize(new java.awt.Dimension(535, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEquipamentoActionPerformed
        if (jRadioButtonEquipamento.isSelected()) {
            jTextFieldEquipamento.setEnabled(true);
            jRadioButtonPatrimonio.setEnabled(false);
            jRadioButtonLocal.setEnabled(false);
        } else {
            jTextFieldEquipamento.setEnabled(false);
            jRadioButtonPatrimonio.setEnabled(true);
            jRadioButtonLocal.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonEquipamentoActionPerformed

    private void jRadioButtonPatrimonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPatrimonioActionPerformed
        if (jRadioButtonPatrimonio.isSelected()) {
            jTextFieldPatrimonio.setEnabled(true);
            jRadioButtonLocal.setEnabled(false);
            jRadioButtonEquipamento.setEnabled(false);
        } else {
            jTextFieldPatrimonio.setEnabled(false);
            jRadioButtonLocal.setEnabled(true);
            jRadioButtonEquipamento.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonPatrimonioActionPerformed

    private void jRadioButtonLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonLocalActionPerformed
        if (jRadioButtonLocal.isSelected()) {
            jTextFieldLocal.setEnabled(true);
            jRadioButtonEquipamento.setEnabled(false);
            jRadioButtonPatrimonio.setEnabled(false);
        } else {
            jTextFieldLocal.setEnabled(false);
            jRadioButtonEquipamento.setEnabled(true);
            jRadioButtonPatrimonio.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonLocalActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        try {

            jTextFieldEquipamento.setEnabled(true);
            jTextFieldPatrimonio.setEnabled(true);
            jTextFieldLocal.setEnabled(true);
            String sql = "select * from armazenador";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            rs.next();
           
            jTextFieldEquipamento.setText(conecta.rs.getString("equipamento"));
            jTextFieldLocal.setText(conecta.rs.getString("local"));
            jTextFieldPatrimonio.setText(conecta.rs.getString("patrimônio"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar dados!\nERRO: " + ex);
        } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar dados!\nERRO: " + e);
        }


    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        try {
            jTextFieldEquipamento.setEnabled(true);
            jTextFieldPatrimonio.setEnabled(true);
            jTextFieldLocal.setEnabled(true);
            conecta.executaSQL("select * from armazenador");
            conecta.rs.last();
            jTextFieldEquipamento.setText(conecta.rs.getString("equipamento"));
            jTextFieldLocal.setText(conecta.rs.getString("local"));
            jTextFieldPatrimonio.setText(conecta.rs.getString("patrimônio"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar dados!\nERRO: " + ex);
        } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar dados!\nERRO: " + e);
        }
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void preencheTabela() {
        String sql = "select * from armazenador";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTablePatrimonio.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no Preencher Tabela\nErro: " + ex);
        }

    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PesquisarPatrimonio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarPatrimonio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarPatrimonio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarPatrimonio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarPatrimonio().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonEquipamento;
    private javax.swing.JRadioButton jRadioButtonLocal;
    private javax.swing.JRadioButton jRadioButtonPatrimonio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePatrimonio;
    private javax.swing.JTextField jTextFieldEquipamento;
    private javax.swing.JTextField jTextFieldLocal;
    private javax.swing.JTextField jTextFieldPatrimonio;
    // End of variables declaration//GEN-END:variables
}
