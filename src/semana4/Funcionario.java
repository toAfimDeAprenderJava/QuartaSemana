package semana4;

import java.util.Scanner;
class Funcionario {
	private int id=0;
	private String nome;
	private String departamento;
	private double salario;
	private int horasATrabalhar;

	Funcionario[] func=new Funcionario[2];
	protected int getId() {
		return this.id;
	}
protected String getNome() {
		return this.nome;
}
protected String getDepartamento() {
	return this.departamento;
}
protected double getSalario(){
	return this.salario;
}
protected int getHorasATrabalhar() {
	return this.horasATrabalhar;
}
	protected void setId(int id) {
		this.id=id;
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
	System.out.println("Editando");
	Scanner sc=new Scanner(System.in);
	System.out.println("Nome: " + this.getNome());
	if(mantem()==false) {
		System.out.println("Editando novo nome");
		this.setNome(sc.nextLine());
		System.out.println("Nome mudado para " + this.getNome());
	}
	System.out.println("Departamento: " + this.getDepartamento());
	if(mantem()==false) {
		System.out.println("Editando novo departamento.");
		this.setDepartamento(sc.nextLine());
		System.out.println("Novo departamento é " + this.getDepartamento());
	}
	System.out.println("Salario: " + this.getSalario());
	if(mantem()==false) {
		System.out.println("Editando novo salário.");
		this.setSalario(Double.parseDouble(sc.nextLine()));
		System.out.println("Novo salário: " + this.getSalario());
	}
	System.out.println("Funcionário deve trabalhar " + this.getHorasATrabalhar() + " horas por dia.");
	if(mantem()==false) {
		System.out.println("Editando nova carga horária.");
		this.setHorasATrabalhar(Integer.parseInt(sc.nextLine()));
		System.out.println("Agora funcionário deverá trabalhar " + this.getHorasATrabalhar() + ".");
	}
	}
	protected void remove() {
		System.out.println("Tchau, " + this.getNome());
			func[(id-1)]=null;
	}
	protected boolean mantem() {
		System.out.println("Mantenho?");
		Scanner scx=new Scanner(System.in);
		String opc=scx.nextLine();
		if(opc.equals("s")) return true;
		else return false;
}

	protected Funcionario() { }
protected Funcionario (String nome, String departamento, double salario, int horasATrabalhar) {
	id=this.getId()+1;
	func[(id-1)]=new Funcionario();
	//seta instancia corrente (util para diminuir digitação mais pra frente)
	this.setNome(nome);
	this.setDepartamento(departamento);
	this.setSalario(salario);
	this.setHorasATrabalhar(horasATrabalhar);
	//Seta na array de funcionários
	func[(id-1)].setId(id);
	func[(id-1)].setNome(nome);
	func[(id-1)].setDepartamento(departamento);
	func[(id-1)].setSalario(salario);
	func[(id-1)].setHorasATrabalhar(horasATrabalhar);
		System.out.println("Boas vindas são dadas ao novo funcionário " + this.getId() + ", nomeado " + this.getNome());
	}
}