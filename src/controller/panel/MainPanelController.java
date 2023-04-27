/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.panel;

import controller.item.ButtonViewController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.BookModel;
import other.SetDataToList;
import views.panels.AllBookPanel;
import views.panels.MainPanel;
import views.MainView;
import views.items.ButtonItem;
import views.panels.SearchPanel;

/**
 *
 * @author ADMIN
 */
public class MainPanelController {

    private MainPanel mainPanel;
    private MainView mainView;
    private ArrayList<BookModel> bookModels;

    public MainPanelController(MainPanel mainPanel, MainView mainView) {
        this.mainPanel = mainPanel;
        this.mainView = mainView;
        //this.bookModels = bookModels;
        SetDataToList setData = new SetDataToList(this.mainView);

        // Xác định thêm vào panel nào
        setData.setTop5View(this.mainPanel.getListTopView(), "view", this.mainPanel);
        setData.setTop5View(this.mainPanel.getListNewUpdate(), "recently", this.mainPanel);

        this.mainPanel.onBtnMore(e -> {
            try {
                changeMorePanel();
            } catch (SQLException ex) {
                Logger.getLogger(MainPanelController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        this.mainPanel.onBtnSearch(e -> {
            handleSearchButtonClicked();

        });
    }

    // Xem thêm button
    public void changeMorePanel() throws SQLException {
        this.mainView.remove(this.mainPanel);
        AllBookPanel allBookPanel = new AllBookPanel();
        new AllBookController(allBookPanel, mainView, this.mainPanel);
        this.mainView.setMainPanel(allBookPanel);
        this.mainView.revalidate();
        this.mainView.repaint();
    }

    public void handleSearchButtonClicked() {
        String title = this.mainPanel.getTxtKeyWords().getText();
        SearchPanel searchPanel = new SearchPanel(title);
        new SearchController(searchPanel, mainView);
        this.mainView.setMainPanel(searchPanel);
    }

}
