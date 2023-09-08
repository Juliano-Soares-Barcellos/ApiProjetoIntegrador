/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.apiprojetointegrador.Resourses;

import br.apiprojetointegrador.model.Cargo;
import br.apiprojetointegrador.model.LoginSenha;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.time.LocalDate;

public class FuncionarioResourses implements Serializable{

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private int id;
    @JsonProperty("Status")
    private char status;
    @JsonProperty("Nome")
    private String nome;
    @JsonProperty("Cpf")
    private String cpf;
    @JsonProperty("CEP")
    private String cep;
    @JsonProperty("Nascimento")
    private LocalDate data_nascimento;
    @JsonProperty("Cargo")
    private Cargo cargo;
    @JsonProperty("Login")
    private LoginSenha login_senha;

    public FuncionarioResourses(int id, char status, String nome, String cpf, String cep, LocalDate data_nascimento, Cargo cargo, LoginSenha login_senha) {
        this.id = id;
        this.status = status;
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
        this.data_nascimento = data_nascimento;
        this.cargo = cargo;
        this.login_senha = login_senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public LoginSenha getLogin_senha() {
        return login_senha;
    }

    public void setLogin_senha(LoginSenha login_senha) {
        this.login_senha = login_senha;
    }

    @Override
    public String toString() {
        return "FuncionarioResourses{" + "id=" + id + ", status=" + status + ", nome=" + nome + ", cpf=" + cpf + ", cep=" + cep + ", data_nascimento=" + data_nascimento + ", cargo=" + cargo + ", login_senha=" + login_senha + '}';
    }

    
    
}
