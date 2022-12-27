package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.StaffDto;

public class StaffDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("nilesh");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// Save Staff
	public StaffDto saveStaff(StaffDto staff) {
		entityTransaction.begin();
		entityManager.persist(staff);
		entityTransaction.commit();
		return staff;
	}

	// delete Staff

	public StaffDto deleteStaff(int id) {
		StaffDto staff = entityManager.find(StaffDto.class, id);

		entityTransaction.begin();
		entityManager.remove(staff);
		entityTransaction.commit();
		return staff;
	}

	// update Staff name
	public StaffDto updateStaffName(int id, String name) {
		StaffDto staff = entityManager.find(StaffDto.class, id);
		staff.setName(name);
		entityTransaction.begin();
		entityManager.merge(staff);
		entityTransaction.commit();
		return staff;
	}

	// update Staff jd
	public StaffDto updateStaffJob(int id, String job) {
		StaffDto staff = entityManager.find(StaffDto.class, id);
		staff.setJd(job);
		entityTransaction.begin();
		entityManager.merge(staff);
		entityTransaction.commit();
		return staff;
	}

	// get staff by Id
	public StaffDto getStaffById(int id) {
		StaffDto staff = entityManager.find(StaffDto.class, id);
		return staff;
	}

	// get all staff
	public List<StaffDto> getAllStaff() {
		String sql = "Select s from  StaffDto s";
		Query query = entityManager.createQuery(sql);
		List<StaffDto> staff = query.getResultList();
		return staff;
	}
}
