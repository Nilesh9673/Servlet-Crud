package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.StudentDto;

public class StudentDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nilesh");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// save Student
	public StudentDto saveStudent(StudentDto student) {

		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();

		return student;
	}

	// Update Student name
	public StudentDto updateStudentNameById(int id, String name) {
		StudentDto student = entityManager.find(StudentDto.class, id);
		if (student != null) {
			student.setName(name);
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
		} else {

		}

		return student;
	}

	// Update Student Dob
	public StudentDto updateStudentDobById(int id, String dob) {
		StudentDto student = entityManager.find(StudentDto.class, id);
		if (student != null) {
			student.setDob(dob);
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
		} else {

		}

		return student;
	}

	// Update Student Contact no
	public StudentDto updateStudentContactById(int id, String cno) {
		StudentDto student = entityManager.find(StudentDto.class, id);
		if (student != null) {
			student.setCno(cno);
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
		} else {

		}

		return student;
	}

	// delete Student
	public StudentDto deleteStudent(int id) {
		StudentDto student = entityManager.find(StudentDto.class, id);
		if (student != null) {
			entityTransaction.begin();
			entityManager.remove(student);
			entityTransaction.commit();
		} else {

		}
		return student;
	}

	// get Student by id
	public StudentDto getStudentById(int id) {
		StudentDto student = entityManager.find(StudentDto.class, id);
		return student;
	}

	public List<StudentDto> getAllStudent() {
		String sql = "Select s from  StudentDto s";
		Query query = entityManager.createQuery(sql);
		List<StudentDto> student = query.getResultList();
		return student;
	}
}
