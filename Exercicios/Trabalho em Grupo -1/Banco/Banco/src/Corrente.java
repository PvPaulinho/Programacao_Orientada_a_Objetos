import java.util.Scanner;

public class Corrente {
	Scanner sc = new Scanner(System.in);
	
	public float taxac = (float) 0.1;
	private String numeroc;
	double saldoc=0;

	double[] historicoentradac = new double[100000000];
	double[] historicosaidac = new double[10000000];
	
	int contentc = 0;
	int contsc = 0;
	float txj = (float) 0.1;
	float aplimin = 10;
	int contapli = 0;	
	
	
	public String getNumeroc() {
		return numeroc;
	}
	public void setNumeroc(String numeroc) {
		this.numeroc = numeroc;
	}

	void entradac() {
		double aux;
		System.out.println("Digite o valor a ser depositado.");
		aux = sc.nextDouble();
		if (aux<=0) {
			System.out.println("Valor invalido.");
		}
		else {
			saldoc = saldoc + aux;
			historicoentradac[contentc] = aux;
			contentc++;
			if(aux>=aplimin) {
				contapli++;
			}
		}
	}
	
	
	void saidac() {
		double aux;
		System.out.println("Digite o valor a ser sacado.");
		aux = sc.nextDouble();
		if(aux<=0 || aux>saldoc) {
			System.out.println("Saldo insuficiente ou invalido.");
		}
		else {
			saldoc = saldoc - aux;
			historicosaidac[contsc] = aux;
			contsc++;
		}
	}
	void aplicacaominima() {
		if (contapli==0) {
			saldoc = saldoc - saldoc*taxac;
		}
	}
	
	
	
	
	
}


