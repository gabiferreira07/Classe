package Classe;

public class ObjetoUsuario {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario();

		usuario1.setId(60);
		usuario1.setNome("Caroline");
		usuario1.setPassword(7842);
		usuario1.setPermissao("Permitido");
		usuario1.setUsuario("Carol42");
		usuario1.setCpf("231.256.089-47");
		usuario1.setRg("19.345.672-8");

		System.out.println("ID: " + usuario1.getId());
		System.out.println("NOME: "+ usuario1.getNome());
		System.out.println("PASSWORD: " + usuario1.getPassword());
		System.out.println("PERMISSÃO: " + usuario1.getPermissao());
		System.out.println("USUARIO: " + usuario1.getUsuario());
		System.out.println("CPF: " + usuario1.getCpf());
		System.out.println("RG: " + usuario1.getRg());
		System.out.println(usuario1.acessar());

	}

}
