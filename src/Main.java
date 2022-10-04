import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJonas = new Dev();
        devJonas.setNome("Jonas");
        devJonas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Jonas: " + devJonas.getConteudosInscritos());
        devJonas.progredir();
        devJonas.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Jonas: " + devJonas.getConteudosInscritos());
        System.out.println("Conteudos concluidos Jonas: " + devJonas.getConteudosConcluidos());
        System.out.println("XP: " + devJonas.calcularXp());

        System.out.println("------------------------------");

        Dev devJuca = new Dev();
        devJuca.setNome("Juca");
        devJuca.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Juca: " + devJuca.getConteudosInscritos());
        devJuca.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Juca: " + devJuca.getConteudosInscritos());
        System.out.println("Conteudos concluidos Juca: " + devJuca.getConteudosConcluidos());
        System.out.println("XP: " + devJuca.calcularXp());

    }
}
