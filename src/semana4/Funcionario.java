package semana4;

import java.util.Scanner;
class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private int horasATrabalhar;

protected String getNome() {
		return this.nome;
}
protected String getDepartamento() {
	return this.departamento;
}
protected double getSalario(){
	return this.salario;
}
protected int gethorasATrabalhar() {
	return this.horasATrabalhar;
}
protected void setNome(String nome) {
	this.nome=nome;
}
protected void setDepartamento(String departamento) {
	this.departamento=departamento;
}
protected void setSalario(double salario) {
	this.salario=salario;
}
protected void setHorasATrabalhar(int horasATrabalhar) {
	this.horasATrabalhar=horasATrabalhar;
}

protected void edita() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Nome: " + this.getNome());
	if(resposta()==false) {
		System.out.println("Editando novo nome");
		this.setNome(sc.nextLine());
		System.out.println("Nome mudado para " + this.getNome());
	}
	System.out.println("Departamento: " + this.getDepartamento());
	if(resposta()==false) {
		System.out.println("Editando novo departamento.");
		this.setDepartamento(sc.nextLine());
		System.out.println("Novo departamento é " + this.getDepartamento());
	}
}
	protected boolean resposta() {
		System.out.println("Mantenho?");
		Scanner scx=new Scanner(System.in);
		String opc=scx.nextLine();
		if(opc.equals("s")) return true;
		else return false;
	}
}