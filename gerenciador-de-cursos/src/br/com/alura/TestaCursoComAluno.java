package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adicionarAula(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adicionarAula(new Aula("Criando Uma Aula", 20));
		javaColecoes.adicionarAula(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17654);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Todos os Alunos matriculados: ");

		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterator = alunos.iterator();
		while (iterator.hasNext()) {
			Aluno proximo = iterator.next();
			System.out.println(proximo);
		}

//		Vector<Aluno> vetor = new Vector<>();

//		for(Aluno a : javaColecoes.getAlunos()) {
//			System.out.println(a);
//		}

		System.out.println("O Aluno está matriculado? " + javaColecoes.estaMatriculado(a1));

		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println(javaColecoes.estaMatriculado(turini));

		System.out.println("O a1 é equals ao Turini? ");
		System.out.println(a1.equals(turini));

		// Obrigatoriamente o seguinte é True:

		System.out.println(a1.hashCode() == turini.hashCode());

	}

}
