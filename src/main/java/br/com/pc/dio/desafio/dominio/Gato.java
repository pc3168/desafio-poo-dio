package br.com.pc.dio.desafio.dominio;

import java.time.LocalDate;

public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super("Gato", nome, idade);
    }

    @Override
    public void falar(){
        System.out.println("miau");
    }

}
