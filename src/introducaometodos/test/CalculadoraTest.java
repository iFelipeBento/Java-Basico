package introducaometodos.test;

import introducaometodos.classes.Calculadora;

public class CalculadoraTest {
	
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		calc.somaDoisNumeros();
		calc.subtraiDoisNumeros();
		calc.multiplicaDoisNumeros(5,5);
		calc.divideDoisNumeros();
		calc.imprimeDoisNumerosDivididos(20, 5);
		
		int [] numeros = {1,2,3,4,5};
		calc.somaArray(numeros);
		calc.somaVarArgs(1,2,3,4,5);
		
	}

}
