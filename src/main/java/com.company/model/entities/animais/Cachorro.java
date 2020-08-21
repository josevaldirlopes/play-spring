package com.company.model.entities.animais;

public class Cachorro extends Animal {
    public Cachorro(String nome, String porte) {
        this.nome = nome;
        this.porte = porte;

        System.out.println(this.nome + "  " + this.porte);
    }

 }
