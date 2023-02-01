
public class Computador extends Equipamento {

	private String placaSom;
	
	//sobrescrita de metodo
	
	public void ligaDesliga(){
		
		System.out.println("Liga desliga Dentro do Computador");
	}
	
	public void exibirVideo(){
		
		System.out.println("ExibirVideo");
		
	}

	public String getPlacaSom() {
		return placaSom;
	}

	public void setPlacaSom(String placaSom) {
		this.placaSom = placaSom;
	}
	
}
