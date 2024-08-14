package Classe;

public class ObjetoCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente ();
		Cliente cliente2 = new Cliente();

		//CLIENTE 1
		cliente1.setId(6540);
		cliente1.setNome("Marcus");
		cliente1.setTelefone("21988402289");
		cliente1.setEndereco("Rio de janeiro, BRASIL");
		cliente1.setCpf("321.256.078-47");
		cliente1.setRg("19.345.078-9");
		
		System.out.println("----- CLIENTE 1 -----");
		System.out.println("ID: " + cliente1.getId());
		System.out.println("NOME: "+ cliente1.getNome());
		System.out.println("TELEFONE: " + cliente1.getTelefone());
		System.out.println("ENDEREÇO: " + cliente1.getEndereco());
		System.out.println("CPF: " + cliente1.getCpf());
		System.out.println("RG: " + cliente1.getRg());
        System.out.println(cliente1.experimentar());
      
		//CLIENTE 2
		cliente2.setId(6754);
		cliente2.setNome("David");
		cliente2.setTelefone("31988224089");
		cliente2.setEndereco("Belo Horizonte, BRASIL");
		cliente2.setCpf("123.456.789-00");
		cliente2.setRg("12.345.678-9");

		System.out.println("----- CLIENTE 2 -----");
		System.out.println("ID: " + cliente2.getId());
		System.out.println("NOME: "+ cliente2.getNome());
		System.out.println("TELEFONE: " + cliente2.getTelefone());
		System.out.println("ENDEREÇO: " + cliente2.getEndereco());
		System.out.println("CPF: " + cliente2.getCpf());
		System.out.println("RG: " + cliente2.getRg());
        System.out.println(cliente2.reservar());
		System.out.println(cliente2.pagar());
	}
}
