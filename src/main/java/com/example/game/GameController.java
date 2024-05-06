package com.example.game;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class GameController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Button Btn1;
    @FXML
    private Button Btn2;
    @FXML
    private Button Btn3;
    @FXML
    private Button Btn4;
    @FXML
    private Button Btn5;
    @FXML
    private Button Btn6;
    @FXML
    private Button Btn7;
    @FXML
    private Button Btn8;
    @FXML
    private Button Btn9;
    @FXML
    private Button Btn10;
    @FXML
    private Button Btn11;
    @FXML
    private Button Btn12;


    Button[] btns;
    int count = 0;
    int r = 0;
    int i = 0;
    String a;
    String b;
    Button btn;
    Button btn1;

    public void initialize() {
        btns = new Button[]{Btn1, Btn2, Btn3, Btn4, Btn5, Btn6, Btn7, Btn8, Btn9, Btn10, Btn11, Btn12};
        Errors errors = new Errors();
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6));
        Collections.shuffle(list);


        int j = 0;

        for (Integer item : list) {
            btns[i].setOnAction(new EventHandler<ActionEvent>() {


                String c;

                @Override
                public void handle(ActionEvent actionEvent) {
                    ((Button) actionEvent.getSource()).setStyle("-fx-background-color:white");
                    c = ((Button) actionEvent.getSource()).getText();
                    System.out.println("c = " + c + "\n count  = " + count);
                    if (count == 0) {
                        btn = ((Button) actionEvent.getSource());
                        a = c;
                        count++;
                    } else if (count == 1) {
                        btn1 = ((Button) actionEvent.getSource());
                        btn1.setStyle("-fx-background-color:white");
                        b = c;
                        System.out.println("a = " + a + " b = " + b);
                        count = 0;
                        if (a.equals(b)) {
                            System.out.println("ура");
                            errors.setMessage("Correct :)");
                            errors.setTitle("Keep on going!");
                            errors.call();
                            r++;
                        } else {
                            errors.setMessage("You got mistaken :(");
                            errors.setTitle("Failure");
                            errors.call();

                            btn.setStyle("-fx-background-color:#6a93d4");
                            btn1.setStyle("-fx-background-color:#6a93d4");
                            //((Button) actionEvent.getSource()).setText("100");
                        }

                    }
                    if (r == 6) {
                        errors.setMessage("You won!!");
                        errors.setTitle("Victory");
                        errors.call();
                    }
                }

            });

            btns[i].setText(String.valueOf(item));
            i++;
        }

    }


    Errors errors = new Errors();

}