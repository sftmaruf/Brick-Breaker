package brick._breaker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbms_Connector {

    private static Connection connection = null;
    
    private static Dbms_Connector databaseConnection = new Dbms_Connector();
    
    //using singleton
    public Dbms_Connector() {}
    
    public static Dbms_Connector getDatabase() {
    	return databaseConnection;
    }
    

    public Connection databaseConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String ConnectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Brick_Breaker_Eclipse;user=shafayet;password=2668";

            connection = DriverManager.getConnection(ConnectionURL);

            if (connection != null) {
                return connection;
            } else {
                return null;
            }
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }
}
