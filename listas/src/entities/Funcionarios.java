package entities;

public class Funcionarios {
	private int id;
	private String nome;
	private double salario;
	public Funcionarios(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	
	public Funcionarios() {
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double aumentarSalario(double percent) {
		double aux = (this.salario * percent);
		aux = (aux/100);
		aux = aux + this.salario;
		
		return aux;
	}


	@Override
	public String toString() {
		return "Funcionarios [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	}
}
