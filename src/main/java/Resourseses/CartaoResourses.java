/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resourseses;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author julianob
 */
public class CartaoResourses {

    @JsonProperty("Id")
    private String id;
    @JsonProperty("Numero")
    private String numero_cartao;
    @JsonProperty("Tipo_Cartao")
    private String tipo_cartao;

    public CartaoResourses(String id, String numero_cartao, String tipo_cartao) {
        this.id = id;
        this.numero_cartao = numero_cartao;
        this.tipo_cartao = tipo_cartao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumero_cartao() {
        return numero_cartao;
    }

    public void setNumero_cartao(String numero_cartao) {
        this.numero_cartao = numero_cartao;
    }

    public String getTipo_cartao() {
        return tipo_cartao;
    }

    public void setTipo_cartao(String tipo_cartao) {
        this.tipo_cartao = tipo_cartao;
    }

    @Override
    public String toString() {
        return "CartaoResourses{" + "id=" + id + ", numero_cartao=" + numero_cartao + ", tipo_cartao=" + tipo_cartao + '}';
    }



}
