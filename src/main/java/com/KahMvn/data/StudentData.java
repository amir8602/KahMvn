package com.KahMvn.data;

import com.KahMvn.ui.models.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentData {
    public void save (Student student) throws Exception{


            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kahmvn","root","1995");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO stn (name, family, college) VALUES (?,?,?)");
            preparedStatement.setString(1,student.getName());
            preparedStatement.setString(2,student.getFamily());
            preparedStatement.setString(3,student.getCollege());
            preparedStatement.executeUpdate();


    }
}
