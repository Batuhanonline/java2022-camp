package dataAccess;

import entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Kurs jdbs ile eklendi: " + course.getCourseName());
		
	}

}
