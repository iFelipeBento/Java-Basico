package introducaometodos.test;

import introducaometodos.classes.Estudante;

public class EstudanteTest {
	
	public static void main(String[] args) {
		
		Estudante estudante = new Estudante();
		
		estudante.setNome("Felipe");
		estudante.setIdade(21);
		estudante.setNotas(new double[]{8,6,5});
		estudante.print();
		estudante.tirarMedia();
		System.out.println("\nAprovado: "+estudante.isAprovado());
	}
	
}