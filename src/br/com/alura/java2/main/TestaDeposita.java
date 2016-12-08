package br.com.alura.java2.main;

import br.com.alura.java2.exception.ValorInvalidoException;
import br.com.alura.java2.modelos.Conta;
import br.com.alura.java2.modelos.ContaCorrente;

public class TestaDeposita {
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente();
		try {
			conta.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.err.println("Erro");
			System.err.println(e.getMessage());
		}
	}
}
