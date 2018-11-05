package semana4;

public class Funcionario {

	static Estoque[] items = new Estoque[10];

	public static void cadastrar() {
		for (int i = 0; i < 10; i++) {
			if (items[i] == null) {
				items[i] = new Estoque(Magica.inteiro("Digite a Quantidade"), 
									   Magica.inteiro("Digite o ID do Produto"),
									   new Produto(Magica.texto("Digite o Nome do Produto"),
									   Magica.inteiro("Digite o Tamanho do Produto"), 
									   Magica.texto("Digite a cor do Produto"),
									   Magica.texto("Digite a marca do Produto")));
				break;
			}
		}
	}
	
	public static void excluir() {
		int id = Magica.inteiro("Digite o ID do produto a ser deletado");
		for (int i = 0; i < 10; i++) {
			if(items[i] != null) {
				if(items[i].getId() == id) {
					items[i] = null;
					break;
				}
			}else {
				System.out.println("Item não Encontrado");
			}
		}
	}

	public static void editar() {
		int id = Magica.inteiro("Digite o ID do produto a ser Editado");
		for (int i = 0; i < 10; i++) {
			if(items[i] != null) {
				if(items[i].getId() == id) {
				   items[i] = new Estoque(Magica.inteiro("Digite a Quantidade"), 
										  Magica.inteiro("Digite o ID do Produto"),
										  new Produto(Magica.texto("Digite o Nome do Produto"),
										  Magica.inteiro("Digite o Tamanho do Produto"), 
										  Magica.texto("Digite a cor do Produto"),
										  Magica.texto("Digite a marca do Produto")));
						break;
				}
			}else {
				System.out.println("Item não Encontrado");
			}
			}
	}
	
	public static void consultar() {
		for (int i = 0; i < 10; i++) {
			if (items[i] == null) {
				System.out.println("Não tem mais items cadastrados");
				break;
			}
			System.out.println(items[i].getAll());
		}

		/**
		 * editar; excluir;
		 **/

	}
}
/**
 * 
 * int qtde, int id, Produto produto, String nome, int size, String cor, String
 * marca Magica.inteiro("Digite a Quantidade"), Magica.inteiro("Digite o ID do
 * Produto"), Magica.texto("Digite o Nome do Produto"), Magica.texto("Digite o
 * Tamanho do Produto"), Magica.texto("Digite o Nome do Produto"),
 * Magica.texto("Digite a marca do Produto"));
 * 
 **/
