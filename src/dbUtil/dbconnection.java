package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnection {
    private static final String SQCONN = "jdbc : sqlite : school sqlite";


    public static Connection getConnection() throws SQLException {
        try{
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(SQCONN)
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
            if (this.connection == null) {
            e.printStackTrace();
        }
        return null;
    }


}//class
