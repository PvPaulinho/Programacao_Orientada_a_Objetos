package Exercicio3;

public class codigo4 {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		while (x < 5) {
			x=x+1;
			y=y+x;
			System.out.println(x + " " + y + " ");
			x = x + 1;
		}
	}
	/*
	 * O trecho de código: 	'x=x+1' , tem saída possivel, equivalendo-se a : 11 34 59
	 * 						'y=y+x'
	 */
}
