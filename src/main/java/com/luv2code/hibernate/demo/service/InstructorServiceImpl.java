package com.luv2code.hibernate.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.hibernate.demo.dao.InstructorDao;
import com.luv2code.hibernate.demo.entity.Instructor;

@Service
public class InstructorServiceImpl implements InstructorService {

	@Autowired
	private InstructorDao instructorDao;
	
	@Override
	@Transactional
	public void saveInstructor(Instructor instructor) {
		instructorDao.saveInstructor(instructor);
	}

	@Override
	@Transactional
	public Instructor getInstructor(int instructorId) {
		return instructorDao.getInstructor(instructorId);
	}

}
