/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.apiprojetointegrador.Resourses;

import br.apiprojetointegrador.model.Cliente;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;

/**
 *
 * @author julianob
 */
public class TelefoneClienteResourses implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("Id")
    private long id;
    @JsonProperty("celular")
    private String celular;
    @JsonProperty("Cliente")
    private Cliente cliente;

    public TelefoneClienteResourses(long id, String celular, Cliente cliente) {
        this.id = id;
        this.celular = celular;
        this.cliente = cliente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "TelefoneClienteResourses{" + "id=" + id + ", celular=" + celular + ", cliente=" + cliente + '}';
    }

}
