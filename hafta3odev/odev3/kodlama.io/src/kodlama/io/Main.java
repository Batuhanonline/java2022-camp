package kodlama.io;

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logger.BaseLogger;
import core.logger.DatabaseLogger;
import core.logger.EmailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.JdbcCourseDao;
import dataAccess.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		/*
		//logger
		BaseLogger[] loggers = {new DatabaseLogger(), new EmailLogger()};
		
		//Category Manager
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		
		// Category --> 1
		Category category1 = new Category(1, "Java");
		categoryManager.addCategory(category1);

		// Category --> 2
		Category category2 = new Category(2, "Java");
		categoryManager.addCategory(category2);
			
		System.out.println("*****************************************");
		
		*/
		/*
		
		//Instructor Manager
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		
		//Instructor --> 1
		Instructor instructor1 = new Instructor(1, "Batuhan", "Güven", "batuhan_guvenn@outlook.com", "Yazılım Geliştirici");
		instructorManager.addInstructor(instructor1);
		
		//Instructor --> 2
		Instructor instructor2 = new Instructor(2, "Batuhan", "", "batuhan_guvenn@outlook.com", "Yazılım Geliştirici");
		instructorManager.addInstructor(instructor2);
		
		System.out.println("*****************************************");
		
		*/
		/*
		
		//Course Manager
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		
		//Course --> 1
		Course course1 = new Course(1, "Java", 1, "Java2022", 50);
		courseManager.addCourse(course1);

		//Course --> 2
		Course course2 = new Course(2, "Java", 1, "Java2023", -20);
		courseManager.addCourse(course2);
		
		//Course --> 3
		Course course3 = new Course(3, "Java", 1, "Java2022", 20);
		courseManager.addCourse(course3);
		
		*/
		
		
	}
	
	
}
