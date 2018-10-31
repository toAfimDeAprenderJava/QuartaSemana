package semana4;

public class Produto {
	private int id;
	private String nome;
	private String marca;
	private String cor;
	private int tamanho;
	private int quantidade;
	
	protected int getId() {
		return this.id;
	}
	protected String getNome() {
		return this.nome;
	}
	protected String getMarca() {
		return this.marca;
	}
	protected String getCor() {
		return this.cor;
	}
	protected int getTamanho() {
		return this.tamanho;
	}
	protected int getQuantidade() {
		return this.quantidade;
	}
	
	protected void setId(int id) {
		this.id=id;
	}
	protected void setNome(String nome) {
		this.nome=nome;
	}
	protected void setMarca(String marca) {
		this.marca=marca;
	}
	protected void setCor(String cor) {
		this.cor=cor;
	}
	protected void setTamanho(int tamanho) {
		if(tamanho>60) {
			System.error.println("Não há espaço para produtos deste tamanho em nosso estoque.");
		}
		else this.tamanho=tamanho;
	}
	protected void setQuantidade(int quantidade) {
		this.quantidade=quantidade;
	}
}
