package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.*;

public class Program {
	public static void main(String[] args) throws SQLException {

		String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:49868"//1433"
			    + ";databaseName=qastore"
			    + ";user=bob"
			    + ";password=password123"
			    + ";encrypt=true"
			    + ";trustServerCertificate=true";


		try (Connection conn = DriverManager.getConnection(url)) {
			System.out.println("Connected!");
			String sql = "SELECT * FROM company";
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) +","+ resultSet.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

//		Connection connection = DriverManager.getConnection(connectionUrl);
//		String sql = "SELECT company_name FROM company";
//
//		Statement statement = connection.createStatement();
//		ResultSet resultSet = statement.executeQuery(sql);
//
//		while (resultSet.next()) {
//			System.out.println(resultSet.getString(1));
//		}
//		connection.close();
	}
}


/*
 * public class Program {
 * 
 * public static void main(String[] args) {
 * 
 * new MSSQLExample().read();
 * 
 * } }
 * 
 * class MSSQLExample {
 * 
 * public void read() {
 * 
 * String url =
 * "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qastore;encrypt=true;trustServerCertificate=true;user=bob;password=password123";
 * url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433" + ";databaseName=qastore"
 * + ";user=bob" + ";password=password123" + ";encrypt=true" +
 * ";trustServerCertificate=true";
 * 
 * try (Connection conn = DriverManager.getConnection(url);
 * 
 * Statement stmt = conn.createStatement()) {
 * 
 * String query = "SELECT * FROM sale'";
 * 
 * ResultSet rs = stmt.executeQuery(query);
 * 
 * while (rs.next()) {
 * 
 * System.out.println(rs.getString(1) + "," + rs.getString("description"));
 * 
 * }
 * 
 * } catch (Exception e) {
 * 
 * e.printStackTrace();
 * 
 * }
 * 
 * }
 * 
 * }
 */