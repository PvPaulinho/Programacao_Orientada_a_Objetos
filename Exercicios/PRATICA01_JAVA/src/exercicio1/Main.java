package exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int idade;
		String nome;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite seu nome: ");
		nome=sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade=sc.nextInt();
		
		System.out.println(nome + ", sua idade eh: " + idade);
	}

}
