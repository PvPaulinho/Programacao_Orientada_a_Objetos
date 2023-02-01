import java.util.Scanner;

public class Poupanca {
	Scanner sc = new Scanner (System.in);
	private float taxap;
	private String numerop;
	double saldop=0;
	private float prazop;
	
	double[] historicoentradap = new double[1000000];
	double[] historicosaidap = new double[100000];
	int contentp=0;
	int contsp=0;
	
	public float getTaxap() {
		return taxap;
	}
	public void setTaxap(float taxap) {
		this.taxap = taxap;
	}
	public String getNumerop() {
		return numerop;
	}
	public void setNumerop(String numerop) {
		this.numerop = numerop;
	}
	public float getPrazop() {
		return prazop;
	}
	public void setPrazop(float prazop) {
		this.prazop = prazop;
	}
	
	void entradap() {
		double aux;
		System.out.println("Digite o valor a ser depositado.");
		aux = sc.nextDouble();
		if (aux<=0) {
			System.out.println("Valor invalido.");
		}
		else {
			saldop = saldop + aux;
			historicoentradap[contentp] = aux;
			contentp++;
		}
	}
	void saidap() {
		double aux;
		System.out.println("Digite o valor a ser sacado.");
		aux = sc.nextDouble();
		if(aux<=0 || aux>saldop) {
			System.out.println("Saldo insuficiente ou invalido.");
		}
		else {
			saldop = saldop - aux;
			historicosaidap[contsp] = aux;
			contsp++;
		}
	}
	
	
	
	
	
}
