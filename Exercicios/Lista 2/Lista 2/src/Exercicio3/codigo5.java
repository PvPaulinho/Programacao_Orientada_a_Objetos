package Exercicio3;

public class codigo5 {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		while (x < 5) {
			if (x<5){
				x=x+1;
				if (x>3){
					x=x-1;
				}
			}
			y=y+2;
			System.out.println(x + " " + y + " ");
			x = x + 1;
		}
	}
	/*
	 * O trecho de código:  'if (x<5){		' ,não tem saida possivel	
							'	 x=x+1;		'
							'	 if (x>3){	'
							'		 x=x-1;	'
							'	 }			'
							'}				'
							'y=y+2;			'
	 */
}
