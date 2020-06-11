package me.playwarrior.calculator.utils;

/*
    Created By Robin Egberts On 6/11/2020
    Copyrighted By OrbitMines ©2020
*/
public enum Method {

    SUBTRACTION("-"),
    ADDITION("+"),
    MULTIPLICATION("*"),
    DIVISION("/");

    private String character;

    Method(String character) {
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }
}
