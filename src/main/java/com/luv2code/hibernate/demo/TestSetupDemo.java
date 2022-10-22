package com.luv2code.hibernate.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.hibernate.demo.config.DemoAppConfig;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.service.InstructorDetailService;

public class TestSetupDemo {
	

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoAppConfig.class);
		
		InstructorDetailService instructorDetailService = context.getBean(InstructorDetailService.class);
		
		InstructorDetail instructorDetail = new InstructorDetail("youtube/luv2code", "Coding");
		
		instructorDetailService.saveInstructorDetail(instructorDetail);
		
		context.close();
	}
}
