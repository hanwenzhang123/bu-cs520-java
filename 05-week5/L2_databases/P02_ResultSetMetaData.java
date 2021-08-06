package cs520.module5.L2_databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 * 
 * This code is provided for demonstration purposes and will not work
 * when run (unless it is updated to point to an existing MySQL instance
 * with the proper table structure).
 *
 */

public class P02_ResultSetMetaData {

	public static void main(String[] args) {

		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cs520", "cs520", "cs520");
			Statement stmt = conn.createStatement();

			String sql = "select * from STUDENTS";
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData md = rs.getMetaData();

			int numColumns = md.getColumnCount();
			System.out.println("# Columns = " + numColumns);
			System.out.printf(" %-6s %-20s %-10s %4s\n", "Name", "Class", "Type", "Size");

			for (int i = 1; i <= numColumns; i++) {
				System.out.printf(" %-6s %-20s %-10s %3d\n", md.getColumnName(i), 
					md.getColumnClassName(i), md.getColumnTypeName(i), md.getColumnDisplaySize(i));
			}

			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}
