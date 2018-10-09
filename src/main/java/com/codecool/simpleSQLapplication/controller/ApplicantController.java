package com.codecool.simpleSQLapplication.controller;

import com.codecool.simpleSQLapplication.dao.ApplicantDao;
import com.codecool.simpleSQLapplication.model.Applicant;
import com.codecool.simpleSQLapplication.view.ApplicantView;

import java.util.List;

public class ApplicantController {
    private final ApplicantDao dao = new ApplicantDao();

    public void getApplicantFullNameAndTelephpneByName(String name) {
        List<String> carol = dao.getApplicantByName(name);
        ApplicantView applicantView = new ApplicantView(carol);
        applicantView.fullNameAndTelephonePrinter();
    }

    public void getApplicantFullNameAndTelephoneByEmail(String email){
        List<String> applicant = dao.getApplicantByEmail(email);
        ApplicantView applicantView = new ApplicantView(applicant);
        applicantView.fullNameAndTelephonePrinter();
    }

    public void insertApplicant(Applicant applicant){
        dao.insertRecord(applicant);
        ApplicantView applicantView = new ApplicantView(applicant);
        applicantView.applicantPrinter();
    }

    public void updateApplicantTelephoneByName(String name, String surname, String telephone){
        Applicant applicant = dao.getApplicantByFullName(name, surname,telephone);
        ApplicantView applicantView = new ApplicantView(applicant);
        applicantView.applicantPrinter();
    }

    public void deleteApplicantsByEmail(String email){
        dao.deleteRecordsByEmail(email);
    }
}
