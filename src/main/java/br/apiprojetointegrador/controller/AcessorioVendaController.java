/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.apiprojetointegrador.controller;

import br.apiprojetointegrador.model.AcessorioVenda;
import br.apiprojetointegrador.service.AcessorioVendaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/**
 *
 * @author julianob
 */
@RestController
@RequestMapping(value = "/a")
public class AcessorioVendaController {

    private final AcessorioVendaService acessorioVendaService ;

    public AcessorioVendaController(AcessorioVendaService acessorioVendaService) {
        this.acessorioVendaService = acessorioVendaService;
    }

     @GetMapping("/teste")
     public List<AcessorioVenda>Teste(){
         System.out.println("---------------------    PASSEI AQUI ----------------------------------------");
   return acessorioVendaService.teste();
     }  
   
    
    @GetMapping("/x")
    public List<AcessorioVenda> getAllAcessoriosVenda() {
        System.out.println("---------------------    PASSEI AQUI ----------------------------------------");
        return acessorioVendaService.getAllAcessoriosVenda();
    }

}
