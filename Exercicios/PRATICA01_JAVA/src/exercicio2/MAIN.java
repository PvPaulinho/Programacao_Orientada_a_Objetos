package exercicio2;

import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double VA;
		float J;
		int N;
		double VF;
		double result;
		
		System.out.println("Informe o valor a ser aplicado: ");
		VA = sc.nextDouble();
		
		System.out.println("Informe o valor dos juros: ");
		J = sc.nextFloat();
		
		System.out.println("Informe o tempo da aplicação: ");
		N = sc.nextInt();
		
		result = J+1;
		for(int i=2; i<=N; i++){
			result=result*(J+1);
		}
		
		VF=VA*result;
		System.out.println("O saldo final de sua aplicacao eh: " + VF );
			

	}

}
