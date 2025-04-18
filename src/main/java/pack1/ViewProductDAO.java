package pack1;


import java.sql.*;
import java.util.*;

public class ViewProductDAO {
    public static List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/electronic_store", "root", "your_password");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Product");

            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setBrand(rs.getString("brand"));
                p.setPrice(rs.getDouble("price"));
                p.setDescription(rs.getString("description"));
                products.add(p);
            }
            con.close();
        } catch (Exception e) { e.printStackTrace(); }
        return products;
    }
}
