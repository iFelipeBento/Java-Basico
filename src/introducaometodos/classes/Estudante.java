package introducaometodos.classes;

public class Estudante {
	
	private String nome;
	private int idade;
	private double []notas;
	private boolean aprovado;
	
	
	public void print() {
		System.out.println("Nome:"+this.nome);
		System.out.println("Idade:"+this.idade);
		if(this.notas != null) {
			for(double nota : this.notas) {
				System.out.print(nota+" ");
			}
		}
	}
	
	public void tirarMedia() {
		
		if(notas == null) {
			System.out.println("Este aluno n�o possui notas");
			return;
		}
		
		double media = 0;
		for(double nota: this.notas) {
			media += nota;
		}
		
		media = media / this.notas.length;
		
		if(media > 6) {
			this.aprovado = true;
			System.out.println("\nA m�dia �:"+media+" portanto seu status �: Aprovado");
		}else {
			this.aprovado = false;
			System.out.println("Reprovado");
		}
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		if(idade<0) {
			System.out.println("Voc� n�o pode fazer isso");
			return;
		}
		this.idade = idade;
	}
	
	public void setNotas(double []notas) {
		this.notas = notas;
	}
	
	public String getNome() {
		return this.nome;
	}
	public int getIdade() {
		return this.idade;
	}
	public double []getNotas() {
		return this.notas;
	}
	
	public boolean isAprovado() {
		return this.aprovado;
	}

}
