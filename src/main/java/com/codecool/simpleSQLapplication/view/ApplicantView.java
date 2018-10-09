package com.codecool.simpleSQLapplication.view;

import com.codecool.simpleSQLapplication.model.Applicant;

import java.util.List;

public class ApplicantView {
    private List<String> applicantInfo;
    private Applicant applicant;

    public ApplicantView(List<String> applicantInfo){
        this.applicantInfo = applicantInfo;
    }
    public ApplicantView(Applicant applicant){
        this.applicant = applicant;
    }
    public void fullNameAndTelephonePrinter(){
        String person = "";
        person += applicantInfo.get(0) + " " + applicantInfo.get(1);
        System.out.println(person);
    }
    public void applicantPrinter(){
        String info = applicant.getId() + " " + applicant.getName() + " " + applicant.getSurName() +
                " " + applicant.getPhoneNumber() + " " + applicant.geteMail() + " " + applicant.getApplicationCode();
        System.out.println(info);
    }
}
