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
public class AcessoriosResourses implements Serializable
{

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String Id;
    @JsonProperty("nome")
    private String Nome;
    @JsonProperty("Descricao")
    private String Descricao;
    @JsonProperty("cor")
    private String cor;
    @JsonProperty("Estoque")
    private String estoque;
    @JsonProperty("valor")
    private String valor;

    public AcessoriosResourses(String Id, String Nome, String Descricao, String cor, String estoque, String valor) {
        this.Id = Id;
        this.Nome = Nome;
        this.Descricao = Descricao;
        this.cor = cor;
        this.estoque = estoque;
        this.valor = valor;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "AcessoriosResourses{" + "Id=" + Id + ", Nome=" + Nome + ", Descricao=" + Descricao + ", cor=" + cor + ", estoque=" + estoque + ", valor=" + valor + '}';
    }

}
