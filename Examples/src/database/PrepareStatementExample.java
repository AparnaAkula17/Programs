package database;

import java.sql.*;
import java.util.*;

public class PrepareStatementExample {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/example","root","root");
			
	}
}
