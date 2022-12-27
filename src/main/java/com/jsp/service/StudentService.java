package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.StudentDto;

public class StudentService {

	StudentDao studentDao = new StudentDao();

	// save Student
	public StudentDto saveStudent(StudentDto student) {
		return studentDao.saveStudent(student);
	}

	// Update Student name
	public StudentDto updateStudentNameById(int id, String name) {
		return studentDao.updateStudentNameById(id, name);
	}

	// Update Student Dob
	public StudentDto updateStudentDobById(int id, String dob) {
		return studentDao.updateStudentDobById(id, dob);
	}

	// Update Student Contact no
	public StudentDto updateStudentContactById(int id, String cno) {
		return studentDao.updateStudentContactById(id, cno);
	}

	// delete Student
	public StudentDto deleteStudent(int id) {
		return studentDao.deleteStudent(id);
	}

	// get Student by id
	public StudentDto getStudentById(int id) {
		return studentDao.getStudentById(id);
	}

	// get All Student
	public List<StudentDto> getAllStudent() {
		return studentDao.getAllStudent();
	}
}
