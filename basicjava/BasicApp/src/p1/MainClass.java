package p1;

public class MainClass {

	public static void main(String[] args) {
		
		Student s1 = new Student();  // the creation of Object Student
		
		/*
		s1.name = "Ramesh";
		s1.enrollNumber = 101;
		s1.age =20;
		s1.course = "Java";
		*/
		
		s1.doSomeWork();
		s1.doPrintDetails();
		
		//System.out.println(s1.name+" "+s1.enrollNumber+" "+s1.age+" "+s1.course);
		
		
	}//end main
}//end class
