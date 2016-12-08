package br.com.alura.java2.interfaces;

public class Circulo implements AreaCalculavel {

	private double raio;
	
	public Circulo(int raio) {
		this.raio = raio;
	}
	
	@Override
	public double calculaArea() {
		return Math.PI * (this.raio * this.raio);
	}

}
