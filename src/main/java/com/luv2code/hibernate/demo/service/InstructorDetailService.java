package com.luv2code.hibernate.demo.service;

import com.luv2code.hibernate.demo.entity.InstructorDetail;

public interface InstructorDetailService {

	void saveInstructorDetail(InstructorDetail instructorDetail);

	InstructorDetail getInstructorDetail(int instructorDetailId);
}
