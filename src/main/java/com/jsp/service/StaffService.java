package com.jsp.service;

import java.util.List;

import com.jsp.dao.StaffDao;
import com.jsp.dto.StaffDto;
import com.jsp.dto.StudentDto;

public class StaffService {
	StaffDao staffDao = new StaffDao();

	// save Student
	public StaffDto saveStudent(StaffDto staff) {
		return staffDao.saveStaff(staff);
	}

	// delete Staff
	public StaffDto deleteStaff(int id) {
		return staffDao.deleteStaff(id);
	}

	// update Staff name
	public StaffDto updateStaffName(int id, String name) {
		return staffDao.updateStaffName(id, name);
	}

	// update Staff jd
	public StaffDto updateStaffJob(int id, String job) {
		return staffDao.updateStaffJob(id, job);
	}

	// get staff by Id
	public StaffDto getStaffById(int id) {
		return staffDao.getStaffById(id);
	}

	// get all Staff
	public List<StaffDto> getAllStaff() {
		return staffDao.getAllStaff();
	}

}
