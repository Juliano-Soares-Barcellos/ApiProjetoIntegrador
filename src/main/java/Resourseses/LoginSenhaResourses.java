/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resourseses;

import Model.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author julianob
 */
@Entity
public class LoginSenhaResourses {

    @JsonProperty("Id")
    private String id;
    @JsonProperty("login")
    private String login;
    @JsonProperty("senha")
    private String senha;

    public LoginSenhaResourses(String id, String login, String senha) {
        this.id = id;
        this.login = login;
        this.senha = senha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "LoginSenhaResourses{" + "id=" + id + ", login=" + login + ", senha=" + senha + '}';
    }

}
