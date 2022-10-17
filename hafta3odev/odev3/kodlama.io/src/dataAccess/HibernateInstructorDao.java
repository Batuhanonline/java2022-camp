package dataAccess;

import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitimci hibernate ile eklendi: " + instructor.getFirstName() + " " + instructor.getLastName());
		
	}

}
