package com.example.controle_de_pessoas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controle_de_pessoas.model.Pessoa;


@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

  
    @GetMapping
    public List<Pessoa> obterTodos(){

        Pessoa p1 = new Pessoa();
        p1.setNome("Felipe");
        p1.setEmail("felipe@mail.com");

        Pessoa p2 = new Pessoa();
        p2.setNome("Ang");
        p2.setEmail("ang@mail.com");


        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(p1);
        pessoas.add(p2);

        return pessoas;
    }


   
    
}
