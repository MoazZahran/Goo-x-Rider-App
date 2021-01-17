package com.example.goo_x_rider_app.Model;

public class TokenModel {
    private String Token;

    public TokenModel(String token) {
        Token = token;
    }

    public TokenModel() {
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }
}
