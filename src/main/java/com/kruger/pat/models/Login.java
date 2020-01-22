package com.kruger.pat.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "login")
public class Login implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user", updatable = false, nullable = false)
    String user;
    @Column(name = "pass")
    String pass;

    public Login() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
