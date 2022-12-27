package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.TeacherDto;
import com.jsp.service.TeacherServices;

@WebServlet("/getteacherbyid")
public class GetTeacherById extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("Id"));
		TeacherServices teacherServices = new TeacherServices();
		TeacherDto teacher = teacherServices.getTeacherById(id);
		if (teacher != null) {
			PrintWriter printWriter = resp.getWriter();
			printWriter.print("<html><body><h1>" + teacher.getId() + " <br>  " + teacher.getName() + "  <br> "
					+ teacher.getEmail() + " <br>  " + teacher.getSubject() + "</h1></body></html>");
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("/Invalid.jsp");
			rd.forward(req, resp);
		}
	}
}
