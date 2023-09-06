/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.Acessorios;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author julianob
 */
public interface RespositoryAcessorio extends JpaRepository<Acessorios,Integer> {
     public Optional<Acessorios> findById(int id); 
}
