package com.codecool.simpleSQLapplication.controller;

import com.codecool.simpleSQLapplication.model.Applicant;

public class Handle {
    int answer;
    private MentorController mentorController;
    private ApplicantController applicantController;
    public Handle(int answer){
        mentorController = new MentorController();
        applicantController = new ApplicantController();
        this.answer = answer;
    }


    public void handleQuery(){
        switch (answer) {
            case 1:
                mentorController.getMentorNames();
                break;
            case 2:
                mentorController.getMentorsFromMiskolc();
                break;
            case 3:
                applicantController.getApplicantFullNameAndTelephpneByName("Carol");
                break;
            case 4:
                applicantController.getApplicantFullNameAndTelephoneByEmail("@adipiscingenimmi.edu");
            break;
            case 5:
                applicantController.insertApplicant(new Applicant("Markus", "Schaffarzyk", "003620/725-2666", "djnovus@groovecoverage.com", 54823));
                break;
            case 6:
                applicantController.updateApplicantTelephoneByName("Jemima","Foreman", "003670/223-7459");
                break;
            case 7:
                applicantController.deleteApplicantsByEmail("mauriseu.net");
                break;
        }
        }
    }