/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.apiprojetointegrador.model;


import jakarta.persistence.OneToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
/**
 *
 * @author julianob
 */
@Entity
@Table(name="acessorio_venda")
public class AcessorioVenda {

    @Id
    private int id;

    private int quantidade;

    @OneToOne
    @JoinColumn(name = "venda_id")
    private Venda venda;

        
    @ManyToOne
    @JoinColumn(name = "acessorios_id")
    private Acessorios acessoriosId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Acessorios getAcessoriosId() {
        return acessoriosId;
    }

    public void setAcessoriosId(Acessorios acessoriosId) {
        this.acessoriosId = acessoriosId;
    }

 

}
