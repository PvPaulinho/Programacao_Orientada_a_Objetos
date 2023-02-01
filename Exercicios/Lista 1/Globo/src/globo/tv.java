package globo;

public class tv {
	
	private int tamanho;
	private String marca;
	private String cor;
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void liga(){
		System.out.println("Ligando");
	}
	public void sintonizar(){
		System.out.println("Sintonizando");
	}
	public void canal(){
		System.out.println("Trocando canal");
	}
}