package Classe;

public class ObjetoCadeira {

	public static void main(String[] args) {
		Cadeira cadeira1 = new Cadeira();
		Cadeira cadeira2 = new Cadeira();

		//CADEIRA 1
		cadeira1.setModelo("Ergonômica");
		cadeira1.setTipo("Gamer");
		cadeira1.setMaterial("Couro");
		cadeira1.setCor("Preto");

		System.out.println("----- CADEIRA -----");
		System.out.println("Modelo: " + cadeira1.getModelo());
		System.out.println("Tipo: " + cadeira1.getTipo());
		System.out.println("Material: " + cadeira1.getMaterial());
		System.out.println("Cor: " + cadeira1.getCor());
		System.out.println(cadeira1.girar());

		//CADEIRA 2
		cadeira2.setModelo("Executiva");
		cadeira2.setTipo("Escritório");
		cadeira2.setMaterial("Tecido");
		cadeira2.setCor("Cinza");

		System.out.println("----- CADEIRA -----");
		System.out.println("Modelo: " + cadeira2.getModelo());
		System.out.println("Tipo: " + cadeira2.getTipo());
		System.out.println("Material: " + cadeira2.getMaterial());
		System.out.println("Cor: " + cadeira2.getCor());
		System.out.println(cadeira1.ajustar());

	}
}
