/* Class Televisão com os atributos:
	- tamanho
	- cor
	- marca

	métodos getters and setters (manipular os atributos)
	
	métodos da classe:
	
	- sintonizar()
	- canal()
	- ligaDesliga

*/


public class TV {
	
	int tamanho;
	String marca, cor;

	//métodos getters and setters
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
	
	public void ligaDesliga(){
		
		System.out.println("Liga e Desliga");
		
	}
	
	public void sintonizar(){
		
		System.out.println("sintonizar");
		
	}
	
	public void canal(){
		
		System.out.println("canal");
		
	}
	
	
	
	
	
}
