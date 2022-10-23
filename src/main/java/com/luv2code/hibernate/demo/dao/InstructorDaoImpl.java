package com.luv2code.hibernate.demo.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.hibernate.demo.entity.Instructor;

@Repository
public class InstructorDaoImpl implements InstructorDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveInstructor(Instructor instructor) {
		sessionFactory.getCurrentSession().save(instructor);
	}

}
