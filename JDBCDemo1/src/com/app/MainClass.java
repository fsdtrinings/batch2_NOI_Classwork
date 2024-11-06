package com.app;

import java.sql.SQLException;
import java.time.temporal.Temporal;
import java.util.List;
import java.util.Scanner;

import com.app.entity.DBOperation;
import com.app.entity.Employee;

public class MainClass {

	DBOperation dbOperationClass = new DBOperation();
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Employee e = new Employee(105, "Rakesh", 2800, "Marketing");
		
		MainClass app = new MainClass();
		
		try {
			//boolean status = app.insertEmployee(e);
			//System.out.println("Data Saved");
			
			app.displayReportsEmployeeBasedOnDepartment();
			
		} catch (Exception e2) {
			System.out.println("Contact to Admin "+e2.toString());
		}
		
		
	}
	
	
	public boolean insertEmployee(Employee e)throws SQLException
	{
		boolean status = dbOperationClass.saveEmployee(e);
		return status;
	}
	
	public void displayReportsEmployeeBasedOnDepartment()throws SQLException
	{
		//System.out.println("Enter Department Name : ");
		//String department = sc.nextLine();
		String department = "Marketing";
		List<Employee> savedEmployeesList = dbOperationClass.getEmployeeByDepartment(department);
	
		System.out.println("ID \t Name \t Department");
		System.out.println("____________________________________");
		savedEmployeesList.stream().forEach((e)->{
			System.out.println(""+e.getEmpid()+"\t"+e.getEmpName()+"\t"+e.getDepartment());
		});
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
