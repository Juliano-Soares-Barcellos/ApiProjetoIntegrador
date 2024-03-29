/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.apiprojetointegrador.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author julianob
 */
@Entity
@Table(name="cartao")
public class Cartao {
     @Id
    private int id;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero_cartao() {
        return numero_cartao;
    }

    public void setNumero_cartao(String numero_cartao) {
        this.numero_cartao = numero_cartao;
    }

    public char getTipo_cartao() {
        return tipo_cartao;
    }

    public void setTipo_cartao(char tipo_cartao) {
        this.tipo_cartao = tipo_cartao;
    }
    private String numero_cartao;
    private char tipo_cartao;
}


