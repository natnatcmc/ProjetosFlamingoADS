package projeto2_AgendadeContatos;
import java.util.ArrayList;
import java.util.Scanner;


public class AgendaContatos {
	
	public static void main(String[] args) {
		
	ArrayList<Contatos> contatos = new ArrayList<>();

	Scanner scanner = new Scanner(System.in);



	while (true) {

	System.out.println("Menu:");

	System.out.println("1. Adicionar contato");

	System.out.println("2. Mostrar todos os contatos");

	System.out.println("3. Sair");

	System.out.print("Escolha uma opção: ");

	int opcao = scanner.nextInt();



	if (opcao == 1) {

	System.out.print("Digite o nome do contato: ");

	String nome = scanner.next();

	System.out.print("Digite o telefone do contato: ");

	String telefone = scanner.next();

	System.out.print("Digite o email do contato: ");

	String email = scanner.next();



	Contatos contato = new Contatos(nome, telefone, email);

	contatos.add(contato);

	System.out.println("Contato adicionado com sucesso!");

	} else if (opcao == 2) {

	System.out.println("Contatos:");

	for (Contatos contato : contatos) {

	System.out.println(contato);

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



