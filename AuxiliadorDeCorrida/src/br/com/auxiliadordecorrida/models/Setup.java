package br.com.auxiliadordecorrida.models;

public class Setup {

	private double pressaoIdeal;
	private double dianteiroEsquerdo;
	private double dianteiroDireito;
	private double traseiroEsquerdo;
	private double traseiroDireito;
	private double temperaturaAmbiente;
	private double temperaturaPista;

	public Setup(double pressaoIdeal, double dianteiroEsquerdo, double dianteiroDireito, double traseiroEsquerdo,
			double traseiroDireito, double temperaturaAmbiente, double temperaturaPista) {
		super();
		this.pressaoIdeal = pressaoIdeal;
		this.dianteiroEsquerdo = dianteiroEsquerdo;
		this.dianteiroDireito = dianteiroDireito;
		this.traseiroEsquerdo = traseiroEsquerdo;
		this.traseiroDireito = traseiroDireito;
		this.temperaturaAmbiente = temperaturaAmbiente;
		this.temperaturaPista = temperaturaPista;
	}

	public double getPressaoIdeal() {
		return pressaoIdeal;
		
	}
	public double getDianteiroEsquerdo() {
		return dianteiroEsquerdo;
	}

	public double getDianteiroDireito() {
		return dianteiroDireito;
	}

	public double getTraseiroEsquerdo() {
		return traseiroEsquerdo;
	}

	public double getTraseiroDireito() {
		return traseiroDireito;
	}

	public double getTemperaturaAmbiente() {
		return temperaturaAmbiente;
	}

	public double getTemperaturaPista() {
		return temperaturaPista;
	}
}
