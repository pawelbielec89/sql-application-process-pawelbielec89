package com.codecool.simpleSQLapplication;

import com.codecool.simpleSQLapplication.controller.Query;
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
//                try {
                    String input = userInput.nextLine();
//                } catch (wyjatek ex){
//
//                }
                int answer = Integer.parseInt(input);
                Query query = new Query(answer);
                query.handleQuery();
            }
        }
    }

}

