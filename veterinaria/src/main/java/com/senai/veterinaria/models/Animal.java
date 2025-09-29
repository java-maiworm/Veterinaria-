package com.senai.veterinaria.models;

public class Animal {
    private Long id;
    private int idConta;
    private String nome;
    private String especie;
    private int idade;
    private String raca;
    private int idHistorico;

    public Animal() {}

    public Animal( int idConta, String nome, 
    String especie, int idade, String raca,
    int idHistorico){
        this.idConta = idConta;
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.raca = raca;
        this.idHistorico = idHistorico;
    }
    //Source actions parou de funcionar

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdHistorico() {
        return idHistorico;
    }

    public void setIdHistorico(int idHistorico) {
        this.idHistorico = idHistorico;
    }
    

}

