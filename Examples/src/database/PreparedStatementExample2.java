package database;

import java.sql.*;
import java.util.*;

public class PreparedStatementExample2 {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/example","root","root");
			String query="select * from customers where id=? ";
			PreparedStatement pst=connection.prepareStatement(query);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter customer id");
			int id=sc.nextInt();
			pst.setInt(1,id);
			ResultSet rs=pst.executeQuery();
			rs.next();
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			rs.close();
			pst.close();
			connection.close();
	}
}
