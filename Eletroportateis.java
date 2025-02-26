package br.com.poo.projetoFinal.calculadoraDeEnergia;

//Eletroportátil herda de Aparelho e implementa TipoAparelho
public class Eletroportatil extends Aparelho implements TipoAparelho {
	public Eletroportatil() {}

	public Eletroportatil(double potencia, double tempo) {
		super(potencia, tempo);
		}

	@Override
	public double calcularCusto() { // Sobescreve o método da SuperClasse
		return (getPotencia() * getTempo() / 1000) * PRECO_KWH * 1.1; // Taxa extra de 10% para eletroportáteis
		}

	@Override
	public String getTipo() { // Sobescreve o método da Interface
	    return "Eletroportátil";
	   }
}
