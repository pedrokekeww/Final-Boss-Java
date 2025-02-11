package Projeto;

public abstract class Eletronico {
	public String Name;			
	public String Modelo;
	public double Potencia;
	
	public Eletronico(String Name, String Modelo, double Potencia) {
		this.Name = Name;
		this.Modelo = Modelo;
		this.Potencia = Potencia;	
	}		
	
	public abstract void calcEnergia();
	public abstract double calcEnergia7();
	public abstract double calcEnergia30();
	public abstract double calcEnergia365();
}
