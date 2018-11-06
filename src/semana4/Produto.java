package semana4;

public class Produto {
	private String nome;
	private int size;
	private String cor;
	private String marca;

	public Produto(String nome, int size, String cor, String marca) {
		super();
		this.nome = nome;
		this.size = size;
		this.cor = cor;
		this.marca = marca;
	}

	public Produto() {
		super();
	}

	public String getAll() {
		return "Nome do Produto: " + nome + "\n" + "Tamanho do Produto(cm): " + size + "\n" + "Cor do Produto: " + cor
				+ "\n" + "Marca do Produto: " + marca + "\n"
				+ "----------------------------------------------------------------";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
