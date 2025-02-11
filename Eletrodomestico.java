package Projeto;

public class Eletrodomestico extends Eletronico {
	public double Tempo; 	// Em horas
	public double energia;
	public Eletrodomestico (String Name,String Modelo, double Potencia, double Tempo) {
		super(Name, Modelo, Potencia);
		this.Tempo = Tempo;
	} 
	@Override
	public void calcEnergia() {
		energia = Potencia * Tempo;
	}
	public double calcEnergia7() {
		return energia * 7;
	}
	public double calcEnergia30() {
		return energia * 30;
	}
	public double calcEnergia365() {
		return energia * 365;
	}
}
