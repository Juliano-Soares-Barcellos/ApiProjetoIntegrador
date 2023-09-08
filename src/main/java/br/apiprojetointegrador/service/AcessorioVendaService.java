/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.apiprojetointegrador.service;

import br.apiprojetointegrador.model.AcessorioVenda;
import br.apiprojetointegrador.Respository.RepositoryAcessorioVenda;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author julianob
 */
@Service
public class AcessorioVendaService {

    private final RepositoryAcessorioVenda repositoryAcessorioVenda;
    private final EntityManager entityManager;

    public AcessorioVendaService(RepositoryAcessorioVenda repositoryAcessorioVenda, EntityManager entityManager) {
        this.repositoryAcessorioVenda = repositoryAcessorioVenda;
        this.entityManager = entityManager;
    }

    public List<AcessorioVenda> getAllAcessoriosVenda() {
        System.out.println("   Testeeeee");
        return repositoryAcessorioVenda.findAll();
    }

    public Optional<AcessorioVenda> getAcessorioVendaById(int id) {
        System.out.println("    Teste");
        return repositoryAcessorioVenda.findById(id);
    }

    public List<AcessorioVenda> teste() {
        String sql = "Select * from acessorio_venda";
        Query query = entityManager.createNativeQuery(sql);

        return query.getResultList();
    }
}
