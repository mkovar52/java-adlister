package com.codeup.adlister.dao;

public class Config {

    private static String url = "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
    private static String user = "root";
    private static String password = "codeup";


// ====== Getters ====== \\

    public String getUrl() { return url; }

    public String getUser() {return user;}

    public String getPassword() {return password;}


}
