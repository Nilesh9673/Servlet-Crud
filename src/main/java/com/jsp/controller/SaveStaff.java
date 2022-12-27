package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.StaffDto;
import com.jsp.service.StaffService;

@WebServlet("/save_staff")
public class SaveStaff extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String job = req.getParameter("job");

		StaffDto staffDto = new StaffDto();
		staffDto.setName(name);
		staffDto.setJd(job);

		StaffService staffService = new StaffService();
		StaffDto staff = staffService.saveStudent(staffDto);
		if (staff != null) {
			RequestDispatcher rq = req.getRequestDispatcher("SaveMessage.jsp");
			rq.forward(req, resp);
		}
	}

}
