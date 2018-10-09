package com.codecool.simpleSQLapplication.view;

public class MenuView {
    private String[] menu = new String[8];

    public MenuView(){
        menu[0] = "Choose option:";
        menu[1] = "[1] Show 2 name columns of the mentors table.";
        menu[2] = "[2] Show nick_name-s of all mentors working at Miskolc.";
        menu[3] = "[3] Show full name and telephone number of applicant named Carol";
        menu[4] = "[4] Show full name and telephone number of applicant with email ending with - @adipiscingenimmi.edu";
        menu[5] = "[5] Insert data for student applicant and show his data in database";
        menu[6] = "[6] Update phone number of applicant Jemima Foreman to 003670/223-7459 and show it";
        menu[7] = "[7] Delete all applicants, who applied with emails for this domain - mauriseu.net";
    }
    public void displayMenu(){
        for (int x=0; x<menu.length; x++)
        {
            System.out.println(menu[x]);
        }

    }
}
