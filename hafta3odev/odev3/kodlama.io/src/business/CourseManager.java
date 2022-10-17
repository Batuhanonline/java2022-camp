package business;

import java.util.ArrayList;

import core.logger.BaseLogger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private BaseLogger[] logger;
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	public CourseManager(CourseDao courseDao, BaseLogger[] logger) {
		this.courseDao = courseDao;
		this.logger = logger;
	}
	
	public void getCourses() {
		System.out.println("Kurslar: ");
		for(Course currentCourse : this.courses) {
			System.out.println("    - " + currentCourse.getCourseName());
		}
	}
	
	public void addCourse(Course course) throws Exception {
		if(this.courses.size() > 0) {
			for(Course currentCourse : this.courses) {
				if(currentCourse.getCourseName() == course.getCourseName()) {
					throw new Exception("Kurs ismi daha önce kullanılmış!" + course.getCourseName());
				}
			}
		}
		if(course.getCoursePrice() < 0) {
			throw new Exception("Kursun fiyatı 0 dan küçük olamaz!");
		}
		this.courses.add(course);
		this.courseDao.add(course);
		for(BaseLogger log : logger) {
			log.log(course.getCourseName());
		}
	}
	
}
