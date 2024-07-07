package Programmer.Butocakil.Database.Statement;

import Programmer.Butocakil.Database.DataSource.ConnectionUtil;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest {

    @Test
    void testCreateStatement() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        Statement statement = connection.createStatement();

        statement.close();
        connection.close();
    }

    @Test
    void testExecuteUpdate() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        Statement statement = connection.createStatement();

        String sql = """
        INSERT INTO customers(id, name, email) 
        VALUES ('Audy', 'ARI WIYONO', 'Audy123ari@test.com')
        """;
        int update = statement.executeUpdate(sql);
        System.out.println(update);

        statement.close();
        connection.close();
    }

    @Test
    void testExecuteDelete() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        Statement statement = connection.createStatement();

        String sql = """
        DELETE FROM customers;
        """;
        int update = statement.executeUpdate(sql);
        System.out.println(update);

        statement.close();
        connection.close();
    }

    @Test
    void testExecuteQuery() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        Statement statement = connection.createStatement();

        String sql = """
        SELECT * FROM customers
        """;
        ResultSet resultSet = statement.executeQuery(sql);

        System.out.println(resultSet);

        resultSet.close();
        statement.close();
        connection.close();
    }

    @Test
    void testExecuteQueryy() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        Statement statement = connection.createStatement();

        String sql = "SELECT * FROM customers";
        ResultSet resultSet = statement.executeQuery(sql);

        // Iterasi melalui baris-baris hasil query
        while (resultSet.next()) {
            // Ambil nilai dari setiap kolom
            String id = resultSet.getString("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");

            // Tampilkan data
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println();
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}