package br.com.pc.dio.desafio.dominio;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super("Cachorro", nome, idade);
    }

    @Override
    public void falar(){
        System.out.println("au au");
    }

}
