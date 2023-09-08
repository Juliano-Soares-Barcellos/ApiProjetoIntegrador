/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.apiprojetointegrador.Respository;

import br.apiprojetointegrador.model.TelefoneFuncionarios;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author julianob
 */
public interface RepositoryTelefoneFuncionario extends JpaRepository<TelefoneFuncionarios,Integer>{
     public Optional<TelefoneFuncionarios> findById(int id); 
}
