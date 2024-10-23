package p1;

import java.util.Iterator;

class MyThread3 implements Runnable
{
	String str;
	Thread t;
	public MyThread3(String str) {
		this.str = str;
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		for(int i = 0;i<5;i++)
		{
			System.out.println("MyThread "+str.charAt(i));
		}
	}
}

public class Demo3 {
	
	public static void main(String[] args) {
		
		MyThread3 mt = new MyThread3("Hello");
		
		
		
		for(int i = 0;i<5;i++)
		{
			System.out.println("Main "+i);
		}
	}

}






























