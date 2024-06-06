package projetos;

public class ClassesObjetosAtributosCelular {
	
	public class CelularExterno {
	    String marca;
	    String modelo;
	    int capacidadeBateria;
	    double tamanhoTela;

	    CelularExterno(String marca, String modelo, int capacidadeBateria, double tamanhoTela) {
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

	    public static void main(String[] args) {
	        CelularExterno celular = new CelularExterno("Apple", "iPhone 12", 2815, 6.1);
	        celular.exibirAtributos();
	    }
	}
}
