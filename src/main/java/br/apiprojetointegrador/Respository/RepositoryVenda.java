/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.apiprojetointegrador.Respository;

import br.apiprojetointegrador.model.Venda;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author julianob
 */
public interface RepositoryVenda extends JpaRepository<Venda,Integer>{
     public Optional<Venda> findById(int id); 
}
