package Classe;

public class Computador {
	String marca;
	String modelo;
	String cor;
	String teclado;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
	public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getTeclado() {
        return teclado;
    }
    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }
    public String ligar() {
    	return "Ligando";
    }
    public String carregar() {
    	return "Carregando";
    }
}
