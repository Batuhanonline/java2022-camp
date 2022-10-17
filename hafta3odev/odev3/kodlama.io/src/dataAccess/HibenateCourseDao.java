package dataAccess;

import entities.Course;

public class HibenateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Kurs hibernate ile eklendi: " + course.getCourseName());
		
	}

}
