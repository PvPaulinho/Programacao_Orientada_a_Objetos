
public class Titular {
	private String nome;
	private String ende;
	private String telf;
	private Dependente[] dependentes;
	private Corrente[] correntes;
	private Poupanca[] poupanca;
	
	public Corrente[] getCorrentes() {
		return correntes;
	}
	public void setCorrentes(Corrente[] correntes) {
		this.correntes = correntes;
	}
	public Poupanca[] getPoupanca() {
		return poupanca;
	}
	public void setPoupanca(Poupanca[] poupanca) {
		this.poupanca = poupanca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnde() {
		return ende;
	}
	public void setEnde(String ende) {
		this.ende = ende;
	}
	public String getTelf() {
		return telf;
	}
	public void setTelf(String telf) {
		this.telf = telf;
	}
	public Dependente[] getDependentes() {
		return dependentes;
	}
	public void setDependentes(Dependente[] dependentes) {
		this.dependentes = dependentes;
	}
	
	
}
