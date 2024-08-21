package Classe;

public class ObjetoComputador {

	public static void main(String[] args) {
		Computador computador1 = new Computador();

		computador1.setMarca("Dell");
		computador1.setModelo("XPS 13");
		computador1.setCor("Prata");
		computador1.setTeclado("QWERTY");

		System.out.println("Marca: " + computador1.getMarca());
		System.out.println("Modelo: " + computador1.getModelo());
		System.out.println("Cor: " + computador1.getCor());
		System.out.println("Teclado: " + computador1.getTeclado());

		System.out.println(computador1.ligar());
		System.out.println(computador1.carregar());
	}
}
