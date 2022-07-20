package com.example.scrap;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController implements Initializable {


    @FXML
    private Label lbl1;
    @FXML
    Button btn1;
    @FXML
    Button btn2;

    public void here() {
        lbl1.setText("achieved");
    }

    public void initilize()
    {
        btn1.setOnAction(event -> lbl1.setText("Bingo"));

        btn2.setOnMouseClicked(mouseEvent -> lbl1.setText("Bingo2"));

        //btn1.setOnAction(event -> {lbl1.setText("Bingo")});//
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initilize();
    }
}
