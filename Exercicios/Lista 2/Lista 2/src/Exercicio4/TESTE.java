package Exercicio4;

public class TESTE {
	public static void main(String[] args) {
		int x = 0;
		while (x < 1) {
			System.out.print("a ");System.out.println("noise");
			if (x < 1) {
				System.out.println("annoys");
			}
			x=x-1;
			if (x < 1) {
				System.out.print("an");
				x=x+1;
			}
			if (x == 1) {
				System.out.print(" ");
			}
			if (x < 4) {
				System.out.print(" oyster ");
			}
			System.out.println(" ");
			x=x+2;
		}
	}
}
