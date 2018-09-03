package br.com.unipe.renato.atividadeBanco;

public class Conta {
	
	private String nome;
	private String cpf;
	private String rg;
	private double sacar;
	private double depositar;
	private double saldo;
	
	public Conta(String nome, String cpf, String rg, double saldo, double depositar, double sacar) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.saldo = saldo;
		this.depositar = depositar;
		this.sacar = sacar;

		//Construtor Padrão
	}
	
	public Conta() {
		
	}
	
	public void imprime() {
		System.out.println("---------------------------");
		System.out.println("Titular: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("RG: " + this.rg);
		System.out.println("Deposito: " + this.depositar);
		System.out.println("Saque: " + this.sacar);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("---------------------------");
	}
	
	public double getDepositar() {
		return depositar;
	}
	
	public double getSacar() {
		return sacar;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getRg() {
		return rg;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setDepositar(double depositar) {
		saldo+=depositar;
		this.depositar = depositar;
	}
	
	public void setSacar(double sacar) {
		saldo-=sacar;
		this.sacar = sacar;
	}

}
