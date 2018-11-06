package semana4;

class TestaFunc {
public static void main(String[] args) {
	Funcionario func1=new Funcionario("João Lúcio", "Corporate", 5000, 5);
Funcionario func2=new Funcionario("Marcella Grünewald", "Marketing", 3500, 8);
func2.edita();
func1.remove();
}
}