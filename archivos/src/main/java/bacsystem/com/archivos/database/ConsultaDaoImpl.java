package bacsystem.com.archivos.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bacsystem.com.archivos.exception.BaseException;

public class ConsultaDaoImpl implements ConsultaDao {

    @Override
    public List<PersonaDB> listarPersonas() {

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<PersonaDB> response = new ArrayList<>();
        ConnectionDB connectiondb = new ConnectionDB();
        try {
            String query = "SELECT * FROM public.persona";
            connection = connectiondb.getConnection();
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                PersonaDB personaDB = new PersonaDB();
                personaDB.setId(resultSet.getInt(1));
                personaDB.setCodigo(resultSet.getString(2));
                personaDB.setNombres(resultSet.getString(3));
                personaDB.setApellidos(resultSet.getString(4));
                personaDB.setDireccion(resultSet.getString(5));
                response.add(personaDB);
            }

        } catch (BaseException | SQLException e) {
            throw new BaseException(e.getMessage());
        } finally {
            connectiondb.desconectar(connection, statement, resultSet);
        }

        return response;
    }

    @Override
    public String insertarPersona(PersonaDB personaDB) {

        String response = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        ConnectionDB connectiondb = new ConnectionDB();

        try {

            StringBuilder builder = new StringBuilder();
            builder.append("INSERT INTO public.persona ");
            builder.append("(codigo, nombres, apellidos, direccion) ");
            builder.append("VALUES ");
            builder.append("(?,?,?,?)");

            connection = connectiondb.getConnection();
            statement = connection.prepareStatement(builder.toString());
            statement.setString(1, personaDB.getCodigo());
            statement.setString(2, personaDB.getNombres());
            statement.setString(3, personaDB.getApellidos());
            statement.setString(4, personaDB.getDireccion());
            int executeUpdate = statement.executeUpdate();
            if (executeUpdate == 1) {
                response = executeUpdate + " afectadas";
            }

        } catch (BaseException | SQLException e) {
            throw new BaseException(e.getMessage());
        } finally {
            connectiondb.desconectar(connection, statement, resultSet);
        }

        return response;

    }

}
