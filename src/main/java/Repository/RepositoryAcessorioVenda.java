/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.AcessorioVenda;
import Model.Acessorios;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author julianob
 */
public interface RepositoryAcessorioVenda extends JpaRepository<AcessorioVenda,Integer> {
   public Optional<AcessorioVenda> findById(int id); 
}
