package ufsj.poo;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int e;
		System.out.println("- Digitar 1 - Criar Conta Corrente;\r\n" + 
				"- Digitar 2 - Criar Conta Poupança;\r\n" + 
				"- Digitar 3 - Saque;\r\n" + 
				"- Digitar 4 – Saldo;\r\n" + 
				"- Digitar 5 – Deposito;\r\n" + 
				"- Digitar 6 – Imprimir Contas;\r\n" + 
				"- Digitar 7 – Sair; ");
		e=sc.nextInt();
		switch(e) {
		case 1:cc() ;
			break;
		case 2:P();
			break;
		case 3: saq();
			break;
		case 4:sal();
			break;
		case 5:dep();
			break;
		case 6:imp();
			break;
		case 7:
			break;
	}
	}

	private static void P() {
		// TODO Auto-generated method stub
		
	}

	private static void cc() {
		// TODO Auto-generated method stub
		
	}

	private static void imp() {
		// TODO Auto-generated method stub
		
	}

	private static void dep() {
		// TODO Auto-generated method stub
		
	}

	private static void sal() {
		// TODO Auto-generated method stub
		
	}

	private static void saq() {
		// TODO Auto-generated method stub
		
	}


}
