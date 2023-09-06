/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resourseses;

/**
 *
 * @author julianob
 */
import Model.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import java.time.LocalDate;

/**
 *
 * @author julianob
 */
@Entity
public class VendaResourses {

    @JsonProperty("Id")
    private String id;
    @JsonProperty("Data da veda")
    private String data_venda;
    @JsonProperty("Cartao")
    private Cartao cartao;
    @JsonProperty("Pix")
    private Pix pix;
    @JsonProperty("Cliente")
    private Cliente cliente;
    @JsonProperty("Funcionario")
    private Funcionario funcionario;

    public VendaResourses(String id, String data_venda, Cartao cartao, Pix pix, Cliente cliente, Funcionario funcionario) {
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

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public Pix getPix() {
        return pix;
    }

    public void setPix(Pix pix) {
        this.pix = pix;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "VendaResourses{" + "id=" + id + ", data_venda=" + data_venda + ", cartao=" + cartao + ", pix=" + pix + ", cliente=" + cliente + ", funcionario=" + funcionario + '}';
    }


}
