/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.apiprojetointegrador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author julianob
 */
@SpringBootApplication
@ComponentScan(basePackages = "br.apiprojetointegrador") 
public class ApiProjetoIntegrador {
    public static void main(String[] args) {
        
        System.setProperty("server.port", "7217");
        SpringApplication.run(ApiProjetoIntegrador.class, args);
    }
}
