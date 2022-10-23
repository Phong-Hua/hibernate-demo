package com.luv2code.hibernate.demo.dao;

import com.luv2code.hibernate.demo.entity.InstructorDetail;

public interface InstructorDetailDao {

	void saveInstructorDetail(InstructorDetail instructorDetail);

	InstructorDetail getInstructorDetail(int instructorDetailId);
}
