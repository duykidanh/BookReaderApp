/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.panels;

import java.awt.Component;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.ChapterModel;
import models.DAO.ChapterDAO;
import views.MainView;

/**
 *
 * @author ADMIN
 */
public class ReadingPanel extends javax.swing.JPanel {

    private ChapterModel currentChapter;
    private int currentBookID;

    /**
     * Creates new form ReadingPanel
     */
    public ReadingPanel() {
        initComponents();
        this.handleClicked();
    }

    public ReadingPanel(MainView view) {
        initComponents();

    }

    public void handleClicked() {
        btnPrevious.addActionListener(e -> {
            try {
                this.setChapterDetails(ChapterDAO.getInstance().getPreivousNextChapter(currentChapter, "previous"));
            } catch (SQLException ex) {
                Logger.getLogger(ReadingPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        });
        btnNext.addActionListener(e -> {
            try {
                this.setChapterDetails(ChapterDAO.getInstance().getPreivousNextChapter(currentChapter, "next"));
            } catch (SQLException ex) {
                Logger.getLogger(ReadingPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        boxChapter.addActionListener(e -> {
            int selectedItem = boxChapter.getSelectedIndex();
            String selectedString = (String) boxChapter.getSelectedItem();
            try {
                ChapterModel selectedChapter = ChapterDAO.getInstance().getSelectedChapter(currentBookID, selectedItem + 1);
                this.setChapterDetails(selectedChapter);
                boxChapter.setSelectedItem(selectedString);
                boxChapter.repaint();

            } catch (SQLException ex) {
                Logger.getLogger(ReadingPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

    }

    public void setChapterDetails(ChapterModel chapter) throws SQLException {
        this.currentChapter = chapter;
        this.currentBookID = chapter.getBook_id();
        jTextArea1.setText(chapter.getDocument());
        ArrayList<ChapterModel> listChapter = ChapterDAO.getInstance().getAllChapterFromBook(currentBookID);
        ArrayList<String> listChapterName = new ArrayList<>();
        for (ChapterModel c : listChapter) {
            listChapterName.add("Chương " + c.getSerial() + ": " + c.getTitle());
        }
        boxChapter.setModel(new javax.swing.DefaultComboBoxModel<>(listChapterName.toArray(new String[0])));

    }

    public ChapterModel getChapterModel() {
        return this.currentChapter;
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
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        boxChapter = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnPrevious.setBackground(new java.awt.Color(204, 0, 51));
        btnPrevious.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevious.setText("Chương trước");

        btnNext.setBackground(new java.awt.Color(204, 0, 51));
        btnNext.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Chương tiếp");

        boxChapter.setMaximumRowCount(5);
        boxChapter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrevious)
                .addGap(330, 330, 330)
                .addComponent(boxChapter, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                .addComponent(btnNext)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNext)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPrevious)
                        .addComponent(boxChapter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxChapter;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
