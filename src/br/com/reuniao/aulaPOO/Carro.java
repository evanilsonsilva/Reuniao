package br.com.reuniao.aulaPOO;

public class Carro {

	private String placa;
	private String chassi;
	private String marca;
	private String modelo;
	private int ano;

	public Carro(String placa, String chassi, String marca, String modelo, int ano) {
		super();
		this.placa = placa;
		this.chassi = chassi;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public Carro() {
		super();
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
