package Exercicio3;

public class codigo1 {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		while (x < 5) {
			y = x - y;
			System.out.println(x + " " + y + " ");
			x = x + 1;
		}
	}
/*
 * O trecho de c�digo: 'y=x-y', tem sa�da possivel, equivalendo-se a : 00 11 21 32 42
 */
}
