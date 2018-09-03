package introducaometodos.classes;

public class Calculadora {

	public void somaDoisNumeros() {
		System.out.println(5+5);
		
	}
	
	public void subtraiDoisNumeros() {
		System.out.println(5-5);
	}
	
	public void divideDoisNumeros() {
		System.out.println(5/5);
	}
	
	public void multiplicaDoisNumeros(int num1, int num2) {
		
		System.out.println(num1*num2);
		
	}
	
	public void imprimeDoisNumerosDivididos(double num1, double num2) {
		if(num2 != 0)
			System.out.println(num1/num2);
		
	}
	
	public void somaArray(int[]numeros) {
		
		int soma = 0;
		for(int num:numeros) {
			soma += num;
		}
		System.out.println(soma);
	}
	
	public void somaVarArgs(double varloDouble, int...numeros) {
		int soma = 0;
		for(int num:numeros) {
			soma += num;
		}
		System.out.println(soma);
	}

}
