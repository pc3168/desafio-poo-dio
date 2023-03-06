

import com.dio.desafio.dominio.Bootcamp;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Dev;
import com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        String SAVIO = "SAVIO";
        String PAULO = "PAULO";

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPaulo = new Dev();
        devPaulo.setNome(PAULO);
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.printf("Conteúdos Inscritos %s , %s: \n", PAULO , devPaulo.getConteudosInscritos());
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("-");
        System.out.printf("Conteúdos Inscritos %s , %s:\n" , PAULO , devPaulo.getConteudosInscritos());
        System.out.printf("Conteúdos Concluídos %s , %s:\n" , PAULO , devPaulo.getConteudosConcluidos());
        System.out.printf("XP: %f \n", devPaulo.calcularTotalXp());

        System.out.println("----------------------------------------------");

        Dev devSavio = new Dev();
        devSavio.setNome(SAVIO);
        devSavio.inscreverBootcamp(bootcamp);
        System.out.printf("Conteúdos Inscritos %s , %s :\n", SAVIO, devSavio.getConteudosInscritos());
        devSavio.progredir();
        devSavio.progredir();
        devSavio.progredir();
        System.out.println("-");
        System.out.printf("Conteúdos Inscritos %s , %s: \n" , SAVIO, devSavio.getConteudosInscritos());
        System.out.printf("Conteúdos Concluidos %s , %s: \n" , SAVIO,devSavio.getConteudosConcluidos());
        System.out.printf("XP: %f \n" , devSavio.calcularTotalXp());

    }

}
