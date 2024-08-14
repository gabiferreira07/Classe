package Classe;

public class ObjetosPessoa {

	public static void main(String[] args) {
		//Criando objetos da classe Pessoa
		Pessoa pessoa1 = new Pessoa ();
		Pessoa pessoa2 = new Pessoa ();

		//OBJETO 1
		pessoa1.setNome("Tom Cruise");
		pessoa1.setIdade(60);
		pessoa1.setEndereco("California, USA");
		pessoa1.setProfissao("Ator");
		pessoa1.setCpf("123.456.789-00");
		pessoa1.setRg("12.345.678-9");


		//OBJETO 2
		pessoa2.setNome("Messi");
		pessoa2.setIdade(35);
		pessoa2.setEndereco("Miami, USA");
		pessoa2.setProfissao("Jogador de futebol");
		pessoa2.setCpf("987.654.321-00");
		pessoa2.setRg("98.765.432-1");

		//Chamando o método get() para apresentar os objetos
		System.out.println("----- OBJETO 1 -----");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProfissao());
		System.out.println("CPF: " + pessoa1.getCpf());
		System.out.println("RG: " + pessoa1.getRg());

		System.out.println("----- OBJETO 2 -----");

		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProfissao());
		System.out.println("CPF: " + pessoa2.getCpf());
		System.out.println("RG: " + pessoa2.getRg());
	}
}



