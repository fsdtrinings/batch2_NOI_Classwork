package p2;

class Printer2
{
	public  void doPrint(String file)
	{
		System.out.println("No Syn "+file.length());
		
		synchronized (this)
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
}


class User2 implements Runnable
{
	Printer2 printer;
	String fileToPrint;
	
	
	public User2(Printer2 printer, String fileToPrint) {
		this.printer = printer;
		this.fileToPrint = fileToPrint;
		new Thread(this).start();
	}

	@Override
	public void run() {
		printer.doPrint(fileToPrint);
	}
	
}

public class PrintingDemo2
{
	public static void main(String[] args) {
		
		Printer2 hpPrinter = new Printer2();
		
		User2 user1 = new User2(hpPrinter, "public MyThread3(String str)");
		User2 user2 = new User2(hpPrinter, "Excel Formula Work");
		User2 user3 = new User2(hpPrinter, "project documentation work ");
		
		
	}
}

















