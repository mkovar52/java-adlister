import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao(Config config) {

        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error with MySQLAdsDao Driver");
        }

    }

    public MySQLAdsDao() {
// == default constructor == \\
    }

    // ================= Methods ================= \\
    @Override
    public List<Ad> all() {

        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM ads";
            ResultSet rs = statement.executeQuery(query);
            return listAllAds(rs);

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error with List All Ads Method");
        }
    }

    // === Helper Method for all(); == \\
    private List<Ad> listAllAds(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(new Ad(
                    rs.getLong("id"),
                    rs.getLong("user_id"),
                    rs.getString("title"),
                    rs.getString("description")
            ));
        }
        return ads;
    }

//  ====  Insert New Ad === \\
    @Override
    public Long insert(Ad ad) {

        try {
            Statement statement = connection.createStatement();
            String insertQuery = String.format("INSERT INTO ads (user_id, title, description) VALUES ('%d', '%s', '%s')",
                    ad.getUserId(),
                    ad.getTitle(),
                    ad.getDescription()
                    );
            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("error with insert method");
        }
    }




}
