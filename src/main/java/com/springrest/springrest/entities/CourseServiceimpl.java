package com.springrest.springrest.entities;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.services.CourseService;

@Service
public class CourseServiceimpl implements CourseService {
	List<Course> list;
	public CourseServiceimpl() {
		list=new ArrayList<>();
		list.add(new Course(145,"Java","basics"));
		list.add(new Course(156,"Spring Boot","Rest Api"));
		
	}
	@Override
	public List<Course> getCourses() {
		return list;
	}
	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c= null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}
	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

}
