package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DBService {
    private static final String url = "jdbc:mysql://localhost:3306/users";;
    private static final String user = "root";
    private static final String password = "root";
    private static Connection myConnection = null;

    public static Connection getConnection() {
        if (myConnection == null) {
            try {
                myConnection = DriverManager.getConnection(url, user, password);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return myConnection;
    }


}
