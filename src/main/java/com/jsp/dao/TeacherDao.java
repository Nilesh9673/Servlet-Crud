package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.TeacherDto;

public class TeacherDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nilesh");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// save Teacher
	public TeacherDto saveTeacher(TeacherDto teacherDto) {
		entityTransaction.begin();
		entityManager.persist(teacherDto);
		entityTransaction.commit();
		return teacherDto;
	}

	// udpadte teacher name
	public TeacherDto updateTeacherNameById(int id, String name) {
		TeacherDto teacherDto = entityManager.find(TeacherDto.class, id);
		teacherDto.setName(name);

		entityTransaction.begin();
		entityManager.merge(teacherDto);
		entityTransaction.commit();

		return teacherDto;
	}

	// udpadte Teacher email
	public TeacherDto updateTeacherEmailById(int id, String email) {
		TeacherDto teacherDto = entityManager.find(TeacherDto.class, id);
		teacherDto.setEmail(email);
		entityTransaction.begin();
		entityManager.merge(teacherDto);
		entityTransaction.commit();
		return teacherDto;

	}

	// udpadte Teacher Password
	public TeacherDto updateTeacherPasswordById(int id, String password) {
		TeacherDto teacherDto = entityManager.find(TeacherDto.class, id);
		teacherDto.setPassword(password);
		entityTransaction.begin();
		entityManager.merge(teacherDto);
		entityTransaction.commit();
		return teacherDto;
	}

	// udpadte Teacher Subject
	public TeacherDto updateTeacherPSubjectById(int id, String subject) {
		TeacherDto teacherDto = entityManager.find(TeacherDto.class, id);
		teacherDto.setSubject(subject);
		entityTransaction.begin();
		entityManager.merge(teacherDto);
		entityTransaction.commit();
		return teacherDto;
	}

	// Delete teacher
	public TeacherDto deleteTeacher(int id) {
		TeacherDto teacherDto = entityManager.find(TeacherDto.class, id);
		entityTransaction.begin();
		entityManager.remove(teacherDto);
		entityTransaction.commit();
		return teacherDto;
	}

// get by id
	public TeacherDto getTeacherById(int id) {
		TeacherDto teacherDto = entityManager.find(TeacherDto.class, id);
		return teacherDto;
	}

	// get all teacher
	public List<TeacherDto> getAllTeacher() {
		String sql = "select t from TeacherDto t";
		Query query = entityManager.createQuery(sql);
		List<TeacherDto> teacher = query.getResultList();
		return teacher;
	}
}
