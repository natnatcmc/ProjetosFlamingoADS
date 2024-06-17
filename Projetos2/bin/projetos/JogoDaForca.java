package projetos;

import java.util.Scanner;
import java.util.HashSet;

public class JogoDaForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] palavras = {"programacao", "java", "computador", "teclado", "internet"};

        String palavra = palavras[(int) (Math.random() * palavras.length)];

        HashSet<Character> letrasAcertadas = new HashSet<>();

        HashSet<Character> letrasErradas = new HashSet<>();

        int tentativas = 6;

        while (tentativas > 0) {
            exibirEstado(palavra, letrasAcertadas);

            System.out.print("Digite uma letra: ");
            char letra = scanner.next().toLowerCase().charAt(0);

            if (letrasAcertadas.contains(letra) || letrasErradas.contains(letra)) {
                System.out.println("Você já tentou essa letra. Tente outra.");
                continue;
            }

            if (palavra.indexOf(letra) >= 0) {
                letrasAcertadas.add(letra);
                System.out.println("Você acertou uma letra!");

                if (verificarVitoria(palavra, letrasAcertadas)) {
                    System.out.println("Parabéns! Você ganhou! A palavra era: " + palavra);
                    break;
                }
            } else {
                letrasErradas.add(letra);
                tentativas--;
                System.out.println("Letra errada! Tentativas restantes: " + tentativas);
            }

            if (tentativas == 0) {
                System.out.println("Você perdeu! A palavra era: " + palavra);
            }
        }

        scanner.close();
    }

    private static void exibirEstado(String palavra, HashSet<Character> letrasAcertadas) {
        for (int i = 0; i < palavra.length(); i++) {
            if (letrasAcertadas.contains(palavra.charAt(i))) {
                System.out.print(palavra.charAt(i) + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }

    private static boolean verificarVitoria(String palavra, HashSet<Character> letrasAcertadas) {
        for (int i = 0; i < palavra.length(); i++) {
            if (!letrasAcertadas.contains(palavra.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
