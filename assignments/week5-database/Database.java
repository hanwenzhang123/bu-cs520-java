package cs520.hw5;

import java.util.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;  //extra credit
import java.sql.DriverManager;

public class Database {

    // Define private static final variables
    private static final String URL = "jdbc:mysql://metcs520.mysql.database.azure.com:3306/hzhang8";
    private static final String USERNAME = "hzhang8@metcs520";
    private static final String PASSWORD = "metcs520";

    public static void insertPlayers(Collection<Player> players) throws DatabaseException {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{
            // Connect to database
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // Loop through all players
            Iterator<Player> iter = players.iterator();
            while (iter.hasNext()) {
                Player currentPlayer = iter.next();

                //SQL DELETE
                String query = "delete from PLAYERS (NUMBER) where number = (?)";
                // Run the command
                pstmt = conn.prepareStatement(query);

                //SQL INSERT
                query = "insert into PLAYERS (NUMBER, NAME, POSITION, YEAR) values (?, ?, ?, ?)";
                // Run the command
                pstmt = conn.prepareStatement(query);

                //print to the console
                System.out.println("Inserting player into database: " + currentPlayer);

            }

        } catch (Exception e) {
            throw new DatabaseException();
        } finally {
            try {
                // Close the PrepareStatement if it is not null
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
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

    public static Map<String, Player> selectPlayers() throws DatabaseException{
        Map<String, Player> players = new HashMap<>();

        Connection conn = null;
        Statement stmt = null;

        try{
            // Connect to database
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            // Create s Statement
            stmt = conn.createStatement();

            //SELECT for all rows and columns
            String readQuery = "select * from PLAYERS";
            ResultSet rs = stmt.executeQuery(readQuery);

            while (rs.next()) {
                Player player = new Player ();

                player.setNumber(rs.getInt("NUMBER"));
                player.setName(rs.getString("NAME"));
                player.setPosition(rs.getString("POSITION"));
                player.setYear(rs.getString("YEAR"));

                players.put(player.getName(), player);
            }

            rs.close();

            return players;

        } catch (Exception e) {
            throw new DatabaseException();
        } finally {
            try {
                // Close the statement if it is not null
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
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

/* Original Statement  - without extra credit

    public static void insertPlayers(Collection<Player> players) throws DatabaseException {
        Connection conn = null;
        Statement stmt = null;

        try{
            // Connect to database
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            // Create s Statement
            stmt = conn.createStatement();

            // Loop through all players
            Iterator<Player> iter = players.iterator();
            while (iter.hasNext()) {
                Player currentPlayer = iter.next();

                //SQL DELETE
                String query = String.format("delete from PLAYERS where number = %d", currentPlayer.getNumber());
                // Run the command
                stmt.executeUpdate(query);

                //SQL INSERT
                query = String.format("insert into PLAYERS values (%d, '%s', '%s', '%s')",
                        currentPlayer.getNumber(), currentPlayer.getName(),
                        currentPlayer.getPosition(), currentPlayer.getYear());
                // Run the command
                stmt.executeUpdate(query);

                //print to the console
                System.out.println("Inserting player into database: " + currentPlayer);

            }

        } catch (Exception e) {
            throw new DatabaseException();
        } finally {
            try {
                // Close the statement if it is not null
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
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
 */