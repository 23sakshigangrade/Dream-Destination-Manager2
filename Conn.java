package travel.management.system;

import java.sql.*;  

public class Conn {
    Connection c;
    Statement s;

    public Conn() {  
        try {  
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");  

            // Establish the connection
            c = DriverManager.getConnection("jdbc:mysql:///travel_management_system", "root", "MYSQL@2341sakshi"); 

            // Create a statement
            s = c.createStatement();  
        } catch (Exception e) { 
            // Print the exception
            e.printStackTrace();
        }  
    }

    // Method to get the connection
    public Connection getConnection() {
        return c;
    }
    
    // Method to get the statement
    public Statement getStatement() {
        return s;
    }
}
