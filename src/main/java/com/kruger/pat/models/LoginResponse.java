package com.kruger.pat.models;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {

    @SerializedName("res")
    private Boolean LoginResponse = true;
    @SerializedName("token")
    private String LoginResponseToken = "OK";
    @SerializedName("reason")
    private String LoginResponseReason = "OK";

    public LoginResponse() {
    }

    public Boolean getLoginResponse() {
        return LoginResponse;
    }

    public void setLoginResponse(Boolean loginResponse) {
        LoginResponse = loginResponse;
    }

    public String getLoginResponseToken() {
        return LoginResponseToken;
    }

    public void setLoginResponseToken(String loginResponseToken) {
        LoginResponseToken = loginResponseToken;
    }

    public String getLoginResponseReason() {
        return LoginResponseReason;
    }

    public void setLoginResponseReason(String loginResponseReason) {
        LoginResponseReason = loginResponseReason;
    }
}
