package com.jsp.service;

import java.util.List;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.TeacherDto;

public class TeacherServices {

	TeacherDao teacherDao = new TeacherDao();

	// save teacher
	public TeacherDto saveTeacher(TeacherDto teacherDto) {
		return teacherDao.saveTeacher(teacherDto);
	}

	// udpadte teacher name
	public TeacherDto updateTeacherNameById(int id, String name) {
		return teacherDao.updateTeacherNameById(id, name);
	}

	// udpadte Teacher email
	public TeacherDto updateTeacherEmailById(int id, String email) {
		return teacherDao.updateTeacherEmailById(id, email);
	}

	// udpadte Teacher Password
	public TeacherDto updateTeacherPasswordById(int id, String password) {
		return teacherDao.updateTeacherPasswordById(id, password);
	}

	// udpadte Teacher Subject
	public TeacherDto updateTeacherPSubjectById(int id, String subject) {
		return teacherDao.updateTeacherPSubjectById(id, subject);
	}

	// Delete teacher
	public TeacherDto deleteTeacher(int id) {
		return teacherDao.deleteTeacher(id);
	}

// get by id
	public TeacherDto getTeacherById(int id) {
		return teacherDao.getTeacherById(id);
	}

	// get all teacher
	public List<TeacherDto> getAllTeacher() {
		return teacherDao.getAllTeacher();
	}

}
