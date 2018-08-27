package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLUsersDao implements Users {

    private Connection connection;

    public MySQLUsersDao(Config config){
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error with MySQLUsersDao", e);
        }

    }

    @Override
    public Long insert(User user) {

        try {
            PreparedStatement ps = connection.prepareStatement(createUserInsertQuery(user), Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ResultSet rs = ps.getGeneratedKeys();

            rs.next();
            return rs.getLong(1);

        } catch (SQLException e) {
            throw new RuntimeException("ERROR @ insert method", e);
        }
    }

    private String createUserInsertQuery(User user) {
        String insertQuery = "INSERT INTO users(username, email, password) VALUES(?, ?, ?)";
        return insertQuery;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }


    private User extractUser(ResultSet rs) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
        );
    }

    private List<User> createUserFromResults(ResultSet rs) throws SQLException {
        List<User> users = new ArrayList<>();

        while (rs.next()) {
            users.add(extractUser(rs));
        }
        return users;
    }


    public boolean isValidAccount (User user){

        try {
            PreparedStatement ps = connection.prepareStatement(verifyUserQuery(user));
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ResultSet rs = ps.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error at isValidAccount method", e);
        }
    }

    private String verifyUserQuery (User user ) {
        String searchQuery = "SELECT * FROM users WHERE username = ? AND password = ? ";
        return searchQuery;
    }

// ====== Main Method For Test ====== \\
//    public static void main(String[] args) {
//
//        Config config = new Config();
//        MySQLUsersDao usersDao = new MySQLUsersDao(config);
//
//        User testUser2 = new User( "bobby", "bhhs@codeup.com", "codeup" );
//        long getLastID = usersDao.insert(testUser2);
//
//        System.out.println(getLastID);
//
//
//    }

}
