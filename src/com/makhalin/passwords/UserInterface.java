package com.makhalin.passwords;

public interface UserInterface {

    int getPasswordLength();
    boolean useLowercase();
    boolean useUppercase();
    boolean useNumbers();
    boolean useSymbols();
    void displayPassword(String password);
}
