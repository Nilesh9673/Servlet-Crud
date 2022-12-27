package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.StaffDto;
import com.jsp.service.StaffService;

@WebServlet("/getstaffbyid")
public class GetStaffById extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("Id"));
		StaffService staffService = new StaffService();
		StaffDto staff = staffService.getStaffById(id);
		if (staff != null) {
			PrintWriter printWriter = resp.getWriter();
			printWriter.print("<html><body><h1>" + staff.getId() + "<br>" + staff.getName() + "<br>" + staff.getJd()
					+ "</h1></body></html>");

		} else {
			RequestDispatcher rd = req.getRequestDispatcher("/Invalid.jsp");
			rd.forward(req, resp);
		}
	}
}
