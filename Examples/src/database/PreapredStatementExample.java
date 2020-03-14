package database;

import java.sql.*;
import java.util.*;

public class PreapredStatementExample {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/example","root","root");
			String query="insert into customers values(?,?,?,?)";
			PreparedStatement pst=connection.prepareStatement(query);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter customer id");
			int id=sc.nextInt();
			System.out.println("enter customer name");
			String name=sc.next();
			System.out.println("enter customer type");
			String ctype=sc.next();
			System.out.println("enter customer age");
			int age=sc.nextInt();
			pst.setInt(1,id);
			pst.setString(2,name);
			pst.setString(3,ctype);
			pst.setInt(4,age);
			int x=pst.executeUpdate();
			System.out.println((x+ "Records Inserted..."));
		
	}

}
