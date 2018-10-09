package com.codecool.simpleSQLapplication.view;

import java.util.List;

public class MentorView {

    private List<String> mentors;

    public MentorView(List<String> mentors) {
        this.mentors = mentors;
    }

    public void MentorPrinter() {
        int counter = 0;
        for (String str : mentors) {
            counter+=1;
            System.out.println(counter + " " + str);
        }
    }
}
