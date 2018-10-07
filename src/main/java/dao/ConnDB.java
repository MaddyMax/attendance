package dao;

import java.sql.*;

public class ConnDB {
    // java -jar h2-1.4.197.jar -webAllowOthers -tcpAllowOthers
    // java -cp h2-1.4.197.jar org.h2.tools.Server -webAllowOthers -tcpAllowOthers
    // jdbc url : jdbc:h2:tcp://192.168.0.106:9092/~/test
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/test";
    static ResultSet resultSet;

    //  Database credentials
    static final String USER = "sa";
    static final String PASS = "";
    public Connection conn = null;
    public Statement stmt = null;

    public void dbConnect(){

        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public ResultSet getAll() throws SQLException {
        String sqlQuery = "SELECT * FROM EMPLOYEE ";
        resultSet = stmt.executeQuery(sqlQuery);
        while (resultSet.next()) {
            System.out.println( resultSet.getString(1) + "\t" +  resultSet.getString(2));
        }
        return resultSet;
    }

    public int setPerson(String empNo, String empSapNo, String empName, String empDesignation, String empDepartment, String empSection) throws SQLException {
        String sqlQuery = "INSERT INTO EMPLOYEE VALUES('"+empNo+"','"+empSapNo+"','"+empDesignation+"','"+empDepartment+"','"+empSection+"','SEC');";
        System.out.println(sqlQuery);
        return (stmt.executeUpdate(sqlQuery));
    }

    public void closeConn() throws SQLException {
        conn.close();
        stmt.close();
    }

    public static void main(String[] args) {
    }
}
