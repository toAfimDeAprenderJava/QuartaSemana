package semana4;

/**
 * 	Uma classe com atributos
 * 		- nome do produto
 * 		- tamanho do produto
 * 		- cor
 * 		- marca
 * 	Uma classe  que tem um objeto de produto
 * 		- quantidade
 * 		- id
 * 		- produto
 * 	 Uma classe "funcionario" que tem os mtodos
 * 		-Cadastrar
 * 		-Editar
 * 		-Excluir
 * 		-Consultar
 *
 *  mostre os metodos em execu
 */
public class Desafio1{

    public static void main(String[] args) {

    	//variavel erro
    	int err;
    	
    	Produtos p1 = new Produtos("Caderno", 96, "Colorido", "Panini");
    	Produtos p2 = new Produtos("Mochila", 50, "Dora Aventureira", "Risca");
    	Produtos p3 = new Produtos("Estojo", 20, "Roxo", "Kipling");
    	
    	Estoque e1 = new Estoque(p1, 10, 1);
    	Estoque e2 = new Estoque(p2, 5, 2);
    	Estoque e3 = new Estoque(p3, 15, 3);
    	
    	Funcionario func = new Funcionario ();

    	//Cadastrando 3 novos produtos
    	func.cadastrar(e1);
    	func.cadastrar(e2);
    	func.cadastrar(e3);
    	
    	//Consultando produto com sucesso.
    	err = func.consultar(1);
    	if (err == -1) {
    		System.out.println("O produto escolhido não foi encontrado!");
    	}
    	
    	//Consultando produto com ID inxistente (erro)
    	err = func.consultar(4);
    	if (err == -1) {
    		System.out.println("O produto escolhido não foi encontrado!");
    	}
    	
    	//Editando produto com sucesso.
    	e1.quantidade = 40;
    	err = func.editar(e1);
    	if (err == -1) {
    		System.out.println("O produto escolhido não foi encontrado!");
    	}else System.out.println("Produto editado com sucesso!");
    	
    	//Editando um produto com ID inexistente (erro)
    	Estoque e4 = new Estoque (p1, 5, 100);
    	err = func.editar(e4);
    	if (err == -1) {
    		System.out.println("O produto escolhido não foi encontrado!");
    	}else System.out.println("Produto editado com sucesso!");
    	
    	//Excluindo produto com sucesso
    	err = func.excluir(3);
    	if (err == -1) {
    		System.out.println("O produto escolhido não foi encontrado!");
    	}else System.out.println("Produto excluído!");
    	
    	//Excluindo produto com ID inexistente (erro)
    	err = func.excluir(5);
    	if (err == -1) {
    		System.out.println("O produto escolhido não foi encontrado!");
    	}else System.out.println("Produto escluído!");
    }
}