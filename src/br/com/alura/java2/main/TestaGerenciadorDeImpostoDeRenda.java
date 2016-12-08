package br.com.alura.java2.main;

import br.com.alura.java2.exception.ValorInvalidoException;
import br.com.alura.java2.modelos.ContaCorrente;
import br.com.alura.java2.modelos.SeguroDeVida;
import br.com.alura.java2.sistema.GerenciadorDeImpostoDeRenda;

public class TestaGerenciadorDeImpostoDeRenda {
	public static void main(String[] args) {

		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);

		ContaCorrente cc = new ContaCorrente();
		try {
			cc.deposita(1000);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		gerenciador.adiciona(cc);

		System.out.printf("O total é: %.2f", gerenciador.getTotal());
	}
}
