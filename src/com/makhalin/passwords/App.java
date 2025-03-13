package com.makhalin.passwords;

public class App {
    public static void main(String[] args) {
        UserInterface ui = new TextBasedInterface();

        int length = ui.getPasswordLength();
        boolean userLowercase = ui.useLowercase();
        boolean userUppercase = ui.useUppercase();
        boolean useNumbers = ui.useNumbers();
        boolean useSymbols = ui.useSymbols();

        PasswordGenerator gen = new PasswordGenerator();
        String password = gen.generatePassword(length, userLowercase, userUppercase, useNumbers, useSymbols);
        ui.displayPassword(password);
    }
}
