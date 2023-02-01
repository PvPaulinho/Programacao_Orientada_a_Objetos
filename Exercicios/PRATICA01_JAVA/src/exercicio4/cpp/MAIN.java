package exercicio4.cpp;

import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float peso;
		float altura;
		double imc;
		
		System.out.println("Informe seu peso em quiilogramas: ");
		peso = sc.nextFloat();
		
		System.out.println("Informe sua altura em metros: ");
		altura = sc.nextFloat();
		
		imc = peso/(altura*altura);
		
		if(imc<18.5){
			System.out.println("Seu peso eh" + imc  + " e voce esta abaixo do peso.");
		}
		else if(imc>=18.6 || imc<=25.9){
			System.out.println("Seu peso eh: " + imc + " e voce esta saudavel.");
		}
		else if 
		
		
	}

}
