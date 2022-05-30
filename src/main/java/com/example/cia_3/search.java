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
    private TableView<search1> table; // fx:id of Table

    @FXML
    private TableColumn<search1, String> trainno; // fx:id of column Time

    @FXML
    private TableColumn<search1, String> trainname; // fx:id of column Route

    @FXML
    private TableColumn<search1, String> depstation; // fx:id of column Aircraft

    @FXML
    private TableColumn<search1, String> arrivalstation; // fx:id of column Type

    @FXML
    private TableColumn<search1, String> deptime; // fx:id of column Type

    @FXML
    private TableColumn<search1, String> arrivaltime; // fx:id of column Type

    @FXML
    private TableColumn<search1, String> days
            ; // fx:id of column Type




    public void distancetable(ActionEvent event){ //

        ObservableList<search1> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB =  DBconnect.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM trains_india");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new search1(Result.getString("TRAIN_NO"),
                        Result.getString("TRAIN_NAME"),
                        Result.getString("DES_STATION"),
                        Result.getString("ARRIVAL_STATION"),
                        Result.getString("DEP_TIME"),
                        Result.getString("ARRIVAL_TIME"),
                        Result.getString("DAYS")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        trainno.setCellValueFactory(new PropertyValueFactory<>("TRAIN_NO"));
        trainname.setCellValueFactory(new PropertyValueFactory<>("TRAIN_NAME"));
        depstation.setCellValueFactory(new PropertyValueFactory<>("DEP_STATION"));
        arrivalstation.setCellValueFactory(new PropertyValueFactory<>("ARRIVAL_STATION"));
        deptime.setCellValueFactory(new PropertyValueFactory<>("DEP_TIME"));
        arrivaltime.setCellValueFactory(new PropertyValueFactory<>("ARRIVAL_TIME"));
        days.setCellValueFactory(new PropertyValueFactory<>("DAYS"));




        table.setItems(oblist);


    }
}
