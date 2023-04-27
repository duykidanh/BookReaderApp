/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.panels;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import other.SetButton;

/**
 *
 * @author ADMIN
 */
public class BookInforPanel extends javax.swing.JPanel {

    private int currentID;

    /**
     * Creates new form BookInforPanel
     */
    public BookInforPanel() {
        initComponents();
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 sao", "2 sao", "3 sao", "4 sao", "5 sao" }));
        jComboBox1.setSelectedIndex(4);
        txtComment.setText("");
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);
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
        btnBack = new javax.swing.JLabel();
        imgCover = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRate = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiscription = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCategorys = new javax.swing.JLabel();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtView = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUpdate = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtReadRecently = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listChapter = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtComment = new javax.swing.JTextField();
        btnAddComment = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listComment = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1272, 825));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBack.setText("Back");
        btnBack.setOpaque(true);
        btnBack.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        imgCover.setBackground(new java.awt.Color(255, 255, 255));
        imgCover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.jpg"))); // NOI18N
        imgCover.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(imgCover, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, 250));

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtName.setText("Title");
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 6, 765, 33));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Author:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 51, 58, 34));

        txtAuthor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAuthor.setText("jLabel4");
        jPanel1.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 51, 247, 34));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Rating:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 51, 76, 34));

        txtRate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRate.setText("jLabel6");
        jPanel1.add(txtRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 51, 84, 34));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Description:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 138, 33));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        txtDiscription.setBackground(new java.awt.Color(255, 255, 255));
        txtDiscription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDiscription.setText("jLabel8");
        txtDiscription.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txtDiscription.setOpaque(true);
        jScrollPane1.setViewportView(txtDiscription);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 765, 69));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Categories:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 138, 94, 33));

        txtCategorys.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCategorys.setText("jLabel10");
        jPanel1.add(txtCategorys, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 138, 492, 33));

        btnFirst.setBackground(new java.awt.Color(240, 173, 78));
        btnFirst.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFirst.setForeground(new java.awt.Color(255, 255, 255));
        btnFirst.setText("First chapter");
        btnFirst.setPreferredSize(new java.awt.Dimension(160, 37));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel1.add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 210, -1));

        btnLast.setBackground(new java.awt.Color(240, 173, 78));
        btnLast.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLast.setForeground(new java.awt.Color(255, 255, 255));
        btnLast.setText("Last chapter");
        btnLast.setPreferredSize(new java.awt.Dimension(160, 37));
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel1.add(btnLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 210, -1));

        btnSave.setBackground(new java.awt.Color(240, 173, 78));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Add to library");
        btnSave.setPreferredSize(new java.awt.Dimension(170, 37));
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 210, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Views:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 76, 20));

        txtView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtView.setText("jLabel6");
        jPanel1.add(txtView, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 84, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Update date:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 91, 109, -1));

        txtUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUpdate.setText("jLabel6");
        jPanel1.add(txtUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 91, 84, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Read recently:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 117, 109, -1));

        txtReadRecently.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtReadRecently.setText("Bạn chưa đọc sách này");
        jPanel1.add(txtReadRecently, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 117, 170, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setBackground(new java.awt.Color(0, 153, 153));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Chapter list");
        jLabel12.setOpaque(true);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("");
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(52, 2));

        listChapter.setBackground(new java.awt.Color(255, 255, 255));
        listChapter.setLayout(new javax.swing.BoxLayout(listChapter, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2.setViewportView(listChapter);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Chapters", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setBackground(new java.awt.Color(0, 153, 153));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Comments");
        jLabel11.setOpaque(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        txtComment.setText("jTextField1");

        btnAddComment.setBackground(new java.awt.Color(240, 173, 78));
        btnAddComment.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddComment.setForeground(new java.awt.Color(255, 255, 255));
        btnAddComment.setText("Gửi");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel1.setText("Viết đánh giá của bạn");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtComment, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddComment)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddComment)
                    .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        listComment.setBackground(new java.awt.Color(255, 255, 255));
        listComment.setPreferredSize(new java.awt.Dimension(300, 500));
        listComment.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));
        jScrollPane4.setViewportView(listComment);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Comments", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLastActionPerformed

    public JButton getBtnFirst() {
        return btnFirst;
    }

    public JButton getBtnLast() {
        return btnLast;
    }

    public void setTxtName(String title) {
        txtName.setText(title);
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    public JPanel getListChapter() {
        return listChapter;
    }

    public void setListChapter(JPanel listChapter) {
        this.listChapter = listChapter;
    }

    public JPanel getListComment() {
        return listComment;
    }

    public JLabel getTxtAuthor() {
        return txtAuthor;
    }

    public JLabel getTxtCategorys() {
        return txtCategorys;
    }

    public JLabel getTxtDiscription() {
        return txtDiscription;
    }

    public JLabel getTxtName() {
        return txtName;
    }

    public JLabel getTxtRate() {
        return txtRate;
    }

    public JLabel getTxtView() {
        return txtView;
    }

    public JLabel getImgCover() {
        return imgCover;
    }

    public JTextField getTxtComment() {
        return txtComment;
    }

    public void setImgCover(JLabel imgCover) {
        this.imgCover = imgCover;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public JButton getBtnAddComment() {
        return btnAddComment;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getTxtUpdate() {
        return txtUpdate;
    }

    public JLabel getTxtReadRecently() {
        return txtReadRecently;
    }

    public JLabel getBtnBack() {
        return btnBack;
    }
    
    
    
    public void onBtnFirst(ActionListener action) {
        this.btnFirst.addActionListener(action);
    }

    public void onBtnLast(ActionListener action) {
        this.btnLast.addActionListener(action);
    }

    public void onBtnSave(ActionListener action) {
        this.btnSave.addActionListener(action);
    }
    
    public void onBtnAddComment(ActionListener action) {
        this.btnAddComment.addActionListener(action);
    }
    
    public void onBtnBack(MouseAdapter action) {
        this.btnBack.addMouseListener(new SetButton.SetLabelEffectB(btnBack));
        this.btnBack.addMouseListener(action);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddComment;
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel imgCover;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel listChapter;
    private javax.swing.JPanel listComment;
    private javax.swing.JLabel txtAuthor;
    private javax.swing.JLabel txtCategorys;
    private javax.swing.JTextField txtComment;
    private javax.swing.JLabel txtDiscription;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtRate;
    private javax.swing.JLabel txtReadRecently;
    private javax.swing.JLabel txtUpdate;
    private javax.swing.JLabel txtView;
    // End of variables declaration//GEN-END:variables
}
