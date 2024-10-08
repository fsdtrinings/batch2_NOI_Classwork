package thisDemo;

class Demo
{
	int x = 100;
	
	public void doPrint()
	{
		System.out.println("Inside doPrint this hashcode "+this);
		System.out.println(this.x); // this points to current calling object
		
	}
}


public class ThisDemo {
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		d1.x = 10;
		System.out.println("Inside main d1 hashcode "+d1);
		d1.doPrint();
		
		
	}

}
