package cs520.module5.L2_databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * 
 * This code is provided for demonstration purposes and will not work
 * when run (unless it is updated to point to an existing MySQL instance
 * with the proper table structure).
 *
 */

public class P03_PreparedStatementsWrite {

	public static void main(String[] args) {
		
		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cs520", "cs520", "cs520");

			// Create a parameterized query template
			String query = "insert into STUDENTS (USER, COURSE) values (?, ?)";

			// Get a PreparedStatement instance from Connection, passing it the query
			PreparedStatement pstmt = conn.prepareStatement(query);

			// Create a multidimensional array of students to insert into the table
			String[][] students = { { "Alice", "CS520" }, { "Bob", "CS521" }, { "Charlie", "CS522" } };
			
			// Loop through the students
			for (String[] student : students) {
				// Reuse the PreparedStatement by inserting the current values at the placeholder positions
				pstmt.setString(1, student[0]);
				pstmt.setString(2, student[1]);
				pstmt.executeUpdate();
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
