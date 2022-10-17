package business;

import java.util.ArrayList;

import core.logger.BaseLogger;
import dataAccess.InstructorDao;
import entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private BaseLogger[] logger;
	private ArrayList<Instructor> instructors = new ArrayList<Instructor>();
	
	public InstructorManager(InstructorDao instructorDao, BaseLogger[] logger) {
		this.instructorDao = instructorDao;
		this.logger = logger;
	}
	
	public void getInstructors() {
		System.out.println("Eğitimciler: ");
		for(Instructor instructor : instructors) {
			System.out.println("    - " + instructor.getFirstName() + " " + instructor.getLastName());
		}
	}
	
	public void addInstructor(Instructor instructor) throws Exception {
		if(instructor.getFirstName() != null && instructor.getLastName() != null) {
			this.instructors.add(instructor);
			this.instructorDao.add(instructor);
			for(BaseLogger log : logger) {
				log.log(instructor.getFirstName() + " " + instructor.getLastName());
			}
		}
	}
	
	
}
