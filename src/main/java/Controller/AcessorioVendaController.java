/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AcessorioVenda;
import Service.AcessorioVendaService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/**
 *
 * @author julianob
 */
@RestController
@RequestMapping(value = "/acessoriovenda")
public class AcessorioVendaController {

    private final AcessorioVendaService acessorioVendaService ;
    @Autowired
    public AcessorioVendaController(AcessorioVendaService acessorioVendaService) {
        this.acessorioVendaService = acessorioVendaService;
    }

     @GetMapping("/teste")
     public List<AcessorioVenda>Teste(){
   return acessorioVendaService.teste();
     }  
   
    
    @GetMapping("/")
    public List<AcessorioVenda> getAllAcessoriosVenda() {
        System.out.println("---------------------    PASSEI AQUI ----------------------------------------");
        return acessorioVendaService.getAllAcessoriosVenda();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AcessorioVenda> getAcessorioVendaById(@PathVariable int id) {
        Optional<AcessorioVenda> acessorioVenda = acessorioVendaService.getAcessorioVendaById(id);
        System.out.println("Passei AQUI----------------------");
        if (acessorioVenda.isPresent()) {
            return ResponseEntity.ok(acessorioVenda.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }   
}
