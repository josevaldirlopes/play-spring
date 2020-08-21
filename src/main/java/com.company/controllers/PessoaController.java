package com.company.controllers;

import com.company.model.entities.pessoa.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.company.services.PessoaService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/pessoas", produces = MediaType.APPLICATION_JSON_VALUE)
public class PessoaController {

    private PessoaService pessoaService;

    @Autowired
    public PessoaController(PessoaService pessoaService){
        this.pessoaService = pessoaService;
    }


    @PostMapping
    public Pessoa createPessoa(@Valid @RequestBody Pessoa pessoa){
        return pessoaService.createPessoa(pessoa);
    }

    @GetMapping
    public List<Pessoa> finfAllPessoa(){
        return pessoaService.ListPessoas();
    }

}
