/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import control.Sgbd;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Provider;

/**
 *
 * @author ld_si
 */
public class InsertProviderUI extends javax.swing.JFrame {

    /**
     * Creates new form InsertUI
     */
    public MainUI mainUI;
    public Provider provider;
    private static ArrayList<Provider> providers;
    public String option;

    public InsertProviderUI() {
        this.provider = new Provider();
        initComponents();
    }

    public InsertProviderUI(MainUI mainUI, String option) {
        this.mainUI = mainUI;
        this.option = option;
        this.provider = new Provider();
        initComponents();
    }

    public InsertProviderUI(MainUI mainUI, String option, ArrayList providers, int i) {
        this.mainUI = mainUI;
        this.option = option;
        this.provider = (Provider) providers.get(i);
        InsertProviderUI.providers = providers;
        initComponents();
        jButtonDelete.setVisible(true);
        setFormData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelName = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabelDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAdress = new javax.swing.JTextArea();
        jTextFieldCnpj = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar fornecedor");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelName.setText("Nome");

        jLabelPrice.setText("CNPJ");

        jLabelDescription.setText("Endereço");

        jTextAreaAdress.setColumns(20);
        jTextAreaAdress.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAdress);

        jButtonSave.setText("Salvar");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonClear.setText("Limpar");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Deletar");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelDescription)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSave))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelName)
                            .addComponent(jLabelPrice))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrice)
                    .addComponent(jTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabelDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonClear)
                    .addComponent(jButtonDelete))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        if (!isValidData()) {
            return;
        }
        try {
            setProvider();
            if (option.equals("edit")) {
                int index = 0;
                for (int i = 0; i < providers.size(); i++) {
                    if (providers.get(i).getCnpj().equals(provider.getCnpj())) {
                        index = i;
                        providers.set(index, provider);
                        break;
                    }
                }
                Sgbd.deleteData(Sgbd.DIRPROVIDER);
                for (int i = 0; i < providers.size(); i++) {
                    Sgbd.writeProvider(providers.get(i));
                }
            } else {
                providers = Sgbd.readProvider();
                int duplicated = 0;
                for (int i = 0; i < providers.size(); i++) {
                    if (providers.get(i).getCnpj().equals(provider.getCnpj())) {
                        duplicated++;
                    }
                }
                if (duplicated >= 1) {
                    jTextFieldCnpj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                    JOptionPane.showMessageDialog(rootPane, "CNPJ já cadastrado", "Alerta", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                jTextFieldCnpj.setBorder(javax.swing.BorderFactory.createEmptyBorder());
                Sgbd.writeProvider(provider);
            }

            if (Sgbd.notExist(Sgbd.DIRPROVIDER)) {
                mainUI.populaTabelaProvider(provider);
            } else {
                mainUI.populaTabelaProvider();
            }
            mainUI.setEnabled(true);
            JOptionPane.showMessageDialog(rootPane, "Fornecedor cadastrado com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (IOException ex) {
            System.out.println("Erro na inserção");
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed
    
    public boolean isValidData() {
        try {
            Integer.parseInt(jTextFieldCnpj.getText());
            jTextFieldCnpj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Somente números no CNPJ", "Alerta", JOptionPane.WARNING_MESSAGE);
            jTextFieldCnpj.setText("");
            jTextFieldCnpj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            return false;
        }
        return true;
    }
    
    private void setProvider() {
        provider.setName(jTextFieldName.getText());
        provider.setCnpj(jTextFieldCnpj.getText());
        provider.setAdress(jTextAreaAdress.getText());
    }

    private void setFormData() {
        jTextFieldName.setText(provider.getName());
        jTextFieldCnpj.setText(provider.getCnpj());
        jTextAreaAdress.setText(provider.getAdress());
    }

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jTextFieldCnpj.setText("");
        jTextFieldName.setText("");
        jTextAreaAdress.setText("");
    }//GEN-LAST:event_jButtonClearActionPerformed


    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        mainUI.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane,
                "Deseja realmente excluir?", "Confirmação",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            setProvider();

            int index = 0;
            for (int i = 0; i < providers.size(); i++) {
                if (providers.get(i).getCnpj().equals(provider.getCnpj())) {
                    index = i;
                    providers.remove(index);
                    break;
                }
            }

            if (providers.isEmpty()) {
                Sgbd.deleteData(Sgbd.DIRPROVIDER);
                DefaultTableModel dtm = (DefaultTableModel) mainUI.jTable.getModel();
                dtm.removeRow(index);
            } else {
                Sgbd.deleteData(Sgbd.DIRPROVIDER);
                for (int i = 0; i < providers.size(); i++) {
                    Sgbd.writeProvider(providers.get(i));
                }
                mainUI.populaTabelaProvider();
            }

            mainUI.setEnabled(true);
            JOptionPane.showMessageDialog(rootPane, "Fornecedor deletado com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (IOException ex) {
            System.out.println("Erro na remoção");
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(InsertProviderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertProviderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertProviderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertProviderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertProviderUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAdress;
    private javax.swing.JTextField jTextFieldCnpj;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}