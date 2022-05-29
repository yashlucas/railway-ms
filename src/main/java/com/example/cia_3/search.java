package com.example.cia_3;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class search {

    @FXML
    private TableView<search1> searchtable; // fx:id of Table

    @FXML
    private TableColumn<search1, String> ap_TRAIN_NO; // fx:id of column Time

    @FXML
    private TableColumn<search1, String> ap_TRAIN_NAME; // fx:id of column Route

    @FXML
    private TableColumn<search1, String> ap_DEP_STATION; // fx:id of column Aircraft

    @FXML
    private TableColumn<search1, String> ap_ARRIVAL_STATION; // fx:id of column Type

    @FXML
    private TableColumn<search1, String> ap_DEP_TIME; // fx:id of column Type

    @FXML
    private TableColumn<search1, String> ap_ARRIVAL_TIME; // fx:id of column Type

    @FXML
    private TableColumn<search1, String> ap_DAYS; // fx:id of column Type




    public void distancetable(ActionEvent event){ // method for Bangalore Airport option

        ObservableList<search1> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DBconnect.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM RAILWAY.TRAIN_DETAILS");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new search1(Result.getString("TRAIN_NO"),
                        Result.getString("TRAIN_NAME"),
                        Result.getString("DEP_STATION"),
                        Result.getString("ARRIVAL_STATION"),
                        Result.getString("DEP_TIME"),
                        Result.getString("ARRIVAL_TIME"),
                        Result.getString("DAYS")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        ap_TRAIN_NO.setCellValueFactory(new PropertyValueFactory<>("TRAIN_NO"));
        ap_TRAIN_NAME.setCellValueFactory(new PropertyValueFactory<>("TRAIN_NAME"));
        ap_DEP_STATION.setCellValueFactory(new PropertyValueFactory<>("DEP_STATION"));
        ap_ARRIVAL_STATION.setCellValueFactory(new PropertyValueFactory<>("ARRIVAL_STATION"));
        ap_DEP_TIME.setCellValueFactory(new PropertyValueFactory<>("DEP_TIME"));
        ap_ARRIVAL_TIME.setCellValueFactory(new PropertyValueFactory<>("ARRIVAL_TIME"));
        ap_DAYS.setCellValueFactory(new PropertyValueFactory<>("DAYS"));




        searchtable.setItems(oblist);


    }
}
