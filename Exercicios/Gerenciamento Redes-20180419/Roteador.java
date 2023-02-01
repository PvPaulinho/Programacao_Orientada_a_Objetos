

public class Roteador extends Equipamento{
	
	
	private boolean entradaLinha;
	
	//sobrecarga do metodo
	public void conectar(String x){
		
		System.out.println(x + "Conectar");
		
	}
	
	
	public void gerenciarIP(){
		
		System.out.print("Gerenciar IP");
	}
	
	public boolean isEntradaLinha() {
		return entradaLinha;
	}

	public void setEntradaLinha(boolean entradaLinha) {
		this.entradaLinha = entradaLinha;
	}


}
