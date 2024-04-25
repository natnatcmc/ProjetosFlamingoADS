package projeto1_CadastrodeAlunos;

public class Aluno {

	private String nome;

	private String id;
	
	private int idade;

	private double nota;



	public Aluno(String nome, String id2, int idade, double nota) {

	this.nome = nome;
	
	this.id = id2;

	this.idade = idade;

	this.nota = nota;
	

	}



	public String getNome() {

	return nome;

	}

	public String getId() {

		return id;

		}


	public int getIdade() {

	return idade;

	}



	public double getNota() {

	return nota;

	}



	@Override

	public String toString() {

	return "Aluno{" + "nome='" + nome + '\'' + "id=" + id + ", idade=" + idade + ", nota=" + nota + '}';

	}

	
}
