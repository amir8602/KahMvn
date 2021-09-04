package com.KahMvn.ui.controller;

import com.KahMvn.biz.StudentService;
import com.KahMvn.ui.models.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/st-edit.do")
public class EditStudentController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sid = req.getParameter("id");
        Integer id = Integer.parseInt(sid);
        StudentService service = new StudentService();
        try {
            Student student = service.findById(id);
            req.setAttribute("student",student);
            req.getRequestDispatcher("/register.do").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
