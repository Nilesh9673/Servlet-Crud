package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.StudentDto;
import com.jsp.service.StudentService;

@WebServlet("/getstudentbyid")
public class GetStudentById extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("Id"));

		StudentService studentService = new StudentService();
		StudentDto student = studentService.getStudentById(id);

		if (student != null) {
			PrintWriter printWriter = resp.getWriter();
			printWriter.print("<html><body><h1>" + student.getId() + "  <br> " + student.getName() + "  <br> "
					+ student.getDob() + "   <br> " + student.getCno() + "</h1></body></html>");
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("/Invalid.jsp");
			rd.forward(req, resp);
		}
	}

}
