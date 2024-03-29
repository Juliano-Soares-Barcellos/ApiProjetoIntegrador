package br.apiprojetointegrador.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Classe que representa um telefone associado a um funcionário.
 * Esta classe é uma entidade JPA e pode ser mapeada para uma tabela em um banco de dados.
 */
@Entity
@Table(name="telefone_funcionario")
public class TelefoneFuncionarios {

    /**
     * Identificador único do telefone do funcionário.
     */
    @Id
    private long id;

    /**
     * Número de telefone celular do funcionário.
     */
    private String celular;

    /**
     * Funcionário associado ao telefone.
     */
    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionarios;

    /**
     * Obtém o identificador único do telefone do funcionário.
     *
     * @return O identificador único do telefone do funcionário.
     */
    public long getId() {
        return id;
    }

    /**
     * Define o identificador único do telefone do funcionário.
     *
     * @param id O identificador único do telefone do funcionário a ser definido.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Obtém o número de telefone celular do funcionário.
     *
     * @return O número de telefone celular do funcionário.
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Define o número de telefone celular do funcionário.
     *
     * @param celular O número de telefone celular do funcionário a ser definido.
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * Obtém o funcionário associado ao telefone.
     *
     * @return O funcionário associado ao telefone.
     */
    public Funcionario getFuncionarios() {
        return funcionarios;
    }

    /**
     * Define o funcionário associado ao telefone.
     *
     * @param funcionario O funcionário associado ao telefone a ser definido.
     */
    public void setFuncionarios(Funcionario funcionario) {
        this.funcionarios = funcionario;
    }
}
