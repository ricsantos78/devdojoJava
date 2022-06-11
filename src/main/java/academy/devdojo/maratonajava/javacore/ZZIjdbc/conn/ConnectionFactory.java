package academy.devdojo.maratonajava.javacore.ZZIjdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    //java.sql = Connection, Statment, ResultSet, DriverManeger
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/anime_store";
        String username = "postgres";
        String password = "102030Tjs!";
           return DriverManager.getConnection(url, username, password);
    }
}
