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

@WebServlet("/update_teacher_subject")
public class UpdateTeacherSubject extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String subject = req.getParameter("subject");

		TeacherServices teacherServices = new TeacherServices();
		TeacherDto teacher = teacherServices.getTeacherById(id);
		if (teacher != null) {
			teacherServices.updateTeacherPSubjectById(id, subject);
			RequestDispatcher rq = req.getRequestDispatcher("UpdateMessage.jsp");
			rq.forward(req, resp);
		} else {
			RequestDispatcher rq = req.getRequestDispatcher("Invalid.jsp");
			rq.forward(req, resp);
		}

	}

}
