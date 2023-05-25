package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class proves {

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca?user=java&password=");
            Statement st = con.createStatement();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public proves() throws SQLException {
    }
}
