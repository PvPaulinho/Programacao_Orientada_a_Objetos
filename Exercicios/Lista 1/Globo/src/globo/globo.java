

package globo;

import java.util.Scanner;

public class globo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		tv tv1 = new tv();
		System.out.println("TV1");
		System.out.println("\nTamnho: ");
		tv1.setTamanho(sc.nextInt());
		System.out.println("\nMarca: ");
		tv1.setMarca(sc.next());
		System.out.println("\nCor: ");
		tv1.setCor(sc.next());
		
		tv tv2 = new tv();
		System.out.println("\n\nTV2");
		System.out.println("\nTamanho: ");
		tv2.setTamanho(sc.nextInt());
		System.out.println("\nMarca: ");
		tv2.setMarca(sc.next());
		System.out.println("\nCor:");
		tv2.setCor(sc.next());
		System.out.println("\n\n");
		
		System.out.println("\nObjeto TV1 Marca: " + tv1.getMarca() );
		System.out.println("Tamanho: " + tv1.getTamanho());
		System.out.println("Cor: " + tv1.getCor() );
		tv1.liga();
		
		System.out.println("\nObjeto TV1 Marca: " + tv1.getMarca() );
		System.out.println("Tamanho: " + tv1.getTamanho());
		System.out.println("Cor: " + tv1.getCor() );
		tv1.sintonizar();
		
		System.out.println("\nObjeto TV1 Marca: " + tv1.getMarca() );
		System.out.println("Tamanho: " + tv1.getTamanho());
		System.out.println("Cor: " + tv1.getCor() );
		tv1.canal();
		
		System.out.println("\nObjeto TV2 Marca: " + tv2.getMarca() );
		System.out.println("Tamanho: " + tv2.getTamanho());
		System.out.println("Cor: " + tv2.getCor() );
		tv2.liga();
		
		System.out.println("\nObjeto TV2 Marca: " + tv2.getMarca() );
		System.out.println("Tamanho: " + tv2.getTamanho());
		System.out.println("Cor: " + tv2.getCor() );
		tv2.sintonizar();
		
		System.out.println("\nObjeto TV2 Marca: " + tv2.getMarca() );
		System.out.println("Tamanho: " + tv2.getTamanho());
		System.out.println("Cor: " + tv2.getCor() );
		tv2.canal();
		
	}

}
