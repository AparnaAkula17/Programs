package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import data.Employee;

public class EmployeeDao 
{
		public Connection getConnection() throws ClassNotFoundException, SQLException
		{
			Connection con=null;
			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return con;
		}
		public int insertEmployee(Employee emp)
		{
			int result=0;
			try
			{
				Connection con=getConnection();
				String sql="insert into employee values(?,?,?,?,?)";
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setString(1,emp.getEmpid());
				pst.setString(2,emp.getEname());
				pst.setString(3,emp.getDept());
				pst.setString(4,emp.getDesg());
				pst.setString(5,emp.getEmail());
				result=pst.executeUpdate();
			}	
			catch(Exception e)
			{
				System.out.println(e);
			}
			return result;
		}
		
		public List<Employee> showEmployees()
		{
			List<Employee> list=new ArrayList<Employee>();
			try
			{
				Connection con=getConnection();
				Statement ps=con.createStatement();
				ResultSet rs=ps.executeQuery("select * from employee");
				while(rs.next())
				{
					Employee u=new Employee();
					u.setEmpid(rs.getString(1));
					u.setEname(rs.getString(2));
					u.setDept(rs.getString(3));
					u.setDesg(rs.getString(4));
					u.setEmail(rs.getString(5));
					list.add(u);
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return list;
		}
		
		public Employee searchEmployee(String id)
		{
			Employee emp=new Employee();
			try
			{
				Connection con=getConnection();
				String sql="select * from employee where empid=?";
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setString(1,id);
				ResultSet rs=pst.executeQuery();
				rs.next();
				System.out.println(rs.getString(1));
				emp.setEmpid(rs.getString(1));
				emp.setEname(rs.getString(2));
				emp.setDept(rs.getString(3));
				emp.setDesg(rs.getString(4));
				emp.setEmail(rs.getString(5));
			}	
			catch(Exception e)
			{
				System.out.println(e);
			}
			return emp;
		}
}
