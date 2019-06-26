package br.com.reuniao.exercicio;

public class Pessoa {

	String nome;
	int idade;
	String rg;
	String cpf;

	public Pessoa() {
	}

	public Pessoa(String nome, int idade, String rg, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
