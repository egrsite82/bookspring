package clinica;

import java.util.ArrayList;

public class Student  extends Person {
	private ArrayList<Course> courses;
	private int yearEnrollment;
	private double salaryAsStudent;
	//private double marks: hashmap of course and marks
		
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int day, int month, int year, int yearEnrollment, double salaryAsStudent) {
		super(name, day, month, year);
		this.yearEnrollment = yearEnrollment;
		this.salaryAsStudent = salaryAsStudent;
		this.courses = new ArrayList<Course>();
		
	}
	
	
	public Student(String name, int height, int weigth) {
		super(name, height, weigth);
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getSalary () {
		return this.basicSalary + this.salaryAsStudent;
	}
	
	public void addCourse (Course course) {
		this.courses.add(course);
	}
	
	public void removeCourse (Course course) {
		this.courses.remove(course);
	}
	
	public ArrayList<Course> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	public int getYearEnrollment() {
		return yearEnrollment;
	}
	public void setYearEnrollment(int yearEnrollment) {
		this.yearEnrollment = yearEnrollment;
	}
	public double getSalaryAsStudent() {
		return salaryAsStudent;
	}
	public void setSalaryAsStudent(double salaryAsStudent) {
		this.salaryAsStudent = salaryAsStudent;
	}
	@Override
	public String toString() {
		
		return "Student: " + super.toString() + "\n courses=" + courses + "\n yearEnrollment=" + yearEnrollment + "\n salaryAsStudent="
				+ this.getSalary();
	}

	
	
	

	
}
