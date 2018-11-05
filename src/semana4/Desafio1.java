package semana4;

import java.util.Scanner;

/**
 * Uma classe produtos com atributos - nome do produto - tamanho do produto -
 * cor - marca Uma classe estoque que tem um objeto de produto - quantidade - id
 * - produto Uma classe "funcionario" que tem os métodos -Cadastrar -Editar
 * -Excluir -Consultar
 *
 * mostre os metodos em execuÃ§Ã£o
 */
public class Desafio1 {

	public static void main(String[] args) {

		new Desafio1().menu();
	}

	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Digite: \n [1] Cadastrar Produto \n [2] Editar Produto \n [3] Consultar \n [4] Excluir Produto \n [5] Sair");
		int opcao = new Integer(sc.nextLine());
		switch (opcao) {
		case 1:
			Funcionario.cadastrar();
			menu();
			break;

		case 2:
			Funcionario.editar();
			menu();
			break;
		case 3:

			Funcionario.consultar();
			menu();
			break;

		case 4:
			Funcionario.excluir();
			menu();
			break;

		case 5:

		default:
			System.out.println("Opção inválida. Tente novamente!");
			menu();
			break;
		}
		sc.close();
	}
}