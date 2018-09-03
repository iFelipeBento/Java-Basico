package javacore.introducaoclasses.classes;

import javacore.introducaoclasses.Professor;

public class ProfessorTeste {
	
	public static void main(String[] args) {
		
		Professor professor = new Professor();
		
		professor.nome = "Felipe Bento";
		professor.matricula = "1710018096";
		professor.rg = "3727697";
		professor.cpf = "09940761422";
		
		System.out.println(professor.nome);
		System.out.println(professor.matricula);
		System.out.println(professor.rg);
		System.out.println(professor.cpf);
		
		
	}

}
