package br.com.poo.projetoFinal.calculadoraDeEnergia;

//Eletrodoméstico herda de Aparelho e implementa TipoAparelho
public class Eletrodomestico extends Aparelho implements TipoAparelho {
	public Eletrodomestico() {}

	public Eletrodomestico(double potencia, double tempo) {
		super(potencia, tempo);
		}

	@Override 
	public double calcularCusto() { // Sobescreve o método da SuperClasse
		return (getPotencia() * getTempo() / 1000) * PRECO_KWH;
		}

	@Override
	public String getTipo() { // Sobescreve o método da interface
		return "Eletrodoméstico";
		}
}
