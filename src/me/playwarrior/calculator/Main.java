package me.playwarrior.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import me.playwarrior.calculator.utils.Method;

public class Main extends Application {

    private static Method currentMethod = Method.ADDITION;

    private static String[] history = new String[20];

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("gui/Calculator.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void setMethod(Method method) {
        currentMethod = method;
    }

    public static Method getCurrentMethod() {
        return currentMethod;
    }

    /*
    * Opdracht 1:
    *
    * Deze gaat wat onderzoekvaardigheden van jou nodig hebben.
    * De methode gaat checken of een string leeg is of niet bestaat.
    * */

    public static boolean isNotNullOrEmpty(String num) {
        return false;
    }

    /*
    *
    * Opdracht 2:
    * Probeer de geven String te converteren naar een Integer
    * Als de geven String geen nummer is dan return je -1!
    *
    * */
    public static int parseInt(String num) {
        return -1;
    }

    /*
    *
    * Opdracht 3a:
    *
    * Deze method gaat de berekening doen tussen de twee ingevoerde getallen!
    * Probeer doormiddel van method uit te vogelen hoe de twee getallen met
    * elkaar berekent moeten worden
    *
    * method: "+", "-", "/", "*"
    *
    * Opdracht 3b:
    *
    * Doormiddel van de Array ga je de history van de calculaties op slaan (Alleen de laatste twintig)
    * */
    public static double calculate(int num1, int num2, String method) {
        return -1;
    }

    /*
    *
    * Opdracht 4:
    * Print de history van de calculaties in het console!
    * Print alleen de calculaties! geen lege strings
    * */
    public static void history() {

    }
}
