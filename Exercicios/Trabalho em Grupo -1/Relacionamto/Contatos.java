
public class Contatos {
	
	private String nome;
	private Endereco endereco;
	private Telefone[] Telefones;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Telefone[] getTelefones() {
		return Telefones;
	}
	public void setTelefones(Telefone[] telefones) {
		Telefones = telefones;
		
	}
	

	

}
