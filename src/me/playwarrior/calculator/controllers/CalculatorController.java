package me.playwarrior.calculator.controllers;

/*
    Created By Robin Egberts On 6/11/2020
    Copyrighted By OrbitMines ©2020
*/

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import me.playwarrior.calculator.Main;
import me.playwarrior.calculator.utils.Method;

public class CalculatorController {

    public Button addition;
    public Button substraction;
    public Button multiplication;
    public Button division;
    public TextArea num1;
    public TextArea num2;
    public Text answer;
    public Text method;
    public Button calculate;
    public Text error;
    public Button history;

    private void updateMethod(Method method) {
        Main.setMethod(method);
        this.method.setText(method.getCharacter());
    }

    private void calculate() {
        String num1 = this.num1.getText(), num2 = this.num2.getText();

        if (Main.isNotNullOrEmpty(num1) && Main.isNotNullOrEmpty(num2)) {

            int num3 = Main.parseInt(num1);
            int num4 = Main.parseInt(num2);

            if (num3 != -1 && num4 != -1) {

                double answer = Main.calculate(num3, num4, Main.getCurrentMethod().getCharacter());

                this.answer.setText(String.valueOf(answer));
            } else {
                error.setText("Numbers cannot be letters or other tokens");
            }
        } else {
            error.setText("No number(s) are entered in!");
        }
    }


    @FXML
    public void initialize() {
        //button handlers
        addition.addEventHandler(MouseEvent.MOUSE_CLICKED, (event) -> updateMethod(Method.ADDITION));
        substraction.addEventHandler(MouseEvent.MOUSE_CLICKED, (event) -> updateMethod(Method.SUBTRACTION));
        division.addEventHandler(MouseEvent.MOUSE_CLICKED, (event) -> updateMethod(Method.DIVISION));
        multiplication.addEventHandler(MouseEvent.MOUSE_CLICKED, (event) -> updateMethod(Method.MULTIPLICATION));
        calculate.addEventHandler(MouseEvent.MOUSE_CLICKED, (event) -> calculate());
        history.addEventHandler(MouseEvent.MOUSE_CLICKED, (event) -> Main.history());
    }
}
