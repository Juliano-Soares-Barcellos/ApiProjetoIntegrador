/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.apiprojetointegrador.Resourses;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author julianob
 */
public class CargoResourses implements Serializable {

    private static final long serialVersionUID = 1L;
@JsonProperty("id")
private String id;
@JsonProperty("nome")
private String nome;
@JsonProperty("salario")
private String salario;

    public CargoResourses(String id, String nome, String salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "CargoResourses{" + "id=" + id + ", nome=" + nome + ", salario=" + salario + '}';
    }

}
