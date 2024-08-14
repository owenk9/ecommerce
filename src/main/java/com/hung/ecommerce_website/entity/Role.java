package com.hung.ecommerce_website.entity;

import lombok.Data;

public enum Role {
    EMPLOYEE, ADMIN;
    public String getRoleName() {
        return this.name();
    }

}
