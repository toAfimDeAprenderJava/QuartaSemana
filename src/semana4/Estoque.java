package semana4;

public class Estoque {

	private int qtde;
	private int id;
	private Produto prod;

	public Estoque(int qtde, int id, Produto prod) {
		super();
		this.qtde = qtde;
		this.id = id;
		this.prod = prod;
	}

	public Estoque() {
		super();
	}

	public String getAll() {
		return "Quantidade: " + qtde + "\n" + "ID Produto: " + id + "\n" + prod.getAll();
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produto getProd() {
		return prod;
	}

	public void setProd(Produto prod) {
		this.prod = prod;
	}

}