package com.codecool.simpleSQLapplication.dao;

import com.codecool.simpleSQLapplication.App;
import com.google.common.collect.Lists;
import com.codecool.simpleSQLapplication.model.Applicant;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ApplicantDao implements DAO {
   ConnectionProvider con = new ConnectionProvider();
   public List<String> getApplicantByName(String applicantName) {
      Connection connection = con.getConnection();
       List<String> applicant = new ArrayList<>();
       try {
         Statement statement = connection.createStatement();
         statement.execute("SELECT (first_name || ' ' || last_name) AS full_name, telephone_number FROM applicants WHERE first_name = '" + applicantName + "' ;");
         ResultSet resultSet = statement.getResultSet();
         while(resultSet.next()) {
            String fullName = resultSet.getString(1);
            String telephoneNumer = resultSet.getString(2);
             applicant = Lists.newArrayList(fullName,telephoneNumer);
         }
           return applicant;
      } catch (SQLException e) {
         e.printStackTrace();
         throw new RuntimeException();
      }
   }


    public Applicant getApplicantByFullName(String name, String surname, String telephone) {
        Connection connection = con.getConnection();
        Applicant updateApplicant = new Applicant();
        try {
            Statement statement = connection.createStatement();
            statement.execute("UPDATE applicants SET telephone_number = '" + telephone + "' WHERE first_name = '" + name + "' AND last_name = '" + surname + "';");
            statement.execute("SELECT * FROM applicants WHERE first_name = '" + name + "' AND last_name ='" + surname + "';");
            ResultSet resultSet = statement.getResultSet();
            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String telephoneNumer = resultSet.getString("telephone_number");
                String email = resultSet.getString("email");
                int applicationcode = resultSet.getInt("application_code");
                updateApplicant.setId(id);
                updateApplicant.setName(firstName);
                updateApplicant.setSurName(lastName);
                updateApplicant.setPhoneNumber(telephoneNumer);
                updateApplicant.seteMail(email);
                updateApplicant.setApplicationCode(applicationcode);
            }
            return updateApplicant;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
    public List<String> getApplicantByEmail(String applicantEmail) {
        Connection connection = con.getConnection();
        List<String> applicant = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            statement.execute("SELECT (first_name || ' ' || last_name) AS full_name, telephone_number FROM applicants WHERE email LIKE '%" + applicantEmail + "' ;");
            ResultSet resultSet = statement.getResultSet();
            while(resultSet.next()) {
                String fullName = resultSet.getString(1);
                String telephoneNumer = resultSet.getString(2);
                applicant = Lists.newArrayList(fullName,telephoneNumer);
            }
            return applicant;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }



    @Override
    public void addRecord() {

    }

    @Override
    public void updateRecord() {

    }

    @Override
    public void deleteRecord() {

    }

    public Applicant insertRecord(Applicant applicant) {
        Connection connection = con.getConnection();
        Applicant updateApplicant = new Applicant();
        try {
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO applicants (first_name,last_name,telephone_number,email,application_code)" +
                    " VALUES ('" + applicant.getName() + "','" + applicant.getSurName() + "','" + applicant.getPhoneNumber() + "','"
                     + applicant.geteMail() + "','" + applicant.getApplicationCode() + "');");
            statement.execute("SELECT * FROM applicants WHERE application_code = '" + applicant.getApplicationCode() +"';");
            ResultSet resultSet = statement.getResultSet();
            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String telephoneNumer = resultSet.getString("telephone_number");
                String email = resultSet.getString("email");
                int applicationcode = resultSet.getInt("application_code");
                updateApplicant.setId(id);
                updateApplicant.setName(firstName);
                updateApplicant.setSurName(lastName);
                updateApplicant.setPhoneNumber(telephoneNumer);
                updateApplicant.seteMail(email);
                updateApplicant.setApplicationCode(applicationcode);
            }
            return updateApplicant;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public void deleteRecordsByEmail(String email){
        Connection connection = con.getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM applicants WHERE email LIKE '%" + email + "';");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}