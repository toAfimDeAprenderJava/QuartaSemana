package semana4;

class Estoque {
	int id=0;
	Produto[] prod=new Produto[]; 

	protected void add(String nome, String marca, String cor, int tamanho, int quantidade) {
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