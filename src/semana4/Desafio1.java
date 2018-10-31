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
    	Produto prod1=new Produto();
    	prod1.setId();
    	prod1.setNome("Secador de Cabelo");
    	prod1.setMarca("Taiff");
    	prod1.setCor("Preto");
    	prod1.setTamanho(25);
    	
    	Produto prod2=new Produto();
    	prod2.setId();
    	prod2.setNome("Balcão de Padaria");
    	prod2.setMarca("Genérico");
    	prod2.setCor("azul");
    	prod2.setTamanho(75);
    }
    

    }
}