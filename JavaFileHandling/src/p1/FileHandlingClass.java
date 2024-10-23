package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingClass {

	public static void main(String[] args) {
		
		FileHandlingClass obj = new FileHandlingClass();
		String location = "D:\\CGbatch2NOI\\basicjava\\EnumDemo\\src\\withenum\\CoffeeCup.java";
		File f = new File(location);
		
		try {
			//obj.doPrint(f);
			obj.doRead(f);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("End");
		
		
	}
	
	public void doRead(File f)throws IOException
	{
		
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String line = "";
		while((line = br.readLine())!= null)
		{
			System.out.println(line);
		}
		
		
		
	}
	
	public void doPrint(File f)throws IOException
	{
		
			PrintWriter pw = new PrintWriter(new FileWriter(f));
			pw.print("Hello this is java batch");
			pw.close();
	
		
	}
}







