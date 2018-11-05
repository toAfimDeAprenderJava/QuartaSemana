import java.util.ArrayList;

public class Funcionario {
	
	public ArrayList<Estoque> estoque;
	
	//construtor inicilizando um array de objetos da classe estoque
	public Funcionario() {
		super();
		this.estoque = new ArrayList<Estoque>();
	}

	// criacao da funcao cadastrar
	public int cadastrar (Estoque e) {
		
		for (Estoque est : estoque) { 
		if (est.id == e.id) {
			return -1;
		}
		}
		
		estoque.add(e);
		return 0;
	} 
	
	//criacao da funcao editar 
	public int editar (Estoque e) {
		
		for (Estoque est : estoque) { 
			if (est.id == e.id) {
				est.produtos = e.produtos;
				est.quantidade = e.quantidade;
				return 0;
			}
			}
		return -1;
	}
	
	//criacao da funcao consultar
	public int consultar (int id) {
		
		for (Estoque est : estoque) { 
			if (est.id ==id) {
				System.out.println("ID: " + id);
				System.out.println("Produto: " + est.produtos.nomePorduto);
				System.out.println("Marca: " + est.produtos.marca);
				System.out.println("Cor: " + est.produtos.cor);
				System.out.println("Tamanho: " + est.produtos.tamanhoProduto);
				System.out.println("Quantidade: " + est.quantidade);
				return 0;
			}
			}
		return -1;	
		
	}
	
	//criacao da funcao escluir
	public int excluir (int id) {
		
		for (Estoque est : estoque ) {
			if (est.id == id) {
				
				estoque.remove(est);
				return 0;
			}
		}
		return -1;
		
	}
	
}
