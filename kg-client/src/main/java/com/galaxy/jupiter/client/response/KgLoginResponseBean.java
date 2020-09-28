package com.galaxy.jupiter.client.response;

import java.io.Serializable;

public class KgLoginResponseBean implements Serializable {
    private String token;
    private Boolean isMultiOrg;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getMultiOrg() {
        return isMultiOrg;
    }

    public void setMultiOrg(Boolean multiOrg) {
        isMultiOrg = multiOrg;
    }
}
