package cs520.module5.L2_databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class P01_Statements {

	// Define constants
	private static final String URL = "jdbc:mysql://metcs520.mysql.database.azure.com:3306/samplestudent";
	private static final String USERNAME = "samplestudent@metcs520";
	private static final String PASSWORD = "metcs520";

	public static void main(String[] args) {
		// Define conn here so it can be seen from within finally block
		Connection conn = null;

		try {
			// Connect to database
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			// Create s Statement
			Statement stmt = conn.createStatement();

			// Create a list of students
			Collection<Student> students = new ArrayList<Student>();
			students.add(new Student("Alice", "CS520"));
			students.add(new Student("Bob", "CS521"));
			students.add(new Student("Charlie", "CS522"));
			students.add(new Student("Dave", "CS523"));

			// Loop through all students
			Iterator<Student> iter = students.iterator();
			while (iter.hasNext()) {
				Student currentStudent = iter.next();

				// Create sql DELETE query to remove any existing row
				String writeQuery = "delete from students where user = '" + currentStudent.getName() + "'";
				// Run the command
				stmt.executeUpdate(writeQuery);

				// Create a new query to add a new row to the table
				writeQuery = String.format("insert into STUDENTS values ('%s', '%s')",
					currentStudent.getName(), currentStudent.getCourse()
				);

				// Run the command
				stmt.executeUpdate(writeQuery);
			}

			// Select (read) from the table
			String readQuery = "select * from STUDENTS";
			ResultSet rs = stmt.executeQuery(readQuery);

			// Loop until no more rows exist in the ResultSet
			while (rs.next()) {
				// Get column by its name
				String name = rs.getString("USER");
				// Get column by its index
				String course = rs.getString(2);
				System.out.printf("USER=%8s, COURSE=%8s%n", name, course);
			}

			// Close ResultSet and Statement
			rs.close();
			stmt.close();
		} catch (Exception e) {
			// Print stack trace to console
			e.printStackTrace();
		} finally {
			try {
				// Close the connection if it is not null
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
