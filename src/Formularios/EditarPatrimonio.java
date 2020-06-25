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

public class EditarPatrimonio extends javax.swing.JFrame {

    conectaBanco conecta = new conectaBanco();
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public EditarPatrimonio() {
        initComponents();
        conn = conecta.conexao();
        preencheTabela();
        comboBox();

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
        jButtonEditar = new javax.swing.JButton();
        jComboBoxId = new javax.swing.JComboBox<>();
        jTextFieldBuscaPatrimonio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

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
        jTablePatrimonio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePatrimonioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePatrimonio);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Patrimônio: ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Equipamento: ");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Local:");

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jComboBoxId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID" }));
        jComboBoxId.setEnabled(false);

        jTextFieldBuscaPatrimonio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscaPatrimonioKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Patrimônio a ser Buscado:");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jComboBoxId, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jButtonEditar))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldPatrimonio)
                            .addComponent(jTextFieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonBuscar)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldBuscaPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBuscaPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(jTextFieldLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar)
                    .addComponent(jComboBoxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Editar Patrimônio");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Buscar Patrimônio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        setSize(new java.awt.Dimension(712, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    
      private void preencheTabela() {
        String sql = "select * from armazenador";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTablePatrimonio.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no Preencher Tabela. Erro: " + ex);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch (Exception e){
                
            }
        }

    }
      
      private void comboBox(){
          String sql = "select * from armazenador ";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                jComboBoxId.addItem(rs.getString("id"));
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro na Combo Box. Erro: " + ex);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch (Exception e){
                
            }
        }
          
          
      }
    
    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        
        String sql = "update armazenador set "
        +"equipamento = '"+jTextFieldEquipamento.getText()+"',"
        +"patrimônio = '"+jTextFieldPatrimonio.getText()+"',"
        +"local = '"+jTextFieldLocal.getText()+"'"
        +"where id = "+jComboBoxId.getSelectedItem().toString();
            
        try {
        
            
            if(jTextFieldEquipamento.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo do Equipamento está vazio! Favor preenchê-lo");    
            }else if(jTextFieldPatrimonio.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo do Patrimônio está vazio! Favor preenchê-lo");
            }else if(jTextFieldLocal.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo do Local está vazio! Favor preenchê-lo");
            }else{        
            pst=conn.prepareStatement(sql);
            pst.execute();    
            JOptionPane.showMessageDialog(null, "O Equipamento foi editado com sucesso");
            preencheTabela();
            jTextFieldEquipamento.setText("");
            jTextFieldPatrimonio.setText("");
            jTextFieldLocal.setText("");
            jComboBoxId.getModel().setSelectedItem("");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na edição Erro: " +ex);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch (Exception e){
                
            }
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        String sql = "select * from armazenador where patrimônio = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextFieldBuscaPatrimonio.getText());
            rs = pst.executeQuery();
            
            if(rs.next()){         
                jTextFieldEquipamento.setText(rs.getString("equipamento"));               
                jTextFieldPatrimonio.setText(rs.getString("patrimônio"));                
                jTextFieldLocal.setText(rs.getString("local"));
                jComboBoxId.getModel().setSelectedItem(rs.getString("id"));
                
            }else{
                JOptionPane.showMessageDialog(null, "O equipamento buscado não está cadastrado");
                jTextFieldEquipamento.setText("");
                jTextFieldPatrimonio.setText("");
                jTextFieldLocal.setText("");
                jComboBoxId.getModel().setSelectedItem("");
            }
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "Erro na Busca. Erro:");
        }finally{
            try{
                rs.close();
                pst.close();
            }catch (Exception e){
                
            }
        }
        
        
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextFieldBuscaPatrimonioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscaPatrimonioKeyReleased
         String sql = "select * from armazenador where patrimônio = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextFieldBuscaPatrimonio.getText());
            rs = pst.executeQuery();
            
            if(rs.next()){         
                jTextFieldEquipamento.setText(rs.getString("equipamento"));               
                jTextFieldPatrimonio.setText(rs.getString("patrimônio"));                
                jTextFieldLocal.setText(rs.getString("local"));
                jComboBoxId.getModel().setSelectedItem(rs.getString("id"));
                
            }
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "Erro na Busca. Erro: " +ex);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch (Exception e){
                
            }
        }
        
    }//GEN-LAST:event_jTextFieldBuscaPatrimonioKeyReleased

    private void jTablePatrimonioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePatrimonioMouseClicked
      int linha = jTablePatrimonio.getSelectedRow();
      String selecao = jTablePatrimonio.getModel().getValueAt(linha, 3).toString();
      String sql = "select * from armazenador where id = "+selecao;
      try{
          pst = conn.prepareStatement(sql);
          rs = pst.executeQuery();
          if(rs.next()){
              jComboBoxId.setSelectedItem(rs.getString("id"));
              jTextFieldEquipamento.setText(rs.getString("equipamento"));
              jTextFieldPatrimonio.setText(rs.getString("patrimônio"));
              jTextFieldLocal.setText(rs.getString("local"));
              preencheTabela();
          }
      }catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Erro na tabela. Erro: " +ex); 
      }
    }//GEN-LAST:event_jTablePatrimonioMouseClicked

  
 

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarPatrimonio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPatrimonio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPatrimonio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPatrimonio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarPatrimonio().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JComboBox<String> jComboBoxId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePatrimonio;
    private javax.swing.JTextField jTextFieldBuscaPatrimonio;
    private javax.swing.JTextField jTextFieldEquipamento;
    private javax.swing.JTextField jTextFieldLocal;
    private javax.swing.JTextField jTextFieldPatrimonio;
    // End of variables declaration//GEN-END:variables
}
