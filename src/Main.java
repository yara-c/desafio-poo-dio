import br.com.dio.desafio.*;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria js");
        mentoria2.setDescricao("descrição mentoria js");
        mentoria2.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria1);
        System.out.println(mentoria2);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("--------");

        Dev devJonas = new Dev();
        devJonas.setNome("Jonas");
        devJonas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jonas" + devJonas.getConteudosInscritos());
        devJonas.progredir();
        devJonas.progredir();
        devJonas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jonas" + devJonas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jonas" + devJonas.getConteudosConcluidos());
        System.out.println("XP: " + devJonas.calcularTotalXp());





    }
}
