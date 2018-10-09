package com.codecool.simpleSQLapplication.dao;

import com.google.common.collect.Lists;
import java.sql.*;
import java.util.List;

public class MentorDao implements DAO{
    ConnectionProvider con = new ConnectionProvider();

    public List<String > getAll() {
        Connection connection = con.getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.execute("SELECT first_name, last_name FROM mentors;");
            ResultSet resultSet = statement.getResultSet();
            List<String> mentors = Lists.newArrayList();
            while(resultSet.next()) {
                String name = resultSet.getString(1);
                String surName = resultSet.getString(2);
                mentors.add(name + " " + surName);
            }
            return mentors;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public List<String> getMentorFromMiskolc() {
        Connection connection = con.getConnection();
        try {
            Statement statement = connection.createStatement();
            String str = "SELECT nick_name FROM mentors WHERE city LIKE 'Miskolc';";
            statement.execute(str);
            ResultSet resultSet = statement.getResultSet();
            List<String> mentors = Lists.newArrayList();

            while(resultSet.next()) {
                String nickName = resultSet.getString(1);
                mentors.add(nickName);
            }
            System.out.println(mentors.size());
            return mentors;

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
}