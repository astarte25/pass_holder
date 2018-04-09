package com.github.astarte25.model;


public class PasswordEntry {

    private int id;
    private String serviceName;
    private String login;
    private char[] password;

    public int getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getLogin() {
        return login;
    }

    public char[] getPassword() {
        return password;
    }

}
