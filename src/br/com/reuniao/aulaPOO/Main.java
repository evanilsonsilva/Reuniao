package br.com.reuniao.aulaPOO;

public class Main {

	// Conta conta = new Conta();

	public static void main(String[] args) {
		
		Conta contaEvanilson = new Conta();

		Conta contaRodrigo = new Conta(125454, "Rodrigo", 0);
		contaRodrigo.setSaldo(250.35);
		
		System.out.println("nome do titular: " + contaRodrigo.getTitular());
		System.out.println("Saldo: R$ " + contaRodrigo.getSaldo());

	}
}
