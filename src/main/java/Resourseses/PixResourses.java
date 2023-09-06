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
public class PixResourses {
    @JsonProperty("id")
    private String id;
    @JsonProperty("Nome")
    private String nome;
    @JsonProperty("Chave")
    private String chave;

    public PixResourses(String id, String nome, String chave) {
        this.id = id;
        this.nome = nome;
        this.chave = chave;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    @Override
    public String toString() {
        return "PixResourses{" + "id=" + id + ", nome=" + nome + ", chave=" + chave + '}';
    }
    
    
}
