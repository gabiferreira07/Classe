package Classe;

public class ObjetoAviao {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();

        // OBJETO 1
        aviao1.setCompanhia("Latam");
        aviao1.setCor("Branco");
        aviao1.setVoos(15);
        aviao1.setPassageiros(180);

        // Chamando os métodos get() para apresentar os objetos
        System.out.println("----- AVIÃO -----");
        System.out.println("Companhia: " + aviao1.getCompanhia());
        System.out.println("Cor: " + aviao1.getCor());
        System.out.println("Número de Voos: " + aviao1.getVoos());
        System.out.println("Número de Passageiros: " + aviao1.getPassageiros());
    }
}
