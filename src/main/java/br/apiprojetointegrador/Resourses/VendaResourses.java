/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.apiprojetointegrador.Resourses;

/**
 *
 * @author julianob
 */
import br.apiprojetointegrador.model.Pix;
import br.apiprojetointegrador.model.Cliente;
import br.apiprojetointegrador.model.Cartao;
import br.apiprojetointegrador.model.Funcionario;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author julianob
 */
public class VendaResourses implements Serializable{

    private static final long serialVersionUID = 1L;

    @JsonProperty("Id")
    private String id;
    @JsonProperty("Data da veda")
    private String data_venda;
    @JsonProperty("Cartao")
    private String cartao;
    @JsonProperty("Pix")
    private String pix;
    @JsonProperty("Cliente")
    private String cliente;
    @JsonProperty("Funcionario")
    private String funcionario;

    public VendaResourses(String id, String data_venda, String cartao, String pix, String cliente, String funcionario) {
        this.id = id;
        this.data_venda = data_venda;
        this.cartao = cartao;
        this.pix = pix;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "VendaResourses{" + "id=" + id + ", data_venda=" + data_venda + ", cartao=" + cartao + ", pix=" + pix + ", cliente=" + cliente + ", funcionario=" + funcionario + '}';
    }


}
