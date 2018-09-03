package javacore.introducaoclasses.classes;

import javacore.introducaoclasses.Carro;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.placa = "QFZ8629";
		carro.modelo = "Honda";
		carro.velocidadeMaxima = 110f;
		
		System.out.println(carro.placa);
		System.out.println(carro.modelo);
		System.out.println(carro.velocidadeMaxima);
		
	}

}
