package com.company.model.entities.pessoa;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "pessoa")
public class Pessoa implements IPessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NotEmpty(message = "o nome nao pode ser vazio")
    String nome;

    @NotEmpty(message = "o genero nao pode ser vazio")
    @Column(name = "genereo")
    String genero;

    @Override
    public void fala() {
        System.out.println("Pessoa falando...");
    }

    @Override
    public void anda() {
        System.out.println("Pessoa andando...");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

}



