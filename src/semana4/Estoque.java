package semana4;

class Estoque {
	int id=0;
	Produto[] prod=new Produto[2];

	protected void add(String nome, String marca, String cor, int tamanho, int quantidade) {
	++id;
	prod[(id-1)]=new Produto();
	prod[(id-1)].setId(id);
	prod[(id-1)].setNome(nome);
	prod[(id-1)].setMarca(marca);
	prod[(id-1)].setCor(cor);
		prod[(id-1)].setTamanho(tamanho);
	prod[(id-1)].setQuantidade(quantidade);
	System.out.println("Produto id " + id + " adicionado ao estoque.");
}
protected void lista() {
	for(int i=0; i<prod.length; i++) {
		System.out.println("Id:" + prod[(i)].getId());
		System.out.println(prod[(i)].getNome() + " " + prod[(i)].getMarca() + ", cor " + prod[(i)].getCor());
		System.out.println("Quantidade: " + prod[(i)].getQuantidade());
	}
	}
}