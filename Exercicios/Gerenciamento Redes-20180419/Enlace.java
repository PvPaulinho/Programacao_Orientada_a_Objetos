
public class Enlace {
	
	private int velocidade;
	private String tipo;
	private double distancia;
	
	/*public Enlace(){
		
		System.out.println("Construtor Default");
		
	}*/
	
	public Enlace (int x){
		
		if (x == 1)
			System.out.println(x);
		else
			System.out.println("Teste");
	}
	
	
	
	
	public void analisarCanal(){
		
		System.out.println("Analisar Canal");
	}
	
	public void verAtenuacao(){
		
		System.out.println("Ver Atenuacao");
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	

}
