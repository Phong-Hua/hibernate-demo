package com.luv2code.hibernate.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.hibernate.demo.config.DemoAppConfig;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.service.InstructorService;

public class OneToOneCreationDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoAppConfig.class);
		
		Instructor instructor = new Instructor("Phong", "Hua", "phonghua@mail.com");
		
		InstructorDetail detail = new InstructorDetail("youtube/luv2code", "Coding");
		
		// save instructor
		instructor.setInstructorDetail(detail);
		InstructorService service = context.getBean(InstructorService.class);
		service.saveInstructor(instructor);
		
		// save instructor detail, need to change the instructorDetailDaoImpl to persist
//		detail.setInstructor(instructor);
//		instructor.setInstructorDetail(detail);
//		InstructorDetailService service = context.getBean(InstructorDetailService.class);
//		service.saveInstructorDetail(detail);
		
		
		context.close();
	}

}
