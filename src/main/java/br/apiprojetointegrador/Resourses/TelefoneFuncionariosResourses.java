package br.apiprojetointegrador.Resourses;

import br.apiprojetointegrador.model.Funcionario;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;

public class TelefoneFuncionariosResourses implements Serializable{

    private static final long serialVersionUID = 1L;

    @JsonProperty("Id")
    private String id;
    @JsonProperty("Celular")
    private String celular;
    @JsonProperty("Funcionario")
    private Funcionario funcionarios;

    public TelefoneFuncionariosResourses(String id, String celular, Funcionario funcionarios) {
        this.id = id;
        this.celular = celular;
        this.funcionarios = funcionarios;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Funcionario getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "TelefoneFuncionariosResourses{" + "id=" + id + ", celular=" + celular + ", funcionarios=" + funcionarios + '}';
    }

}
