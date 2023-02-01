
public class ClasseObjeto {


	public static void main(String[] args) {
		
		//o comando new instância classes - construtor default
		TV tv1 = new TV();
		
		
		//setar valores para TV
		tv1.setMarca("LG");
		tv1.setCor("preto");
		tv1.setTamanho(14);
		
		//buscar valores da TV
		
		System.out.println("Marca: " + tv1.getMarca());
		System.out.println("Cor: " + tv1.getCor());
		System.out.println("Tamanho: " + tv1.getTamanho());
		
		
		//utilizando o construtor com três argumentos
		/*	TV tv1 = new TV("Philips",14,"Verde");
		
		System.out.println("Marca: " + tv1.getMarca());
		System.out.println("Cor: " + tv1.getCor());
		System.out.println("Tamanho: " + tv1.getTamanho());*/
		

	}

}
