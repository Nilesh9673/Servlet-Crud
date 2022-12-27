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

@WebServlet("/delete_student")
public class DeleteStudent extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("Id"));

		StudentService studentService = new StudentService();
		StudentDto student = studentService.getStudentById(id);
		if (student != null) {
			studentService.deleteStudent(id);
			RequestDispatcher rq = req.getRequestDispatcher("DeleteMessage.jsp");
			rq.forward(req, resp);
		} else {
			RequestDispatcher rq = req.getRequestDispatcher("Invalid.jsp");
			rq.forward(req, resp);
		}

	}
}
