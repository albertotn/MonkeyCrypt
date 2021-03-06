/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;
import alcollectors.MoCr_SettingsAL;
/**
 *
 * @author Jonas
 */
public class MoCr_Frame_Settings extends javax.swing.JFrame {
   
    MoCr_SettingsAL myAL;
    
    public MoCr_Frame_Settings(MoCr_Frame f) {
        initComponents();
        myAL = new MoCr_SettingsAL(f, this);
        MoCr_SettingsFrame_ResetButton.addActionListener(myAL);
        MoCr_SettingsFrame_Validation.addActionListener(myAL);
        MoCr_SettingsFrame_Colourbox.addActionListener(myAL);
    }
    
    public void renewalRoutine(String in) {
        MoCr_SettingsFrame_AlphabetField.setText(in);
        MoCr_SettingsFrame_ClearBox.setSelectedIndex(0);
    }

    public boolean isCheckboxSelected() {
        return MoCr_SettingsFrame_Checkbox.isSelected();
    }
    
    public String getAlphabetInput() {
        return MoCr_SettingsFrame_AlphabetField.getText();
    }
    
    public void setStandardAlphabet() {
        MoCr_SettingsFrame_AlphabetField.setText("abcdefghijklmnopqrstuvwxyz");
    }
    
    public int getClearBoxIndex() {
        return MoCr_SettingsFrame_ClearBox.getSelectedIndex();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MoCr_SettingsFrame_Heading1 = new javax.swing.JLabel();
        MoCr_SettingsFrame_AlphabetField = new javax.swing.JTextField();
        MoCr_SettingsFrame_Checkbox = new javax.swing.JCheckBox();
        MoCr_SettingsFrame_Validation = new javax.swing.JButton();
        MoCr_SettingsFrame_ResetButton = new javax.swing.JButton();
        MoCr_SettingsFrame_ClearBox = new javax.swing.JComboBox<>();
        MoCr_SettingsFrame_Colourbox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Einstellungen");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        MoCr_SettingsFrame_Heading1.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        MoCr_SettingsFrame_Heading1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MoCr_SettingsFrame_Heading1.setText("Alphabet ändern");

        MoCr_SettingsFrame_AlphabetField.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        MoCr_SettingsFrame_AlphabetField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        MoCr_SettingsFrame_Checkbox.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        MoCr_SettingsFrame_Checkbox.setText("Vergrößerbarkeit des Hauptfensters aktiviert");

        MoCr_SettingsFrame_Validation.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        MoCr_SettingsFrame_Validation.setText("Änderungen speichern");

        MoCr_SettingsFrame_ResetButton.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        MoCr_SettingsFrame_ResetButton.setText("Standardalphabet wiederherstellen");

        MoCr_SettingsFrame_ClearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kein Feld leeren", "Alle Felder leeren", "Lokale Felder leeren", "Alle Schlüsselfelder leeren", "Ein- und Ausgabefelder leeren" }));

        MoCr_SettingsFrame_Colourbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blau", "Grün", "Gelb", "Rosa" }));

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 12)); // NOI18N
        jLabel1.setText("Fensterfarbe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MoCr_SettingsFrame_Heading1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MoCr_SettingsFrame_AlphabetField)
                    .addComponent(MoCr_SettingsFrame_ResetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MoCr_SettingsFrame_Checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MoCr_SettingsFrame_Colourbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MoCr_SettingsFrame_ClearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(MoCr_SettingsFrame_Validation, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoCr_SettingsFrame_Heading1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MoCr_SettingsFrame_AlphabetField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoCr_SettingsFrame_ResetButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MoCr_SettingsFrame_Checkbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(MoCr_SettingsFrame_Colourbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MoCr_SettingsFrame_ClearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MoCr_SettingsFrame_Validation)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MoCr_SettingsFrame_AlphabetField;
    private javax.swing.JCheckBox MoCr_SettingsFrame_Checkbox;
    private javax.swing.JComboBox<String> MoCr_SettingsFrame_ClearBox;
    public javax.swing.JComboBox<String> MoCr_SettingsFrame_Colourbox;
    private javax.swing.JLabel MoCr_SettingsFrame_Heading1;
    public javax.swing.JButton MoCr_SettingsFrame_ResetButton;
    public javax.swing.JButton MoCr_SettingsFrame_Validation;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
