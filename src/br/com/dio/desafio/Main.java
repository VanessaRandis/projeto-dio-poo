package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Java");
		curso1.setDescricao("descrição do curso de java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("Curso js");
		curso2.setDescricao("descrição do cruso js");
		curso2.setCargaHoraria(4);
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("curso c#");
		mentoria1.setDescricao("descrição do curso c#");
		mentoria1.setData(LocalDate.now());
		
		
		Mentoria mentoria2 = new Mentoria();
		
		mentoria2.setTitulo("curso html");
		mentoria2.setDescricao("descrição curso html");
		mentoria2.setData(LocalDate.now());
		

		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		bootcamp.getConteudos().add(mentoria2);
		
		System.out.println("----------");
		
		Dev devvanessa = new Dev();
		
		devvanessa.setNome("Vanessa Randis");
		devvanessa.increverBootcamp(bootcamp);
		System.out.println("Conteúdos incritos Vanessa " + devvanessa.getConteudosInscritos());
		devvanessa.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos Vanessa" + devvanessa.getConteudosInscritos());
		System.out.println("Conteúdos concluidos Vanessa "+devvanessa.getConteudosConcluidos());
		System.out.println("XP: " + devvanessa.calcularTotalXp());
		
		
		System.out.println("-----------");
		
		Dev devethieny = new Dev();
		
		devethieny.setNome("Ethiney");
		devethieny.increverBootcamp(bootcamp);
		System.out.println("Conteúdos incritos" + devethieny.getConteudosInscritos());
		devethieny.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos Ethieny " + devethieny.getConteudosInscritos());
		System.out.println("Conteúdos concluidos " + devvanessa.getConteudosConcluidos());
		System.out.println("XP:" + devethieny.calcularTotalXp());
		
		
	}

}
