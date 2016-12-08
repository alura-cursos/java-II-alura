package br.com.alura.java2.main;

import br.com.alura.java2.exception.ValorInvalidoException;
import br.com.alura.java2.modelos.ContaCorrente;
import br.com.alura.java2.modelos.Tributavel;

public class TestaTributavel {
	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
        try {
			cc.deposita(100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
        System.out.println(cc.calculaTributos());

        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
	}
}
