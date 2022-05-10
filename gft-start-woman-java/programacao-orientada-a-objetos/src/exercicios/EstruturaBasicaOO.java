package exercicios;

public class EstruturaBasicaOO {

}

class Carro {
	String modelo;
	String cor;
	int capacidadeDoTanque;
	
	Carro(){
		
	}

	Carro(String modelo, String cor, int capacidadeDoTanque) {
		this.modelo = modelo;
		this.cor = cor;
		this.capacidadeDoTanque = capacidadeDoTanque;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getCapacidadeDoTanque() {
		return capacidadeDoTanque;
	}

	public void setCapacidadeDoTanque(int capacidadeDoTanque) {
		this.capacidadeDoTanque = capacidadeDoTanque;
	}
	
	public double valorTanque(double valorGasolina) {
		return capacidadeDoTanque * valorGasolina;
	}
}
