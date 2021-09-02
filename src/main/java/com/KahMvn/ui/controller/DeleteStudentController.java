package com.KahMvn.ui.controller;

import com.KahMvn.biz.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/st-delete.do")
public class DeleteStudentController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sid = req.getParameter("id");
        Integer id = Integer.parseInt(sid);
        StudentService service = new StudentService();
        try {
            service.delete(id);
            resp.sendRedirect("/list.do");
        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect("/error.do");
        }


    }
}
