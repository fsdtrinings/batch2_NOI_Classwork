package p2;

public class MainClass {

	public static void main(String[] args) {
		
		int x = 10;
		
		StudentB s1 = new StudentB();
		
		s1.setName("Ramesh");
		s1.setAge(23);
		s1.setEnrollNumber(101);
		s1.setCourse("Java Basics");
		
		System.out.println("Student name "+s1.getName());
		System.out.println("age "+s1.getAge());
		System.out.println("enroll "+s1.getEnrollNumber());
		System.out.println("Course "+s1.getCourse());
		
		System.out.println("---------------------------------------");
		System.out.println("Approach 1 , s1 : - "+s1); //
		System.out.println("---------------------------------------");
		System.out.println("Approach 2 , s1 : - "); //
		s1.doPrint();
		System.out.println("---------------------------------------");
		System.out.println("x : - "+x); // 10
		
		
	}//end main
}//end class
