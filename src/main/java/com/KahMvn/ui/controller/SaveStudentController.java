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
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String family = req.getParameter("family");
        String college = req.getParameter("college");

        if (name.equalsIgnoreCase("")) {
//            req.getRequestDispatcher("/WEB-INF/register.jsp").forward(req, resp);
            req.setAttribute("validationMsg", "name is req");
            System.out.println("required");
        }  if (family.equalsIgnoreCase("")) {
//            req.getRequestDispatcher("/WEB-INF/register.jsp").forward(req, resp);
            req.setAttribute("validationMsg", req.getAttribute("validationMsg")+"<br/> family is req");
            System.out.println("required");
        }  if (college.equalsIgnoreCase("")) {
            //req.getRequestDispatcher("/WEB-INF/register.jsp").forward(req, resp);
            req.setAttribute("validationMsg", req.getAttribute("validationMsg")+"<br/> college is req");
            System.out.println("required");
        if(req.getAttribute("validationMsg")!=""){
            req.getRequestDispatcher("/WEB-INF/register.jsp").forward(req,resp);
        }
        } else {

            Student student = new Student(name, family, college);
            StudentService service = new StudentService();
            try {
                if (id.equalsIgnoreCase("")) {
                    service.save(student);
                } else {
                    student.setId(id);
                    service.edit(student);
                }

                resp.sendRedirect(req.getContextPath() + "/index.jsp");
            } catch (Exception e) {
                e.printStackTrace();
                resp.sendRedirect(req.getContextPath() + "error.jsp");
            }
        }

    }
}
