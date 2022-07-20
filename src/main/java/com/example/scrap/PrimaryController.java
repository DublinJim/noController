package com.example.scrap;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController implements Initializable {


    @FXML
    private Label lbl1;
    @FXML
    Button btn1;

    public void here(ActionEvent event) {
        lbl1.setText("achieved");
    }

    public void initilize()
    {
        btn1.setOnAction(event -> {
            lbl1.setText("Bingo");
        });
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initilize();
    }
}
