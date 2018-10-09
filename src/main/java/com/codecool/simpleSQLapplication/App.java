package com.codecool.simpleSQLapplication;

import com.codecool.simpleSQLapplication.controller.Handle;
import com.codecool.simpleSQLapplication.view.MenuView;
import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        menu();
    }
    private static void menu() {
        MenuView printer = new MenuView();
        Scanner userInput = new Scanner(System.in);
        while (true) {
            printer.displayMenu();
            if (userInput.hasNext()) {
                    String input = userInput.nextLine();
                int answer = Integer.parseInt(input);
                Handle handler = new Handle(answer);
                handler.handleQuery();
            }
        }
    }

}

