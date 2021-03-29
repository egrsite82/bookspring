package clinica;

import java.util.ArrayList;

public class Teacher extends Employee{
	
	private ArrayList<Course> courses;
	private double paymentPerCourse;
	private double salaryAsTeacher = 0.0;
	
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, int day, int month, int year, double basicSalary, double salaryEmployee,double paymentPerCourse) {
		super(name, day, month, year, basicSalary, salaryEmployee);
		this.paymentPerCourse = paymentPerCourse;
		this.courses = new ArrayList<Course>();
		
	}
	public Teacher(String name, int height, int weigth) {
		super(name, height, weigth);
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getSalary () {
			
		return this.getSalaryAsTeacher() + basicSalary + salaryEmployee;
	}
	
	public void addCourse (Course course) {
		this.courses.add(course);
		//setSalaryAsTeacher();
	}
	
	public void removeCourse (Course course) {
		this.courses.remove(course);
		//setSalaryAsTeacher();
	}
	public ArrayList<Course> getCourses() {
		return courses;
	}
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	public double getPaymentPerCourse() {
		return paymentPerCourse;
	}
	public void setPaymentPerCourse(double paymentPerCourse) {
		this.paymentPerCourse = paymentPerCourse;
	}
	
	public double getSalaryAsTeacher() {
		setSalaryAsTeacher();
		return salaryAsTeacher;
	}
	
	public void setSalaryAsTeacher() { 
		  this.salaryAsTeacher = this.courses.size() * this.paymentPerCourse;
	}
	
	@Override
	public String toString() {
		return "Teacher" + super.toString()
				+ "\n number of courses: " + this.getCourses().size()
				+ "\n [courses=" + courses + " ]"
				+ "\n paymentPerCourse: " + paymentPerCourse
				+ "\n salaryAsTeacher: " + this.getSalary();
	}
	
	
	
	
}
