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

@WebServlet("/save_student")
public class SaveStudent extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		String number = req.getParameter("number");

		StudentDto studentDto = new StudentDto();
		StudentService studentService = new StudentService();

		studentDto.setName(name);
		studentDto.setDob(dob);
		studentDto.setCno(number);

		StudentDto student = studentService.saveStudent(studentDto);

		if (student != null) {
			RequestDispatcher rq = req.getRequestDispatcher("SaveMessage.jsp");
			rq.forward(req, resp);
		}

	}

}
