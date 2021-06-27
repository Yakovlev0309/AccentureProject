package repository;
import java.sql.*;

public class Database {
    public static final String DB_URL = "jdbc:h2:./db/stockExchange";
    public static final String DB_Driver = "org.h2.Driver";

    public Database() throws ClassNotFoundException{
        Class.forName(DB_Driver);
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }

}
