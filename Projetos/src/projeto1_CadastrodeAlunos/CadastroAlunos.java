package projeto1_CadastrodeAlunos;

import java.util.ArrayList;
import java.util.Scanner;



public class CadastroAlunos {

	public static void main(String[] args) {
	
	ArrayList<Aluno> alunos = new ArrayList<>();
	
	Scanner scanner = new Scanner(System.in);
	
	
	
	while (true) {
	
	System.out.println("Menu:");
	
	System.out.println("1. Cadastrar aluno");
	
	System.out.println("2. Mostrar todos os alunos cadastrados");
	
	System.out.println("3. Sair");
	
	System.out.println("");
	
	System.out.print("Escolha uma opção: ");
	
	int opcao = scanner.nextInt();
	


	if (opcao == 1) {
	
	System.out.print("Digite o nome do aluno: ");
	
	String nome = scanner.next();
	
	System.out.print("Digite o id do aluno: ");
	
	String id = scanner.next();
	
	System.out.print("Digite a idade do aluno: ");
	
	int idade = scanner.nextInt();
	
	System.out.print("Digite a nota do aluno: ");
	
	double nota = scanner.nextDouble();
	
	
	
	Aluno aluno = new Aluno( nome,  id, idade, nota);
	
	alunos.add(aluno);
	
	System.out.println("Aluno cadastrado com sucesso!");
	
	} else if (opcao == 2) {
	
	System.out.println("Alunos cadastrados:");
	
	for (Aluno aluno : alunos) {
	
	System.out.println(aluno);
	
	}
	
	} else if (opcao == 3) {
	
	System.out.println("Saindo...");
	
	break;
	
	} else {
	
	System.out.println("Opção inválida. Tente novamente.");

		}

	}

}

}
