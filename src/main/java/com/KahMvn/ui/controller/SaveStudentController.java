package com.KahMvn.ui.controller;

import com.KahMvn.biz.StudentService;
import com.KahMvn.ui.models.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/save-student.do")
public class SaveStudentController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String family = req.getParameter("family");
        String college = req.getParameter("college");
        Student student = new Student(name,family,college);
        StudentService service =new StudentService();
        service.save(student);
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req,resp);
    }
}
