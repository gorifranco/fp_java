package databases;

import java.sql.*;

public class proves {

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca?user=java&password=");
             Statement st = con.createStatement();
             PreparedStatement ps = con.prepareStatement("select * from autors where id_aut = ?");
        ) {
            ps.setInt(1, 1);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public proves() throws SQLException {
    }

}
