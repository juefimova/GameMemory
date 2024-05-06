package com.example.game;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Errors {
    String message;
    String title;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    ErrorController errorController;
    boolean flag = true;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void call() {
        Stage stage = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Error.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 300, 200);
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage.setMaxWidth(300);
        stage.setMaxHeight(200);
        stage.setMinWidth(300);
        stage.setMinHeight(200);
        stage.setScene(scene);
        stage.setTitle(this.title);
        stage.show();
        errorController = Context.getInstance().getErrorController();
        errorController.setMessage(this.message);
        flag = false;
    }


}
