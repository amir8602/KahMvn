package com.KahMvn.data;

import com.KahMvn.ui.models.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentData {
    public void save(Student student) throws Exception {


        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kahmvn", "root", "1995");
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO stn (name, family, college) VALUES (?,?,?)");
        preparedStatement.setString(1, student.getName());
        preparedStatement.setString(2, student.getFamily());
        preparedStatement.setString(3, student.getCollege());
        preparedStatement.executeUpdate();


    }

    public List<Student> getAll() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kahmvn", "root", "1995");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM stn");
        List<Student> students = new ArrayList<>();
        while (resultSet.next()) {
            Student student = new Student(resultSet.getString(1),resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
            students.add(student);
        }
        return students;

    }

    public void delete(Integer id)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kahmvn", "root", "1995");
        PreparedStatement ps = connection.prepareStatement("DELETE FROM stn where idstn=?");
        ps.setInt(1,id);
        ps.executeUpdate();



    }

}
