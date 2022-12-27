package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.TeacherDto;
import com.jsp.service.TeacherServices;

@WebServlet("/save_teacher")
public class SaveTeacher extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String Password = req.getParameter("password");
		String subject = req.getParameter("subject");

		TeacherDto teacherDto = new TeacherDto();
		teacherDto.setName(name);
		teacherDto.setEmail(email);
		teacherDto.setPassword(Password);
		teacherDto.setSubject(subject);

		TeacherServices teacherServices = new TeacherServices();

		TeacherDto teacher = teacherServices.saveTeacher(teacherDto);
		if (teacher != null) {
			RequestDispatcher rq = req.getRequestDispatcher("SaveMessage.jsp");
			rq.forward(req, resp);
		}
	}

}
