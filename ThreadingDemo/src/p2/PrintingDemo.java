package p2;

class Printer
{
	public synchronized  void doPrint(String file)
	{
	
		System.out.println("[");
		try {
			Thread.sleep(500);
			System.out.println(file);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("]");
	}
}


class User implements Runnable
{
	Printer printer;
	String fileToPrint;
	
	
	public User(Printer printer, String fileToPrint) {
		this.printer = printer;
		this.fileToPrint = fileToPrint;
		new Thread(this).start();
	}

	@Override
	public void run() {
		printer.doPrint(fileToPrint);
	}
	
}

public class PrintingDemo
{
	public static void main(String[] args) {
		
		Printer hpPrinter = new Printer();
		
		User user1 = new User(hpPrinter, "public MyThread3(String str)");
		User user2 = new User(hpPrinter, "Excel Formula Work");
		User user3 = new User(hpPrinter, "project documentation work ");
		
		
	}
}

















