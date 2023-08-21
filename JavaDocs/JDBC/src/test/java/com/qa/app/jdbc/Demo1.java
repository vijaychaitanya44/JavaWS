package com.qa.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/testdb1";
		String uname = "root";
		String pwd = "Root@123";
		String query = "select Firstname from customers where RollNo =44;";
		String query3 = "select * from Customers;";
		String eQuery1 = "Insert into Customers (PersonID,Firstname,RollNo) values (8,'July',29);";
		String query2 = "select PersonID,Firstname,RollNo from customers where RollNo =44;";
				
		//Class.forName("com.mysql.cj.jdbc.driver");
		Connection con = DriverManager.getConnection(url,uname,pwd);
		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery(query3);
//		while (rs.next()) {
//			int id = rs.getInt("PersonId");
//			String name = rs.getString("Firstname");
//			int roll = rs.getInt("RollNo");
//			System.out.println(name + ": " + id + " :" + roll);
//		}
		
		ResultSet rs = st.executeQuery(query);
		System.out.println(rs);
		
		
	}

}
