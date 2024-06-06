package projetos;

import java.util.Scanner;

public class ProjetoCalculadora1 {

    public static double adicionar(double x, double y) {
        return x + y;
    }

    public static double subtrair(double x, double y) {
        return x - y;
    }

    public static double multiplicar(double x, double y) {
        return x * y;
    }

    public static double dividir(double x, double y) {
        if (y == 0) {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN;
        }
        return x / y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione a operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();

            if (escolha == 5) {
                System.out.println("Encerrando a calculadora...");
                break;
            }

            if (escolha >= 1 && escolha <= 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                switch (escolha) {
                    case 1:
                        resultado = adicionar(num1, num2);
                        break;
                    case 2:
                        resultado = subtrair(num1, num2);
                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                        break;
                    case 4:
                        resultado = dividir(num1, num2);
                        break;
                    default:
                        System.out.println("Escolha inválida!");
                        continue;
                }

                System.out.println("O resultado é: " + resultado);
            } else {
                System.out.println("Escolha inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
