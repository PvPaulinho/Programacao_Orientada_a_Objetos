
public class Teste {

	public static void main(String[] args) {
		
	
		//criar um objeto do tipo Endereco
		Endereco end1 = new Endereco();
		end1.setRua("Rua do Cruzeiro");
		end1.setNumero("2018");
		//end1.setComplemento("Casa");
		end1.setCidade("OB");
		end1.setCep("36420-000");
		
		//Criar objeto do tipo telefone
		Telefone t1 = new Telefone();
		t1.setTipo("celular");
		t1.setDdd("31");
		t1.setNumero("000-0000");
		
		//Criar objeto do tipo telefone
		Telefone t2 = new Telefone();
		t2.setTipo("residencial");
		t2.setDdd("31");
		t2.setNumero("111-1211");
		
		//Criar array de telefones
		Telefone[] array_tel = new Telefone[2];
		array_tel[0] = t1;
		array_tel[1] = t2;
		
		//Criar objeto Contatos
		Contatos c1 = new Contatos();
		c1.setNome("Teste");
		//c1.setEndereco("Rua X");
		//c1.setTelefone("9999-0000");
		c1.setEndereco(end1);
		c1.setTelefones(array_tel);
		
		System.out.println(c1.getNome());
		System.out.println("");
		System.out.println(c1.getEndereco().getRua());
		
		if (c1.getEndereco().getComplemento() != null)
		
			System.out.println(c1.getEndereco().getComplemento());
		
		System.out.println("");
		int cont = 0;
		for (Telefone t : c1.getTelefones() ) {
			System.out.println("Contato " + cont );
			System.out.println(t.getTipo());
			System.out.println(t.getDdd());
			System.out.println(t.getNumero());
			System.out.println("");
			
			cont = cont  + 1;
		}
	}

}
