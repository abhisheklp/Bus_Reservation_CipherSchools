package DBCONNECT;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {

        Connection connection=null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cipherjavaone","postgres","12345678");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into student values(?,?,?,?)");
            preparedStatement.setInt(1,4);
            preparedStatement.setInt(2,21);
            preparedStatement.setString(3,"Ajay");
            preparedStatement.setString(4,"Uttar Pradesh");
            preparedStatement.executeUpdate();
            //Statement statement = connection.createStatement();
            //int i = statement.executeUpdate("delete from student where roll_no=3"); // for insert update delete
            //System.out.println(i);
//            ResultSet resultSet = statement.executeQuery("select * from student");  // execute query to fetch the result
//            while(resultSet.next()) {
//                System.out.println(resultSet.getInt(1)+" "+resultSet.getInt(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));
//            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
    }
}