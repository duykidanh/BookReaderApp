/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.panels;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import models.UserModel;

public class InforPanel extends javax.swing.JPanel {
    public InforPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        passwordConfirm = new javax.swing.JLabel();
        passwordConfirmErrorMessage = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();
        phoneNumberInput = new javax.swing.JTextField();
        userNameInput = new javax.swing.JTextField();
        photo = new javax.swing.JLabel();
        passwordErrorMessage = new javax.swing.JLabel();
        passwordConfirmInput = new javax.swing.JPasswordField();
        imageHolder = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        phoneNumberErrorMessage = new javax.swing.JLabel();
        userNameErrorMessage = new javax.swing.JLabel();
        chooseFileBtn = new javax.swing.JButton();
        phoneNumber = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        photoErrorMessage = new javax.swing.JLabel();
        showPasswordBtn = new javax.swing.JCheckBox();
        showPasswordConfirmBtn = new javax.swing.JCheckBox();
        btnEdit = new javax.swing.JButton();
        btnUndo = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));
        setPreferredSize(new java.awt.Dimension(1013, 698));

        jLabel1.setBackground(new java.awt.Color(204, 0, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN TÀI KHOẢN");
        jLabel1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        passwordConfirm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordConfirm.setText("Xác nhận mật khẩu");

        passwordConfirmErrorMessage.setForeground(new java.awt.Color(255, 0, 51));

        passwordInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordInput.setForeground(new java.awt.Color(0, 0, 0));
        passwordInput.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        phoneNumberInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phoneNumberInput.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        userNameInput.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        userNameInput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        userNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameInputActionPerformed(evt);
            }
        });

        photo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo.setText("Avatar");

        passwordErrorMessage.setForeground(new java.awt.Color(255, 0, 51));

        passwordConfirmInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordConfirmInput.setForeground(new java.awt.Color(0, 0, 0));

        imageHolder.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        imageHolder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageHolder.setText("photo");
        imageHolder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password.setText("Mật khẩu");

        phoneNumberErrorMessage.setForeground(new java.awt.Color(255, 0, 51));

        userNameErrorMessage.setForeground(new java.awt.Color(255, 0, 51));

        chooseFileBtn.setText("Chọn file");
        chooseFileBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        phoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phoneNumber.setText("Số điện thoại");

        userName.setBackground(new java.awt.Color(204, 0, 51));
        userName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userName.setText("Tên đăng nhập");

        photoErrorMessage.setForeground(new java.awt.Color(255, 0, 51));

        showPasswordBtn.setText("Hiển thị mật khẩu");

        showPasswordConfirmBtn.setText("Hiển thị mật khẩu");

        btnEdit.setText("Chỉnh sửa");

        btnUndo.setText("Hủy");

        btnSave.setText("Lưu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUndo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(showPasswordBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(passwordConfirmErrorMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(showPasswordConfirmBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                                        .addComponent(passwordConfirmInput, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(userNameInput, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(userName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(phoneNumberInput, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(phoneNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                                .addComponent(userNameErrorMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(phoneNumberErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(photoErrorMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imageHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(chooseFileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userName)
                    .addComponent(photo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imageHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(chooseFileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(photoErrorMessage))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(userNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userNameErrorMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneNumber)
                        .addGap(4, 4, 4)
                        .addComponent(phoneNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneNumberErrorMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showPasswordBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordErrorMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordConfirm)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(passwordConfirmInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPasswordConfirmBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordConfirmErrorMessage)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnUndo)
                    .addComponent(btnSave))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 201, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameInputActionPerformed
    
    public JButton getChooseFileBtn() {
        return chooseFileBtn;
    }

    public JLabel getImageHolder() {
        return imageHolder;
    }

    public JLabel getPasswordConfirm() {
        return passwordConfirm;
    }

    public JLabel getPasswordConfirmErrorMessage() {
        return passwordConfirmErrorMessage;
    }

    public JLabel getPasswordErrorMessage() {
        return passwordErrorMessage;
    }

    public JLabel getPhoneNumberErrorMessage() {
        return phoneNumberErrorMessage;
    }

    public JLabel getPhoto() {
        return photo;
    }

    public JLabel getPhotoErrorMessage() {
        return photoErrorMessage;
    }

    public JCheckBox getShowPasswordBtn() {
        return showPasswordBtn;
    }

    public JCheckBox getShowPasswordConfirmBtn() {
        return showPasswordConfirmBtn;
    }

    public JLabel getUserNameErrorMessage() {
        return userNameErrorMessage;
    }

    public JPasswordField getPasswordConfirmInput() {
        return passwordConfirmInput;
    }

    public JPasswordField getPasswordInput() {
        return passwordInput;
    }

    public JTextField getPhoneNumberInput() {
        return phoneNumberInput;
    }

    public JTextField getUserNameInput() {
        return userNameInput;
    }
    
    public void onChooseFile(ActionListener action) {
        this.chooseFileBtn.addActionListener(action);
    }
    
    public void onShowPassword(ActionListener action) {
        this.showPasswordBtn.addActionListener(action);
    }
        
    public void onShowPasswordConfirm(ActionListener action) {
        this.showPasswordConfirmBtn.addActionListener(action);
    }
    
    public void onEditBtnClick(ActionListener action){
        this.btnEdit.addActionListener(action);
    }
    
    public void onSaveBtnClick(ActionListener action){
        this.btnSave.addActionListener(action);
    }
    
    public void onCancelBtnClick(ActionListener action) {
        this.btnUndo.addActionListener(action);
    }

    public JButton getBtnEdit() {
        return btnEdit;
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    public JButton getBtnUndo() {
        return btnUndo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUndo;
    private javax.swing.JButton chooseFileBtn;
    private javax.swing.JLabel imageHolder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel password;
    private javax.swing.JLabel passwordConfirm;
    private javax.swing.JLabel passwordConfirmErrorMessage;
    private javax.swing.JPasswordField passwordConfirmInput;
    private javax.swing.JLabel passwordErrorMessage;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JLabel phoneNumberErrorMessage;
    private javax.swing.JTextField phoneNumberInput;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel photoErrorMessage;
    private javax.swing.JCheckBox showPasswordBtn;
    private javax.swing.JCheckBox showPasswordConfirmBtn;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel userNameErrorMessage;
    private javax.swing.JTextField userNameInput;
    // End of variables declaration//GEN-END:variables
}
