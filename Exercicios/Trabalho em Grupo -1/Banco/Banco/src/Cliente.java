import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Titular t1 = new Titular();
		t1.setNome("Paulo");
		t1.setEnde("Amintas Jaques");
		t1.setTelf("31 989871763");
		
		System.out.println("1-Criar conta poupanca.\n2-Criar conta corrente.");
		int op;
		op = sc.nextInt();
		
		if(op==1) {
			Poupanca p1 = new Poupanca();
			System.out.println("Numero da conta: ");
			String aux;
			aux = sc.nextLine();
			p1.setNumerop(aux);
			System.out.println("1-Prazo de 1 mes e taxa de 0,1.\n2-Prazo de 2 meses e taxa de 0,2.");
			int x1; 
			x1 = sc.nextInt();
			if(x1==1) {
				p1.setPrazop(1);
				p1.setTaxap((float)0.1);	
			}					
		}
		if(op==2) {
			Corrente c1 = new Corrente();
			System.out.println("Numero de conta: ");
			String aux;
			aux = sc.nextLine();
			c1.setNumeroc(aux);
		}
		
		Dependente d1 = new Dependente();
		
		d1.setNome("Larissa");
		d1.setEnde("Amintas Jaques");
		d1.setTelf("31 998764321");
		
		System.out.println ("Digite 1 para criar conta de Depentende.\nDigite 2 para sair."){
			x = sc.nextInt();
			if (x==1){
				Poupanca p1 = new Poupanca();
				System.out.println("Numero da conta: ");
				String aux;
				aux = sc.nextLine();
				p1.setNumerop(aux);
				System.out.println("1-Prazo de 1 mes e taxa de 0,1.\n2-Prazo de 2 meses e taxa de 0,2.");
				int x1; 
				x1 = sc.nextInt();
				if(x1==1) {
					p1.setPrazop(1);
					p1.setTaxap((float)0.1);	
				}
			}
		}
	}

}
