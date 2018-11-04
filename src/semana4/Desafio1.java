package semana4;

/**
 * 	Uma classe â€œprodutosâ€� com atributos
 * 		- nome do produto
 * 		- tamanho do produto
 * 		- cor
 * 		- marca
 * 	Uma classe â€�estoqueâ€� que tem um objeto de produto
 * 		- quantidade
 * 		- id
 * 		- produto
 * 	 Uma classe "funcionario" que tem os mÃ©todos
 * 		-Cadastrar
 * 		-Editar
 * 		-Excluir
 * 		-Consultar
 *
 *  mostre os metodos em execuÃ§Ã£o
 */
public class Desafio1{
	public static void main(String[] args) {
		Estoque estoque=new Estoque();
		estoque.add("Secador de Cabelo", "Taiff", "Preto", 25, 7);
	}
}