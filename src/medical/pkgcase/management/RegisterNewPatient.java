/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.pkgcase.management;

/**
 *
 * @author pranali
 */
public class RegisterNewPatient extends javax.swing.JFrame {

    /**
     * Creates new form RegisterNewPatient
     */
    public RegisterNewPatient() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        maritalStatusGroup = new javax.swing.ButtonGroup();
        personalPanel = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        firstNameInput = new javax.swing.JTextField();
        lastNameInput = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        otherButton = new javax.swing.JRadioButton();
        phoneLabel = new javax.swing.JLabel();
        phoneInput = new javax.swing.JTextField();
        dobLabel = new javax.swing.JLabel();
        dobPicker = new org.jdesktop.swingx.JXDatePicker();
        maritalLabel = new javax.swing.JLabel();
        marriedButton = new javax.swing.JRadioButton();
        singleButton = new javax.swing.JRadioButton();
        occupationLabel = new javax.swing.JLabel();
        occupationInput = new javax.swing.JTextField();
        bloodGroupLabel = new javax.swing.JLabel();
        bloodGroupComboBox = new javax.swing.JComboBox<>();
        emailLabel = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressInput = new javax.swing.JTextArea();
        pastMedicalLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pastMedicalInput = new javax.swing.JTextArea();
        registerPatientButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        personalPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Personal Details"));

        firstNameLabel.setText("First Name:");

        lastNameLabel.setText("Last Name:");

        genderLabel.setText("Gender");

        genderGroup.add(maleButton);
        maleButton.setSelected(true);
        maleButton.setText("Male");
        maleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleButtonActionPerformed(evt);
            }
        });

        genderGroup.add(femaleButton);
        femaleButton.setText("Female");

        genderGroup.add(otherButton);
        otherButton.setText("Other");

        phoneLabel.setText("Phone");

        dobLabel.setText("DOB");

        maritalLabel.setText("Marital Status");

        maritalStatusGroup.add(marriedButton);
        marriedButton.setSelected(true);
        marriedButton.setText("Married");

        maritalStatusGroup.add(singleButton);
        singleButton.setText("Single");

        occupationLabel.setText("Occupation");

        bloodGroupLabel.setText("Blood Group");

        bloodGroupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        bloodGroupComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodGroupComboBoxActionPerformed(evt);
            }
        });

        emailLabel.setText("E-mail ID");

        addressLabel.setText("Address");

        addressInput.setColumns(20);
        addressInput.setRows(5);
        jScrollPane1.setViewportView(addressInput);

        pastMedicalLabel.setText("Past Medical");

        pastMedicalInput.setColumns(20);
        pastMedicalInput.setRows(5);
        jScrollPane2.setViewportView(pastMedicalInput);

        javax.swing.GroupLayout personalPanelLayout = new javax.swing.GroupLayout(personalPanel);
        personalPanel.setLayout(personalPanelLayout);
        personalPanelLayout.setHorizontalGroup(
            personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloodGroupLabel)
                    .addComponent(firstNameLabel)
                    .addComponent(genderLabel)
                    .addComponent(phoneLabel)
                    .addComponent(dobLabel)
                    .addComponent(maritalLabel)
                    .addComponent(occupationLabel)
                    .addComponent(emailLabel)
                    .addComponent(addressLabel)
                    .addComponent(pastMedicalLabel))
                .addGap(18, 18, 18)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personalPanelLayout.createSequentialGroup()
                        .addComponent(firstNameInput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameInput))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addGroup(personalPanelLayout.createSequentialGroup()
                        .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bloodGroupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dobPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(personalPanelLayout.createSequentialGroup()
                                .addComponent(maleButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(femaleButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(otherButton))
                            .addGroup(personalPanelLayout.createSequentialGroup()
                                .addComponent(marriedButton)
                                .addGap(18, 18, 18)
                                .addComponent(singleButton))
                            .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(emailInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(occupationInput, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(phoneInput, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        personalPanelLayout.setVerticalGroup(
            personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalPanelLayout.createSequentialGroup()
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(maleButton)
                    .addComponent(femaleButton)
                    .addComponent(otherButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLabel)
                    .addComponent(dobPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marriedButton)
                    .addComponent(singleButton)
                    .addComponent(maritalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(occupationLabel)
                    .addComponent(occupationInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodGroupLabel)
                    .addComponent(bloodGroupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pastMedicalLabel))
                .addGap(0, 40, Short.MAX_VALUE))
        );

        registerPatientButton.setText("Register");
        registerPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPatientButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(registerPatientButton)
                .addGap(167, 167, 167))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(personalPanel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(598, Short.MAX_VALUE)
                .addComponent(registerPatientButton)
                .addGap(21, 21, 21))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(personalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleButtonActionPerformed

    private void bloodGroupComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodGroupComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodGroupComboBoxActionPerformed

    private void registerPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerPatientButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_registerPatientButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterNewPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressInput;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JComboBox<String> bloodGroupComboBox;
    private javax.swing.JLabel bloodGroupLabel;
    private javax.swing.JLabel dobLabel;
    private org.jdesktop.swingx.JXDatePicker dobPicker;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JTextField firstNameInput;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameInput;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JLabel maritalLabel;
    private javax.swing.ButtonGroup maritalStatusGroup;
    private javax.swing.JRadioButton marriedButton;
    private javax.swing.JTextField occupationInput;
    private javax.swing.JLabel occupationLabel;
    private javax.swing.JRadioButton otherButton;
    private javax.swing.JTextArea pastMedicalInput;
    private javax.swing.JLabel pastMedicalLabel;
    private javax.swing.JPanel personalPanel;
    private javax.swing.JTextField phoneInput;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JButton registerPatientButton;
    private javax.swing.JRadioButton singleButton;
    // End of variables declaration//GEN-END:variables
}
