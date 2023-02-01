
public class TESTE {
	public static void main(String[] args) {
		int x = 3;
		while (x>0){
			if (x>2) {
				System.out.print("a");
				System.out.print("-");
				x = x- 1;
			}
			if (x==2) {
				System.out.print("b c");
				System.out.print("-");
				x = x- 1;
			}
			if (x==1){
				System.out.print("d");
				x = x - 1;
			}
		}
	}
	/*
	 * O codigo serve para colocar em ordem crescente as letras 'a,b,c,d'
	 * E tem o resultado: a-b c-d
	 */
}
