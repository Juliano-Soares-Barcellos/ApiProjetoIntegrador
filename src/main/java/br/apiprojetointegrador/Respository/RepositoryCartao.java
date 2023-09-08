/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.apiprojetointegrador.Respository;

import br.apiprojetointegrador.model.Cartao;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author julianob
 */
public interface RepositoryCartao extends JpaRepository<Cartao,Integer>{
 public Optional<Cartao> findById(int id); 
}
