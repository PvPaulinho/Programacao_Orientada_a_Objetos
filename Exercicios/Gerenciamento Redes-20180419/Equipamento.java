
public abstract class Equipamento {
	
	private int ip;
	private String modelo;
	private int mask;
	private int nome;
	
	public void ligaDesliga(){
		
		System.out.println("Liga desliga");
	}
	
	public void conectar(){
		
		System.out.println("Conectar");
		
	}
	
	public int getIp() {
		return ip;
	}
	public void setIp(int ip) {
		this.ip = ip;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getMask() {
		return mask;
	}
	public void setMask(int mask) {
		this.mask = mask;
	}

}
