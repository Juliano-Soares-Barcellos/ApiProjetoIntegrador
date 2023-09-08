/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.apiprojetointegrador.Resourses;

import br.apiprojetointegrador.model.Acessorios;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author julianob
 */
public class AcessorioVendaResourses implements Serializable {
   private static final long serialVersionUID = 6030862910379069667L; 
    
    @JsonProperty("id")
    private String id;
    @JsonProperty("quantidade")
    private String quantidade;
    @JsonProperty("Venda_Id")
    private String vendaId;
    @JsonProperty("acessorios_id")
    private String acessoriosId;

    
    public AcessorioVendaResourses(String id, String quantidade, String vendaId, String acessoriosId) {
        this.id = id;
        this.quantidade = quantidade;
        this.vendaId = vendaId;
        this.acessoriosId = acessoriosId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getVendaId() {
        return vendaId;
    }

    public void setVendaId(String vendaId) {
        this.vendaId = vendaId;
    }

    public String getAcessoriosId() {
        return acessoriosId;
    }

    public void setAcessoriosId(String acessoriosId) {
        this.acessoriosId = acessoriosId;
    }

    @Override
    public String toString() {
        return "AcessorioVendaResourses{" + "id=" + id + ", quantidade=" + quantidade + ", vendaId=" + vendaId + ", acessoriosId=" + acessoriosId + '}';
    }

}
