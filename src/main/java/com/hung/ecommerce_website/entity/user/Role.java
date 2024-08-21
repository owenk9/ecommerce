package com.hung.ecommerce_website.entity.user;

public enum Role {
    EMPLOYEE,USER, ADMIN;
    public String getRoleName() {
        return this.name();
    }

}
