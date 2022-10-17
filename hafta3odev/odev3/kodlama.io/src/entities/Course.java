package entities;

public class Course extends BaseEntity{
	private String courseName;
	private String courseCategoryName;
	private int coursePrice;
	private int courseInstructorId;

	public Course(int id, String courseCategoryName, int courseInstructorId, String courseName, int coursePrice) {
		super(id);
		this.courseCategoryName = courseCategoryName;
		this.courseInstructorId = courseInstructorId;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCategoryId() {
		return courseCategoryName;
	}

	public void setCourseCategoryId(String courseCategoryName) {
		this.courseCategoryName = courseCategoryName;
	}

	public int getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}

	public int getCourseInstructorId() {
		return courseInstructorId;
	}

	public void setCourseInstructorId(int courseInstructorId) {
		this.courseInstructorId = courseInstructorId;
	}
	
	

}
