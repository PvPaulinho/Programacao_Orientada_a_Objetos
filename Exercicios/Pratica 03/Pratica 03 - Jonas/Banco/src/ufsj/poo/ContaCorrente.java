package ufsj.poo;

import ufsj.poo.Conta.conta;

class ContaCorrente extends Contas implements conta{
	
	
	public double sacar(double saldo,double retirada){
		if(saldo>retirada) {
		saldo=saldo*0.98;
		return (saldo=saldo -retirada);
	}else {
		System.out.println("Erro - Saldo insuficiente");
		return 0;
	}
}}