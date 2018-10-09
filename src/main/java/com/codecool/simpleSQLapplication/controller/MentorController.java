package com.codecool.simpleSQLapplication.controller;

import com.codecool.simpleSQLapplication.dao.MentorDao;
import com.codecool.simpleSQLapplication.view.MentorView;

import java.util.List;

public class MentorController {

    private final MentorDao mentorDao = new MentorDao();


    public void getMentorNames() {
        List<String> mentors = mentorDao.getAll();
        MentorView mentorView = new MentorView(mentors);
        mentorView.MentorPrinter();
    }


    public void getMentorsFromMiskolc() {
        List<String> mentors = mentorDao.getMentorFromMiskolc();
        MentorView mentorView = new MentorView(mentors);
        mentorView.MentorPrinter();
    }

}
