package ufsj.poo;

abstract class Conta {
	interface conta{
		double sacar(double saldo,double retirada){
			if(saldo>retirada) {
			saldo=saldo*0.98;
			return (saldo=saldo -retirada);
		}else {
			System.out.println("Erro - Saldo insuficiente");
			return 0;
		}
	double depositar(double qt,){
		return 10;
	}		
	}
}}