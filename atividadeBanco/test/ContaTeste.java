package br.com.unipe.renato.atividadeBanco.test;

import br.com.unipe.renato.atividadeBanco.Conta;

public class ContaTeste {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta("Felipe Bento", "09940761422", "3727697", 0, 0, 0);
		//A nossa conta possui ~> Nome, CPF, RG, Saldo, Deposito e Saque.
		
		conta.setSaldo(1000);
		conta.setDepositar(540.8);
		conta.setSacar(75.5);
		conta.imprime();
		
	}

}