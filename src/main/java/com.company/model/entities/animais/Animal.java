package com.company.model.entities.animais;

public class Animal implements IAnimal{
    String nome;
    String porte;

    public String getNome() {return this.nome;}
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getporte() {return this.porte;}
    public void setporte(String nome){
        this.nome = porte;
    }

    @Override
    public void come() {
        System.out.println("animal comendo");
    }

    @Override
    public void anda() {
        System.out.println("animal andando");

    }
}
