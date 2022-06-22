package academy.devdojo.maratonajava.javacore.ZZJcrud.repository;


import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJcrud.domain.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class ProducerRepository {

    public static List<Producer> findByName(String name) {
        log.info("Finding producers by name '{}'", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producer ", e);
        }
        return producers;
    }

    private static PreparedStatement createPrepareStatementFindByName(Connection connection, String name) throws SQLException {
        String sql = "select * from producer where name like ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            PreparedStatement ps = createPrepareStatementDelete(conn, id);
            ps.execute();
            log.info("Deleted producer '{}' ", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }

    private static PreparedStatement createPrepareStatementDelete(Connection connection, Integer id) throws SQLException {
        String sql = "delete from producer where(id = ?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Producer producer) {
        log.info("Save producer '{}'", producer);
        try (Connection conn = ConnectionFactory.getConnection()) {
            PreparedStatement ps = preparedStatmentSave(conn,producer);
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to Save producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement preparedStatmentSave(Connection connection, Producer producer) throws SQLException {
        String sql = "insert into producer(name)values (?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }

    public static Optional<Producer> findById(Integer id) {
        log.info("Finding producers by id '{}'", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatmentFindById(conn,id);
             ResultSet rs = ps.executeQuery()){
            if(!rs.next()) return Optional.empty();
                return Optional.of(Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build());


        } catch (SQLException e) {
            log.error("Error while trying to find all producer ", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement preparedStatmentFindById(Connection connection, Integer id) throws SQLException {
        String sql = "select * from producer where id = ?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void update(Producer producer) {
        log.info("Updating producer '{}'",producer);
        try (Connection conn = ConnectionFactory.getConnection()) {
            PreparedStatement ps = preparedStatmentUpdate(conn,producer);
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
        }
    }

    private static PreparedStatement preparedStatmentUpdate(Connection connection, Producer producer) throws SQLException {
        String sql = "update producer set name = ? where id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }

}
