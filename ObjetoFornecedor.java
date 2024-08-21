package Classe;

public class ObjetoFornecedor {

	public static void main(String[] args) {
		Fornecedor fornecedor1 = new Fornecedor();

		fornecedor1.setId(5781);
		fornecedor1.setRazaoSocial("Newton Cosméticos Ltda.");
		fornecedor1.setNomeFantasia("NC");
		fornecedor1.setCnpj("12.345.678/0001-90");
		fornecedor1.setEndereco("São Paulo, BRASIL");
		fornecedor1.setTelefone("(11) 98834-5678");
		fornecedor1.setEmail("contato@techsolutions.com.br");
		fornecedor1.setInscricaoEstadual("123.456.789.123");

		System.out.println("ID: " + fornecedor1.getId());
		System.out.println("Razão Social: " + fornecedor1.getRazaoSocial());
		System.out.println("Nome Fantasia: " + fornecedor1.getNomeFantasia());
		System.out.println("CNPJ: " + fornecedor1.getCnpj());
		System.out.println("Endereço: " + fornecedor1.getEndereco());
		System.out.println("Telefone: " + fornecedor1.getTelefone());
		System.out.println("Email: " + fornecedor1.getEmail());
		System.out.println("Inscrição Estadual: " + fornecedor1.getInscricaoEstadual());
	}
}

