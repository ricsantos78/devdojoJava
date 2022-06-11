package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.domain.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {
    public static void save(Producer producer){
        String sql = "insert into producer(name)"
                + " values ('%s')".formatted(producer.getName());
        try(Connection conn = ConnectionFactory.getConnection()) {
            Statement smt = conn.createStatement();
            int rowsAffcted = smt.executeUpdate(sql);
            System.out.println(rowsAffcted);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
