package javacore.sobrecargametodos.test;

import javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Felipe Bento", "09940761422", 1.100, "3727697");
		Funcionario funcionario1 = new Funcionario(null, null, 0, null);
		
		funcionario.imprime();
		funcionario1.imprime();
		
	}

}
