package projetos;

public class ClassesObjetosAtributosBicicleta {
	public class BicicletaExterna {
	    String marca;
	    String modelo;
	    int tamanhoAro;
	    String tipo;

	    BicicletaExterna(String marca, String modelo, int tamanhoAro, String tipo) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.tamanhoAro = tamanhoAro;
	        this.tipo = tipo;
	    }

	    void exibirAtributos() {
	        System.out.println("Marca: " + marca);
	        System.out.println("Modelo: " + modelo);
	        System.out.println("Tamanho do Aro: " + tamanhoAro);
	        System.out.println("Tipo: " + tipo);
	    }

	    public static void main(String[] args) {
	        BicicletaExterna bicicleta = new BicicletaExterna("Specialized", "Rockhopper", 29, "Mountain Bike");
	        bicicleta.exibirAtributos();
	    }
	}
}
