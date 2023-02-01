
public class Dependente {
	private String nome;
	private String endereco;
	private String telefone;
	private Poupanca[] poupancadep;
	
	public Poupanca[] getPoupancadep() {
		return poupancadep;
	}
	public void setPoupancadep(Poupanca[] poupancadep) {
		this.poupancadep = poupancadep;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
