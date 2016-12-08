package br.com.alura.java2.main;

import br.com.alura.java2.modelos.ContaCorrente;
import br.com.alura.java2.modelos.SeguroDeVida;
import br.com.alura.java2.sistema.GerenciadorDeImpostoDeRenda;

public class TestaGerenciadorDeImpostoDeRenda {
	public static void main(String[] args) {

		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gerenciador.adiciona(cc);

		System.out.printf("O total é: %.2f", gerenciador.getTotal());
	}
}
