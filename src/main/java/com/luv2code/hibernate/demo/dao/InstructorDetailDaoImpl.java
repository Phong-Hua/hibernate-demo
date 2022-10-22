package com.luv2code.hibernate.demo.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.hibernate.demo.entity.InstructorDetail;

@Repository
public class InstructorDetailDaoImpl implements InstructorDetailDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveInstructorDetail(InstructorDetail instructorDetail) {
		sessionFactory.getCurrentSession().save(instructorDetail);
	}

}
