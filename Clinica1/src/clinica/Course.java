package clinica;

public class Course {
	
	private String name;
	private int hours;
	
	private Teacher teacher;
	private int year;

	
	public Course() {
		super();
	}

	public Course(String name, int hours, int year) {
		super();
		this.name = name;
		this.hours = hours;
		this.year = year;
	}
	
	public Course(String name, int hours, Teacher teacher, int year) {
		super();
		this.name = name;
		this.hours = hours;
		this.teacher = teacher;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public int getYear() {
		return year;
	}
	public void setyear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", hours=" + hours + ", teacher=" + teacher + ", year=" + year + "]";
	}

	
}
