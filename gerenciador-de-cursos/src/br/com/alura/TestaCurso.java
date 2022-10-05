package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adicionarAula(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adicionarAula(new Aula("Criando Uma Aula", 20));
		javaColecoes.adicionarAula(new Aula("Modelando com coleções", 22));

		List<Aula> aulas = javaColecoes.getAulas();
		aulas.get(1000);

		System.out.println(javaColecoes.getAulas());

	}

}
