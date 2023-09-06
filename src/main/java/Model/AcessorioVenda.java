/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import jakarta.persistence.OneToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
/**
 *
 * @author julianob
 */
@Entity
@Table(name="acessorio_venda")

public class AcessorioVenda implements Serializable{

    @Id
    private int id;

    private int quantidade;

    @OneToOne
    @JoinColumn(name = "venda_id")
    private Venda vendaId;

        
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

    public Venda getVendaId() {
        return vendaId;
    }

    public void setVendaId(Venda vendaId) {
        this.vendaId = vendaId;
    }

    public Acessorios getAcessoriosId() {
        return acessoriosId;
    }

    public void setAcessoriosId(Acessorios acessoriosId) {
        this.acessoriosId = acessoriosId;
    }

 

}
