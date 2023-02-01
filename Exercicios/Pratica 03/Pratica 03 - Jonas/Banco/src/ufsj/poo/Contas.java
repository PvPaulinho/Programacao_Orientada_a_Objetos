package ufsj.poo;

public abstract class Contas {

	String nome_do_titular;
	 int numero;
	 float saldo;
	public String getNome_do_titular() {
		return nome_do_titular;
	}
	public void setNome_do_titular(String nome_do_titular) {
		this.nome_do_titular = nome_do_titular;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int número) {
		this.numero = número;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	}

