package br.com.alura;

public class TestaBuscaAlunosNoCurso {

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

		System.out.println("Quem é o aluno com a Matricula: 5617");
		Aluno aluno = javaColecoes.buscarMatriculado(5617);
		System.out.println("Aluno: " + aluno);

	}

}
