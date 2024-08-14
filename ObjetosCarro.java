package Classe;

public class ObjetosCarro {

	public static void main(String[] args) {
		 // Criando objetos da classe Carro
        Carro carro1 = new Carro();

        // OBJETO 1
        carro1.setMarca("Toyota");
        carro1.setModelo("Corolla");
        carro1.setAno(2020);
        carro1.setCor("Preto");

        // Chamando o método get() para apresentar os objetos
        System.out.println("----- OBJETO 1 -----");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano: " + carro1.getAno());
        System.out.println("Cor: " + carro1.getCor());

    }
}
