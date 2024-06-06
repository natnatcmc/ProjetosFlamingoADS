package projetos;

public class ClassesObjetosAtributosComputador {

    static class Computador {
        String marca;
        String modelo;
        String processador;
        int ram;

        Computador(String marca, String modelo, String processador, int ram) {
            this.marca = marca;
            this.modelo = modelo;
            this.processador = processador;
            this.ram = ram;
        }

        void exibirAtributos() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Processador: " + processador);
            System.out.println("RAM: " + ram + "GB");
        }
    }

    public static void main(String[] args) {
        Computador computador = new Computador("Dell", "XPS 15", "Intel i7", 16);
        computador.exibirAtributos();
    }
}
