package com.app.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.db.JDBCConnection;

public class DBOperation {

	Connection con;
	PreparedStatement ps;
	public DBOperation() {
		con = JDBCConnection.con;
	}
	
	public boolean saveEmployee(Employee e)throws SQLException
	{
		boolean isSaved = false;
		
		//String sql = "insert into employee values("+e.getEmpid()+",'"+e.getEmpName()+"',"+e.getSalary()+",'"+e.getDepartment()+"')";
		String sql = "insert into employee values(?,?,?,?)";
		
		ps = con.prepareStatement(sql);
		ps.setInt(1,e.getEmpid());
		ps.setString(2, e.getEmpName());
		ps.setInt(3,e.getSalary());
		ps.setString(4, e.getDepartment());
		
	
		int numberOfRowsSaved = ps.executeUpdate();
		return numberOfRowsSaved==1?true:false;
	}

	public List<Employee> getEmployeeByDepartment(String searchDepartment)throws SQLException
	{
		List<Employee> allEmployees = null;
		
		String sql = "select * from Employee where department = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, searchDepartment);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs!=null) allEmployees = new ArrayList<>();
		
		while(rs.next())
		{
			int empId = rs.getInt("empid");
			String empName = rs.getString("employeeName");
			int salary = rs.getInt("salary");
			String department = rs.getString("department");
		
			Employee temp = new Employee(empId, empName, salary, department);
			allEmployees.add(temp);
		}
		
		
		return allEmployees;
	}

}
















