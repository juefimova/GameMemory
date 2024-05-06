package com.example.game;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class ErrorController implements Initializable {
    @FXML
    private Text message;

    @FXML
    private Text title;

    public Text getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title.setText(title);
    }

    public Text getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message.setText(message);
    }

    @FXML
    private Button btnOK;

    public void btnOKClicked(MouseEvent mouseEvent) {
        message.getScene().getWindow().hide();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Context.getInstance().setErrorController(this);
    }
}
