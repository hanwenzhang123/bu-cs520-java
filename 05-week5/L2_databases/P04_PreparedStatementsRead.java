package cs520.module5.L2_databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 
 * This code is provided for demonstration purposes and will not work
 * when run (unless it is updated to point to an existing MySQL instance
 * with the proper table structure).
 *
 */

public class P04_PreparedStatementsRead {

	public static void main(String[] args) {
		
		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cs520", "cs520", "cs520");

			// Create a parameterized query template
			String query = "select * from STUDENTS where COURSE = ?";

			// Get a PreparedStatement instance from Connection, passing it the query
			PreparedStatement pstmt = conn.prepareStatement(query);

			// Create an array of course names to query on
			String[] courses = { "CS520", "CS521", "CS522" };
			
			// Loop through the course names
			for (String course : courses) {
				// Reuse the PreparedStatement by inserting the current course at placeholder position #1
				pstmt.setString(1, course);
				ResultSet rs = pstmt.executeQuery();
				System.out.printf("Students enrolled in %s:\n", course);
				
				while (rs.next()) {
					System.out.println("  " + rs.getString("USER"));
				}
				rs.close();
			}
			
			// Close the PreparedStatement
			pstmt.close();
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
