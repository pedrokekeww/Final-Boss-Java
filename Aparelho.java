package br.com.poo.projetoFinal.calculadoraDeEnergia;

public abstract class Aparelho {
	private double potencia; // em Watts
    private double tempo; // em horas
    protected static final double PRECO_KWH = 0.636; // Preço por kWh em SP(2024)

    public Aparelho() {}
    
    public Aparelho(double potencia, double tempo) {
        this.potencia = potencia;
        this.tempo = tempo;
    }
    
    public double getPotencia() {
        return potencia;
    }
    
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    public double getTempo() {
        return tempo;
    }
    
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    
    public abstract double calcularCusto(); // Método abstrato
}
