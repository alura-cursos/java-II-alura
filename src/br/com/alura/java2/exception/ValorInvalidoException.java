package br.com.alura.java2.exception;

@SuppressWarnings("serial")
public class ValorInvalidoException extends RuntimeException{

	public ValorInvalidoException(double valor) {
		super("Valor inválido: " + valor);
	}

}
