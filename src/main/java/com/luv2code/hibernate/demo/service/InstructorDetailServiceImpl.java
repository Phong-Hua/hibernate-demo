package com.luv2code.hibernate.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.hibernate.demo.dao.InstructorDetailDao;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

@Service
public class InstructorDetailServiceImpl implements InstructorDetailService {

	@Autowired
	private InstructorDetailDao instructorDetailDao;
	
	@Override
	@Transactional
	public void saveInstructorDetail(InstructorDetail instructorDetail) {
		instructorDetailDao.saveInstructorDetail(instructorDetail);
	}

	@Override
	@Transactional
	public InstructorDetail getInstructorDetail(int instructorDetailId) {
		return instructorDetailDao.getInstructorDetail(instructorDetailId);
	}

}
