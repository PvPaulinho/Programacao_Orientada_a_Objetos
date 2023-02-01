package Exercicio3;

public class codigo3 {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		while (x < 5) {
			y=y+2;
			if (x>4){
				y=y-1;
			}
			System.out.println(x + " " + y + " ");
			x = x + 1;
		}
	}
	/*
	 * O trecho de código:  'y=y+2;		' ,não tem saida possivel	
							'if (x>4){	'
							'	y=y-1;	'
							'}			'
	 */
}
