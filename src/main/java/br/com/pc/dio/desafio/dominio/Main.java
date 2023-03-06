package br.com.pc.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Animal cachorro1 = new Cachorro("Rex" , 12);
        Animal cachorro2 = new Cachorro("Dog" , 10);

        Animal gato1 = new Gato("Mimi", 5);
        Animal gato2 = new Gato("Bamby", 1);

        System.out.println(cachorro1);
        System.out.println(cachorro2);
        System.out.println(gato1);
        System.out.println(gato2);



    }
}
