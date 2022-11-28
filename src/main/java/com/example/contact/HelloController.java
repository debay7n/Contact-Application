package com.example.contact;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;



public class HelloController {
    myContact contactList;
    @FXML

    TextField searchname;
    @FXML
    TextField neww;
    @FXML
    TextField number;

    public void search(MouseEvent event) throws Exception {
        contactList = new myContact();
        contactList.deserializeMap();
        System.out.println("not found");
        if (searchname.textProperty().get().equals("")){
            Alert warning = new Alert(Alert.AlertType.WARNING);
            warning.setHeaderText("ALERT");
            warning.setContentText("PLEASE ENTER A NAME");
            warning.showAndWait();
        }
        else if(contactList.getCntList().containsKey(searchname.textProperty().get())){
            Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
            infoAlert.setHeaderText("SEARCHING");
            infoAlert.setContentText(contactList.getCntList().get(searchname.textProperty().get()));
            infoAlert.showAndWait();
        }
        else {
            Alert warning = new Alert(Alert.AlertType.WARNING);
            warning.setHeaderText("NOT FOUND");
            warning.setContentText("ADD THIS NUMBER TO THE LIST");
            warning.showAndWait();
        }
    }
    @FXML

    public void add(MouseEvent event) throws Exception {
        contactList = new myContact();
        contactList.deserializeMap();
        System.out.println("not found");
        if (neww.textProperty().get().equals("")){
            Alert warning = new Alert((Alert.AlertType.WARNING));
            warning.setHeaderText("ALERT");
            warning.setContentText("Please enter a NAME");
            warning.showAndWait();
            System.out.println("not found");
        }

        else if(number.textProperty().get().equals("")) {
            Alert warning = new Alert(Alert.AlertType.WARNING);
            warning.setHeaderText("ALERT");
            warning.setContentText("PLEASE ENTER A NUMBER");
            warning.showAndWait();
        }
        else {
            Alert infoAlert = new Alert(Alert.AlertType.CONFIRMATION);
            infoAlert.setHeaderText("New contact adding");
            contactList.addContact(neww.textProperty().get(), number.textProperty().get());
            contactList.serializeMap();
            infoAlert.setContentText("NEW CONTACT ADDED");
            infoAlert.showAndWait();
        }
    }
    }



    