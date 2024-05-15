package com.github.youssfbr;

import com.github.youssfbr.desafio.domain.Bootcamp;
import com.github.youssfbr.desafio.domain.Curso;
import com.github.youssfbr.desafio.domain.Dev;
import com.github.youssfbr.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        final Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        final Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("Descrição do curso de JS");
        curso2.setCargaHoraria(4);

//        System.out.println(curso1);
//        System.out.println(curso2);

        final Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição de Mentoria de Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(mentoria1);

        final Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        final Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosIncritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularXP());

        System.out.println("------------------------------------------------------");

        final Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joao: " + devJoao.getConteudosIncritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Inscritos Joao: " + devJoao.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularXP());


    }
}
