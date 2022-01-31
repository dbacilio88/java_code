package bacsystem.com.archivos.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import bacsystem.com.archivos.exception.BaseException;

public class ConnectionDB {

    public ConnectionDB() {

    }

    private Connection conectarDb() {

        Connection connection = null;
        try {
            String url = "jdbc:postgresql://localhost:5432/docker";
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, properties());

        } catch (BaseException | SQLException | ClassNotFoundException e) {
            throw new BaseException(e.getMessage());
        }

        return connection;
    }

    public void desconectar(Connection connection, PreparedStatement statement, ResultSet resultSet) {

        try {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {

                resultSet.close();
            }
            System.out.println("Base de datos desconectado.");
        } catch (SQLException e) {
            throw new BaseException(e.getMessage());
        }
    }

    public Connection getConnection() {
        return this.conectarDb();
    }

    private final Properties properties() {
        Properties properties = new Properties();
        properties.put("user", "postgres");
        properties.put("password", "cbaciliod");
        // properties.put("driver", value)
        return properties;
    }

}
