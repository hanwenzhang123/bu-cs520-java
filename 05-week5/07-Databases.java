Databases (JDBC)
The Java Database Connectivity (JDBC) portion of the Java JDK provides the Java classes needed to work with relational databases.
  
These classes are part of the java.sql package
DriverManager, Connection, Statement, PreparedStatement, ResultSet and ResultSetMetaData.
  
  
//Database Connection
The logical first step for a JDBC application is to acquire a connection to the database. 
To make this simple, Java provides the DriverManager class, which has a static method called getConnection().  
  
Connection conn = null;

try {
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cs520", "cs520", "cs520");
} catch (Exception e) {
    e.printStackTrace();
} finally {
    try {
        if (conn != null) {
            // Don't try to close the connection if it is null,
            // which will be the case if the connection failed
            conn.close();
        }
    } catch (Exception e2) {
        // Nested try/catch because the attempt to close the connection could throw another exception
        e2.printStackTrace();
    }
}
  

//Executing SQL Statements
INSERT: Adds a row into a specified table in the database.
UPDATE: Modifies data in one or more rows in the specified table in the database.
DELETE: Deletes rows from the specified table in the database.
SELECT: Reads rows of data from the specified table(s) in the database.
  
To execute statements, we will need to create an instance of java.sql.Statement using our Connection object instance:
Statement stmt = conn.createStatement();
  

//Writing Data
By calling the executeUpdate() method on the Statement object instance, any raw SQL command may be passed through to the database. 
// Insert a row into the STUDENTS table
String sql = "insert into STUDENTS (USER,COURSE) values ('Alice', 'CS520')";
stmt.executeUpdate(sql);

// Insert another row into the STUDENTS table
sql = "insert into STUDENTS (USER,COURSE) values ('Bob', 'CS521')";
stmt.executeUpdate(sql);

// Change Charlie's course to 522
sql = "update STUDENTS set COURSE = '522' where USER = 'Charlie'";
stmt.executeUpdate(sql);

// Delete David's row
sql = "delete from STUDENTS where USER = 'David'";
stmt.executeUpdate(sql);
  

//Retrieving Data
The SQL SELECT statement is used for retrieving data from one or more tables in the database
java.sql.Statement provides us with an executeQuery() method for this purpose
When a SELECT query is passed to the database, JDBC returns results in an object called ResultSet.

String sql = "select * from STUDENTS"; // Will retrieve all rows in the table
ResultSet rs = stmt.executeQuery(sql);

while (rs.next()) {
    String name = rs.getString("USER"); // Reference by column name
    String course = rs.getString(2); // Reference by column position
    System.out.printf("USER=%8s, COURSE=%8s\n", name, course);
  
  
//ResultSetMetaData
It is often the case that our program will need to discover metadata about the ResultSet itself following an executeQuery() (SELECT) operation
  
Connection conn = null;

try {

    // Get a Connection instance
    DriverManager.getConnection("jdbc:mysql://localhost:3306/cs520", "cs520", "cs520");
    Statement stmt = conn.createStatement();

    // Run the SELECT query
    String sql = "Select * from STUDENTS";
    ResultSet rs = stmt.executeQuery(sql);

    // Read the metadata about the result set
    ResultSetMetaData md = rs.getMetaData();
    int numColumns = md.getColumnCount();
    System.out.println("# Columns = " + numColumns);
    System.out.printf(" %-6s %-20s %-10s %4s\n", "Name", "Class", "Type", "Size");

    // Loop through each column and display metadata about them
    for (int i = 1; i <= numColumns; i++) {
        System.out.printf(" %-6s %-20s %-10s %3d\n",
            md.getColumnName(i), md.getColumnClassName(i),
            md.getColumnTypeName(i), md.getColumnDisplaySize(i));
    }

    // Close the Statement
    stmt.close();

} catch (Exception e) {
    e.printStackTrace();
} finally {
    try {
        // Close the Connection, but only if it is not null
        if (conn != null) {
            conn.close();
        }
    } catch (Exception e2) {
         // Exception caused when trying to close Connection
        e2.printStackTrace();
    }
} 

  
//Prepared Statements
  To process repeated SQL statements efficiently, the java.sql.PreparedStatement class can be used. 
    PreparedStatement class derives from the Statement class and is created with a parameterized query rather than the plain SQL queries processed by Statement.
  
// Create a parameterized query template
String query = "insert into STUDENTS (USER, COURSE) values (?, ?)";

// Get a PreparedStatement instance from Connection, passing it the query
PreparedStatement pstmt = conn.prepareStatement(query);

// Create a multidimensional array of students to insert into the table
String[][] students = {
    { "Alice", "CS520" }, { "Bob", "CS521" }, { "Charlie", "CS522" }
};

// Loop through the students
for (String[] student : students) {
    // Reuse the PreparedStatement by inserting the current values at the placeholder positions
    pstmt.setString(1, student[0]);
    pstmt.setString(2, student[1]);
    pstmt.executeUpdate();
}
