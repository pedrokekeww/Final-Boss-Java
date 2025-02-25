package br.com.projeto.calc3000;

public abstract class Aparelho {
    private double potencia; // em Watts
    private double tempo; // em horas
    protected static final double PRECO_KWH = 0.80; // Preço por kWh (exemplo)

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
