package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.StudentDto;
import com.jsp.service.StudentService;

@WebServlet("/update_student_name")
public class UpdateStudentName extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Id = req.getParameter("id");
		int n = Integer.parseInt(Id);

		String name = req.getParameter("name");

		StudentService studentService = new StudentService();
		StudentDto student = studentService.getStudentById(n);
		if (student != null) {
			studentService.updateStudentNameById(n, name);
			RequestDispatcher rq = req.getRequestDispatcher("UpdateMessage.jsp");
			rq.forward(req, resp);
		} else {
			RequestDispatcher rq = req.getRequestDispatcher("Invalid.jsp");
			rq.forward(req, resp);
		}

	}

}
