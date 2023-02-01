package exercicio3;

import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		double soma=0; 
		double salario, media;
		boolean x=true;
		
		while(x){
			System.out.println("Entre com o salario: (Digite um valor menor que 0 para sair.");
			salario = sc.nextDouble();
			if(salario>0){
				soma+=salario;
				contador++;
			}
			else{
				x=false;
				
			}	
		}
		media=soma/contador;
		System.out.println("A media dos salarios eh: " + media);

	}

}
