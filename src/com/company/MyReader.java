package com.company;

import java.util.Scanner;

public class MyReader {

    private String input;
    Scanner sc = new Scanner(System.in);
    public void readUserInput() {
        System.out.print(">");
        setInput(sc.nextLine());
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
