package com.github.youssfbr;

import com.github.youssfbr.desafio.domain.Curso;
import com.github.youssfbr.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        final Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(80);

        final Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("Descrição do curso de JS");
        curso2.setCargaHoraria(40);

        System.out.println(curso1);
        System.out.println(curso2);

        final Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição de Mentoria de Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}
