package p1;

import java.util.Iterator;

class MyThread2 implements Runnable
{

	@Override
	public void run() {
		for(int i = 0;i<5;i++)
		{
			System.out.println("MyThread "+i);
		}
	}
	
}

public class Demo2 {
	
	public static void main(String[] args) {
		
		
		MyThread2 mt = new MyThread2();
		Thread t = new Thread(mt);
		t.start();
		
		for(int i = 0;i<5;i++)
		{
			System.out.println("Main "+i);
		}
	}

}






























