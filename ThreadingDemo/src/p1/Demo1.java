package p1;

import java.util.Iterator;

class MyThread extends Thread
{

	@Override
	public void run() {
		for(int i = 0;i<5;i++)
		{
			System.out.println("MyThread "+i);
		}
	}
	
}

public class Demo1 {
	
	public static void main(String[] args) {
		
		
		MyThread t = new MyThread();
		t.start();
		
		for(int i = 0;i<5;i++)
		{
			System.out.println("Main "+i);
		}
	}

}






























