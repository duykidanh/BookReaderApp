/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.panel;

import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import models.BookModel;
import models.DAO.BookDAO;
import other.SetDataToList;
import views.panels.AddChapterPanel;
import views.panels.BookEditPanel;
import views.panels.BookInforPanel;
import views.MainView;

/**
 *
 * @author ADMIN
 */
public class BookEditController {

    private BookEditPanel bookEditPanel;
    private MainView mainView;
    private BookModel currentBook;

    public BookEditController(BookEditPanel bookEditPanel, MainView mainView, BookModel book) throws SQLException {
        this.bookEditPanel = bookEditPanel;
        this.mainView = mainView;
        this.currentBook = book;

        initUI();

        this.bookEditPanel.onBtnAddChapter(e -> {
            AddChapter();
        });

        this.bookEditPanel.onBtnSave(e -> {
            Save();
        });
    }

    private void initUI() {
        BookDAO bookDAO = new BookDAO();
        List<String> categories = null;
        SetDataToList setData = new SetDataToList(mainView);
        StringBuilder cateString = new StringBuilder();
        String rating = "";

        try {
            categories = bookDAO.getCategoryList(this.currentBook.getId());
            rating = bookDAO.getRatingAverage(this.currentBook.getId());
            setData.setChapterList(this.bookEditPanel, this.bookEditPanel.getListChapter(), this.currentBook.getId());
            setData.setCommentList(this.bookEditPanel, this.bookEditPanel.getListComment(), this.currentBook.getId());
        } catch (SQLException ex) {
        }

        for (String s : categories) {
            cateString.append(s).append(", ");
        }
        
        cateString.setCharAt(cateString.lastIndexOf(","), ' ');
        
        this.bookEditPanel.getTxtName().setText(this.currentBook.getName());
        this.bookEditPanel.getTxtAuthor().setText(this.currentBook.getAuthor());
        this.bookEditPanel.getTxtDiscription().setText(this.currentBook.getDescription());
        this.bookEditPanel.getTxtCategorys().setText(cateString.toString());
        this.bookEditPanel.getTxtRate().setText(rating);
        
        JPanel panel = this.bookEditPanel.getListChapter();
        panel.setPreferredSize(new Dimension(0, panel.getComponentCount() * 40));
    }

    public void AddChapter() {
        AddChapterPanel chapterPanel = new AddChapterPanel();
        this.mainView.setMainPanel(chapterPanel);
    }

    public void Save() {

    }
}
