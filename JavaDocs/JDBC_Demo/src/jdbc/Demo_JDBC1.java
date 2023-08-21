package jdbc;

import java.sql.*;

public class Demo_JDBC1 {
	/*
	 * 
	 * 1. Import - java.sql.*; 2. Load and register the driver -->
	 * com.mysql.jdbc.Driver 3. Create connection --> Connection 4. Create a
	 * statement --> Statement 5. Execute the query 6. Process the results 7. Close
	 * 
	 * 
	 */

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/testdb1";
		String uname = "root";
		String pwd = "Root@123";
		String query = "select Firstname from customers where RollNo =44;";
		String query3 = "select * from Customers;";
		String eQuery1 = "Insert into Customers (PersonID,Firstname,RollNo) values (8,'July',29);";
		String query2 = "select PersonID,Firstname,RollNo from customers where RollNo =44;";

		/*
		 * However, in newer versions, including MySQL Connector/J 8.0 (which seems to
		 * be the case here), this step is not required. So, you can safely omit this
		 * line.
		 */

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pwd);
		Statement st = con.createStatement();
		//ResultSet rs = st.executeQuery(query3);//DDL, DML, DQL
		int count = st.executeUpdate(eQuery1);
		System.out.println(count + "rows effected");

		ResultSet rs = st.executeQuery(query3);
		while (rs.next()) {
			int id = rs.getInt("PersonId");
			String name = rs.getString("Firstname");
			int roll = rs.getInt("RollNo");
			System.out.println(name + ": " + id + " :" + roll);
		}
		int ct = st.getMaxRows();
		System.out.println(ct);
		st.close();
		con.close();
	}

}
