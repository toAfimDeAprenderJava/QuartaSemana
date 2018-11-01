package semana4;

class Estoque {
	static int id=0; //quando a vontade prevalece
	static Produto prod = new Produto[];

	protected static void add(String nome, String marca, String cor, int tamanho, int quantidade) {
		++id;
		prod[(id-1)]=new Produto();
	prod[(id-1)].setId(id);
	prod[(id-1)].setNome(nome);
	prod[(id-1)].setMarca(marca);
	prod[(id-1)].setCor(cor);
	prod[(id-1)].setTamanho(tamanho);
	prod[(id-1)].setQuantidade(quantidade);
	}
}