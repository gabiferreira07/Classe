package Classe;

public class ObjetoAnimal {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		Animal animal3 = new Animal();
		Animal animal4 = new Animal();
		Animal animal5 = new Animal();

		//ANIMAL 1
		animal1.setAnimal("Vaca");
		animal1.setNome("Antonella");
		animal1.setIdade(10);
		animal1.setPeso(500);

		//ANIMAL 2
		animal2.setAnimal("Galinha");
		animal2.setNome("Guilhermina");
		animal2.setIdade(1);
		animal2.setPeso(2.4);

		//ANIMAL 3
		animal3.setAnimal("Bezerro");
		animal3.setNome("Gilberto");
		animal3.setIdade(1);
		animal3.setPeso(100);

		//ANIMAL 4
		animal4.setAnimal("Cachorro");
		animal4.setNome("Zyon");
		animal4.setIdade(1);
		animal4.setPeso(10);

		//ANIMAL 5
		animal5.setAnimal("Coelho");
		animal5.setNome("Kim");
		animal5.setIdade(2);
		animal5.setPeso(1.5);

		System.out.println("----- ANIMAL 1 -----");
		System.out.println("Tipo: " + animal1.getAnimal());
		System.out.println("Nome: " + animal1.getNome());
		System.out.println("Idade: " + animal1.getIdade());
		System.out.println("Peso: " + animal1.getPeso() + " kg");

		System.out.println("----- ANIMAL 2 -----");
		System.out.println("Tipo: " + animal2.getAnimal());
		System.out.println("Nome: " + animal2.getNome());
		System.out.println("Idade: " + animal2.getIdade());
		System.out.println("Peso: " + animal2.getPeso() + " kg");

		System.out.println("----- ANIMAL 3 -----");
		System.out.println("Tipo: " + animal3.getAnimal());
		System.out.println("Nome: " + animal3.getNome());
		System.out.println("Idade: " + animal3.getIdade());
		System.out.println("Peso: " + animal3.getPeso() + " kg");
		
		System.out.println("----- ANIMAL 4 -----");
		System.out.println("Tipo: " + animal4.getAnimal());
		System.out.println("Nome: " + animal4.getNome());
		System.out.println("Idade: " + animal4.getIdade());
		System.out.println("Peso: " + animal4.getPeso() + " kg");
		
		System.out.println("----- ANIMAL 5 -----");
		System.out.println("Tipo: " + animal5.getAnimal());
		System.out.println("Nome: " + animal5.getNome());
		System.out.println("Idade: " + animal5.getIdade());
		System.out.println("Peso: " + animal5.getPeso() + " kg");
	}
}