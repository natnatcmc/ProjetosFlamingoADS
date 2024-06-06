package projetos;

public class ClassesObjetosAtributos {

    static class Celular {
        String marca;
        String modelo;
        int capacidadeBateria;
        double tamanhoTela;

        Celular(String marca, String modelo, int capacidadeBateria, double tamanhoTela) {
            this.marca = marca;
            this.modelo = modelo;
            this.capacidadeBateria = capacidadeBateria;
            this.tamanhoTela = tamanhoTela;
        }

        void exibirAtributos() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Capacidade da Bateria: " + capacidadeBateria + "mAh");
            System.out.println("Tamanho da Tela: " + tamanhoTela + " polegadas");
        }
    }

    public static void main(String[] args) {
        Celular celular = new Celular("Samsung", "Galaxy S21", 4000, 6.2);
        celular.exibirAtributos();
    }
    
    /*AGORA MAIS UM - Computador*/
    
}
