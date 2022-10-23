package com.luv2code.hibernate.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.hibernate.demo.config.DemoAppConfig;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.service.InstructorDetailService;
import com.luv2code.hibernate.demo.service.InstructorService;

public class OneToOneGetDemo {

	public static void main(String[] args) {
//		loadInstructorDetail();
		loadInstructor();
	}

	private static void loadInstructor() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoAppConfig.class);
		
		int instructorId = 6;
		InstructorService instructorService = context.getBean(InstructorService.class);
		
		Instructor instructor = instructorService.getInstructor(instructorId);

		InstructorDetail instructorDetail = instructor.getInstructorDetail();

		System.out.println("Instructor: " + instructor);
		System.out.println("Instructor details: " + instructorDetail);
		
		context.close();
	}
	
	private static void loadInstructorDetail() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoAppConfig.class);
		
		int instructorDetailId = 9;
		InstructorDetailService service = context.getBean(InstructorDetailService.class);
		
		InstructorDetail instructorDetail = service.getInstructorDetail(instructorDetailId);
		Instructor instructor = instructorDetail.getInstructor();
		
		System.out.println("Instructor details: " + instructorDetail);
		System.out.println("Instructor: " + instructor);
		
		
		context.close();
	}
}
