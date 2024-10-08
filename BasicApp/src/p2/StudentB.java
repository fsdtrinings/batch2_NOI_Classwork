package p2;

import java.time.LocalDate;

public class StudentB 
{

	 private int enrollNumber;
	 private String name;
	 private int age;
	 private String course; // we will change this data type
	
	 
	 public StudentB() {
			 name = "Not updated!!";
		 age = 21;
	}
	 
	public StudentB(int enrollNumber, String name, int age, String course) {
		enrollNumber = enrollNumber;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	public int getEnrollNumber() {
		return enrollNumber;
	}
	public void setEnrollNumber(int enrollNumber) {
		this.enrollNumber = enrollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	 
	public void doPrint()
	{
		System.out.println("Student name "+getName());
		System.out.println("age "+getAge());
		System.out.println("enroll "+getEnrollNumber());
		System.out.println("Course "+getCourse());
		
		
	}



	@Override
	public String toString() {
		
		String a = LocalDate.now().toString();
		String b =  "StudentB [enrollNumber=" + enrollNumber + ", name=" + name + ", age=" + age + ", course=" + course
				+ "]";
		
		return a+"\n"+b;
	}
		 
	
	

}//end class
































