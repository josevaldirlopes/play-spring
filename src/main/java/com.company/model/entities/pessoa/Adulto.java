package com.company.model.entities.pessoa;

public class Adulto extends Pessoa {
    public Adulto(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }

    public void trabalha(){
        System.out.println(nome + " Pessoa Adulto trabalhando...");
    }

    @Override
    public void fala() {
        System.out.println("Fala grosso...");

    }
}
