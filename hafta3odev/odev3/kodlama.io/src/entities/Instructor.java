package entities;

public class Instructor extends BaseEntity{
	private String firstName;
	private String lastName;
	private String contact;
	private String about;

	public Instructor(int id, String firstName, String lastName, String contact, String about) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.about = about;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
	

}
