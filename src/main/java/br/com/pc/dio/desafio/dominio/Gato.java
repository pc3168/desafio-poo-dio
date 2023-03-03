package br.com.pc.dio.desafio.dominio;

import java.time.LocalDate;

public class Gato {

    private String nome;
    private int idade;

    public Gato() {
    }

    public Gato(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void falar(){
        System.out.println("miau");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
