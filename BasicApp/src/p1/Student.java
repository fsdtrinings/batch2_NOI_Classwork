package p1;

public class Student 
{

	 private int enrollNumber;
	 private String name;
	 private int age;
	 private String course; // we will change this data type

	
	 Student() // default constructor
	 {
		 System.out.println("Inside default constructor");
		 
	 }
	
	 
	 Student(int id) // default constructor
	 {
		 enrollNumber = id;
		 System.out.println("Inside constructor Enrollment Number "+enrollNumber);
		 
	 }
	 
	 
	 
	 
	 
	 public void doSomeWork()
	 {
		 enrollNumber = 202;
		 name = "Ramesh";
		 age = 20;
		 course = "Java basics";
	 }
	 
	 public void doPrintDetails()
	 {
		 System.out.println("Roll Number "+enrollNumber);
		 System.out.println("Name "+name);
		 System.out.println("Age "+age);
		 System.out.println("Course "+course);
	 }
	 

}//end class
