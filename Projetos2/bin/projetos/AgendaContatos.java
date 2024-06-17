package projetos;

import java.util.ArrayList;
import java.util.Scanner;

class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

public class AgendaContatos {
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Mostrar todos os contatos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (opcao) {
                case 1:
                    adicionarContato(scanner, contatos);
                    break;
                case 2:
                    mostrarContatos(contatos);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void adicionarContato(Scanner scanner, ArrayList<Contato> contatos) {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite o email do contato: ");
        String email = scanner.nextLine();

        Contato contato = new Contato(nome, telefone, email);
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    private static void mostrarContatos(ArrayList<Contato> contatos) {
        System.out.println("Contatos:");
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}
