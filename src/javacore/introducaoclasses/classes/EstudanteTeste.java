package javacore.introducaoclasses.classes;

import javacore.introducaoclasses.Estudante;

public class EstudanteTeste {
	
	public static void main(String[] args) {
		
		Estudante felipe = new Estudante();
			
			felipe.nome = "Felipe Bento";
			felipe.matricula = "1710018096";
			felipe.idade = 21;
			
			System.out.println(felipe.nome);
			System.out.println(felipe.matricula);
			System.out.println(felipe.idade);
		
	}

}
