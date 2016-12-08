package br.com.alura.java2.sistema;

import br.com.alura.java2.modelos.Tributavel;

public class GerenciadorDeImpostoDeRenda {

	private double total;

    public void adiciona(Tributavel t) {
        System.out.println("Adicionando tributavel: " + t);

        this.total +=  t.calculaTributos();
    }

    public double getTotal() {
        return this.total;
    }
}
