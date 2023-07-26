package BackEnd;

import org.testng.annotations.Test;

import java.sql.*;

public class SqlLoad {

    @Test
    //creates connection to SQL database
    public static void main(String[] args) {
        String url = "jdbc:sqlserver:solr\\express;databaseName=Cushon";
        String username = "msi";
        String password = "7994";
        Connection connection;
        {
            try {
                connection = DriverManager.getConnection(url, username, password);

                //chooses the database table
                String sql = "select * FROM [Cushon].[dbo].[Monthly_contribution]";

                Statement statement = connection.createStatement();

                ResultSet result = statement.executeQuery(sql);
                int count = 0;
                //prints what's within the chosen sql table in the database
                while (result.next()) {
                    String name = result.getString("name");
                    int monthlyContAmount = result.getInt("monthlyContAmount");

                    System.out.printf("Student %d: %s - %d\n", count, name, monthlyContAmount);
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
