package JDBC;

import Exceptions.DateException;
import Exceptions.GenderException;

import java.sql.*;

public class DbUtil {
    final String url = "jdbc:mysql://localhost:3306";
    final String user = "root";
    final String password = "roseann";

    String createDatabase = "create database if not exists studentmanagement";
    String useDatabase = "use studentmanagement";
    String CreateTable = "create table if not exists records(name varchar(50),registrationnumber varchar(17)," +
            "dateofbirth date ,course varchar(20),dateofadmission date, gender varchar(6)," +
            "primary key(registrationnumber))";

    private Connection connection;
    private Statement statement;



    public DbUtil() throws ClassNotFoundException, SQLException, GenderException, DateException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection=DriverManager.getConnection(url, user, password);
        writeData(createDatabase);
        writeData(useDatabase);
        writeData(CreateTable);
    }

    @Override
    protected void finalize() throws Throwable {
        connectionClosed();
        super.finalize();
    }

    public  ResultSet readData(String query) throws SQLException {
        statement=connection.createStatement();
        return statement.executeQuery(query);
    }

    public int writeData(String query) throws SQLException {
        statement=connection.createStatement();
        return statement.executeUpdate(query);
    }

    public Connection writeDataFromObject() throws SQLException {
        return connection;
    }

    /*public ResultSet searchrecord(String query) throws SQLException {
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setString(1,searchedString);
        return preparedStatement.executeQuery();

    }
*/

    public void connectionClosed() throws SQLException {
        statement.close();
        connection.close();
    }


}
